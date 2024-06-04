package lab_10.Task_2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XmlParser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            File xmlFile = new File("src/lab_10/Task_2/task_2.xml");
            File xslFile = new File("src/lab_10/Task_2/Prettyprint.xsl");

            Document doc = readXml(xmlFile);
            assert doc != null;
            Element rootElement = doc.getDocumentElement();

            boolean start = true;
            int choice;
            while (start) {
                System.out.println("""
                \n==============================
                Выберите действие:
                \t1 - Добавить книгу;
                \t2 - Поиск по автору или году издания;
                \t3 - Удалить книгу;
                \t4 - Вывести на экран;
                \t0 - Выход.
                ==============================
                        """);
                System.out.print("Ваш выбор: ");
                choice = in.nextInt();
                in.nextLine();
                System.out.println();

                switch (choice) {
                    case 0:
                        System.out.println("Выход");
                        start = false;
                        break;
                    case 1:
                        addNewBook(doc, rootElement);
                        updateXMLFile(doc, xmlFile, xslFile);
                        break;
                    case 2:
                        System.out.print("Введите критерий поиска: ");
                        search(doc, in.nextLine());
                        break;
                    case 3:
                        System.out.print("Введите название книги для удаления: ");
                        removeBook(doc, in.nextLine());
                        updateXMLFile(doc, xmlFile, xslFile);
                        break;
                    case 4:
                        display(doc);
                        break;
                    default:
                        System.out.println("Неверный код команды.\n");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            in.close();
        }
    }

    private static void addNewBook(Document doc, Element rootElement) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название новой книги:");
        String title = in. nextLine();
        System.out.println("Введите автора новой книги:");
        String author = in.nextLine();
        System.out.println("Введите год издания новой книги:");
        String year = in.nextLine();

        Element newBook = doc.createElement("book");

        Element newTitle = doc.createElement("title");
        newTitle.appendChild(doc.createTextNode(title));
        newBook.appendChild(newTitle);

        Element newAuthor = doc.createElement("author");
        newAuthor.appendChild(doc.createTextNode(author));
        newBook.appendChild(newAuthor);

        Element newYear = doc.createElement("year");
        newYear.appendChild(doc.createTextNode(year));
        newBook.appendChild(newYear);

        rootElement.appendChild(newBook);
    }

    private static void search(Document doc, String pattern) {
        NodeList nodeList = doc.getElementsByTagName("book");
        List<Element> books = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String author = element.getElementsByTagName("author").item(0).getTextContent();
                String year = element.getElementsByTagName("year").item(0).getTextContent();
                if (author.equalsIgnoreCase(pattern) || year.equals(pattern)) {
                    books.add(element);
                }
            }
        }

        if (books.isEmpty()) {
            System.out.println("\nКниги с таким автором или годом издания не найдены.");
        } else {
            System.out.println("\nНайденные книги:");
            for (Element book : books) {
                System.out.println("\tНазвание книги: " + book.getElementsByTagName("title").item(0).getTextContent());
                System.out.println("\tАвтор: " + book.getElementsByTagName("author").item(0).getTextContent());
                System.out.println("\tГод издания: " + book.getElementsByTagName("year").item(0).getTextContent());
                System.out.println();
            }
        }
    }

    private static void removeBook(Document doc, String pattern) {
        NodeList nodeList = doc.getElementsByTagName("book");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String bookTitle = element.getElementsByTagName("title").item(0).getTextContent();
                if (bookTitle.equalsIgnoreCase(pattern)) {
                    node.getParentNode().removeChild(node);
                    System.out.println("Книга успешно удалена.");
                    break;
                }
            }
        }
    }

    private static Document readXml(File xmlFile) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            return doc;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void updateXMLFile(Document doc, File xmlFile, File xslFile) {
        try {
            StringBuilder content = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(xslFile));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer(new StreamSource(new StringReader(content.toString())));
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(xmlFile);
            transformer.transform(source, result);

            System.out.println("XML-файл успешно обновлен!");
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void display(Document doc) {
        System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
        NodeList nodeList = doc.getElementsByTagName("book");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            System.out.println("\n\tТекущий элемент: " + node.getNodeName());
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.println("\t\tНазвание книги: " + element.getElementsByTagName("title").item(0).getTextContent());
                System.out.println("\t\tАвтор: " + element.getElementsByTagName("author").item(0).getTextContent());
                System.out.println("\t\tГод издания: " + element.getElementsByTagName("year").item(0).getTextContent());
            }
        }
    }
}