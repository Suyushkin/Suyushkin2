package lab_10.Task_3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Scanner;

public class JsonParser {
    private Path path;

    JsonParser(String path) {
        this.path = Path.of(path);
        if (Files.notExists(this.path) || new File(this.path.toString()).length() == 0) {
            JSONObject init = new JSONObject();
            init.put("books", new JSONArray());
            try (FileWriter file = new FileWriter(path.toString())) {
                file.write(init.toJSONString());
                System.out.println("Json файл успешно создан!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String path = "src/lab_10/Task_3/task_3.json";
        JsonParser parser = new JsonParser(path);
        Scanner in = new Scanner(System.in);

        try {
            JSONObject json = parser.loadJsonFromFile();
            assert json != null;

            boolean start = true;
            int choice;
            while (start) {
                System.out.println("""
                \n==============================
                Выберите действие:
                \t1 - Добавить книгу;
                \t2 - Поиск по автору;
                \t3 - Удалить книгу;
                \t4 - Вывести на экран;
                \t0 - Выход.
                ==============================
                """);
                System.out.print("Ваш выбор: ");
                if (!in.hasNextInt()) {
                    System.out.println("Неверный формат ввода");
                    in.next();
                    continue;
                }
                choice = in.nextInt();
                in.nextLine();
                System.out.println();

                switch (choice) {
                    case 0:
                        System.out.println("Выход");
                        start = false;
                        break;
                    case 1:
                        parser.addBook(json);
                        parser.saveJsonToFile(json);
                        break;
                    case 2:
                        System.out.print("Введите критерий поиска: ");
                        parser.searchBooksByAuthor(json, in.nextLine());
                        break;
                    case 3:
                        System.out.print("Введите название книги для удаления: ");
                        parser.deleteBookByTitle(json, in.nextLine());
                        parser.saveJsonToFile(json);
                        break;
                    case 4:
                        parser.display(json);
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

    private JSONObject loadJsonFromFile() {
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(this.path.toString())) {
            return (JSONObject) parser.parse(reader);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void saveJsonToFile(JSONObject json) {
        try (FileWriter file = new FileWriter(this.path.toString())) {
            file.write(json.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void searchBooksByAuthor(JSONObject json, String author) {
        JSONArray jsonArray = (JSONArray) json.get("books");
        jsonArray.stream()
                .filter(book -> book instanceof JSONObject)
                .map(book -> (JSONObject) book)
                .filter(book -> author.equals(((JSONObject) book).get("author")))
                .forEach(book -> {
                    System.out.println("\nНайдена книга:");
                    System.out.println("Название книги: " + ((JSONObject) book).get("title"));
                    System.out.println("Автор: " + ((JSONObject) book).get("author"));
                    System.out.println("Год издания: " + ((JSONObject) book).get("year"));
                });
    }

    private void addBook(JSONObject json) {
        Scanner in = new Scanner(System.in);
        JSONObject book = new JSONObject();
        JSONArray jsonArray = (JSONArray) json.get("books");
        System.out.println("Введите название новой книги:");
        book.put("title", in.nextLine());
        System.out.println("Введите автора новой книги:");
        book.put("author", in.nextLine());
        System.out.println("Введите год издания новой книги:");
        book.put("year", in.nextInt());

        jsonArray.add(book);
        System.out.println("\nНовая книга успешно добавлена.");
    }

    private void deleteBookByTitle(JSONObject json, String title) {
        JSONArray jsonArray = (JSONArray) json.get("books");
        Iterator iterator = jsonArray.iterator();
        while (iterator.hasNext()) {
            JSONObject book = (JSONObject) iterator.next();
            if (title.equals(book.get("title"))) {
                iterator.remove();
                System.out.println("\nКнига \"" + title + "\" успешно удалена.");
                return;
            }
        }
        System.out.println("\nКнига с названием \"" + title + "\" не найдена.");
    }

    private void display(JSONObject json) {
        try {
            System.out.println("Корневой элемент: " + json.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) json.get("books");

            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("\n\tТекущий элемент: book");
                System.out.println("\t\tНазвание книги: " + book.get("title"));
                System.out.println("\t\tАвтор: " + book.get("author"));
                System.out.println("\t\tГод издания: " + book.get("year"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
