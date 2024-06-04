package lab_10.Task_4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class NewsParser {
    public static void main(String[] args) {
        int maxRetries = 3;

        int retries;
        for (retries = 0; retries < maxRetries; retries++) {
            try {
                Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();

                Elements newsParent = doc.select("body > table > tbody > tr > td > div > table > " +
                        "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                        "tr > td:nth-child(1)");

                BufferedWriter writer = new BufferedWriter(new FileWriter("src/lab_10/Task_4/news.txt"));

                for (int i = 3; i < 20; i++) {
                    if (!(i % 2 == 0)) {
                        List<Node> nodes = newsParent.get(0).childNodes();
                        String theme = ((Element) nodes.get(i))
                                .getElementsByClass("blocktitle")
                                .get(0).childNodes().get(0).toString();
                        String date = ((Element) nodes.get(i))
                                .getElementsByClass("blockdate")
                                .get(0).childNodes().get(0).toString();
                        String newsInfo = "Тема: " + theme + "\nДата: " + date + "\n\n";
                        writer.write(newsInfo);
                        System.out.println(newsInfo);
                    }
                }
                writer.close();
                break;
            } catch (IOException e) {
                System.err.println("Ошибка при получении HTML-кода страницы: " + e.getMessage());
                if (retries+1 < maxRetries) {
                    System.out.println("Повторная попытка подключения...");
                }
            }
        }

        if (retries == maxRetries) {
            System.err.println("Не удалось подключиться к странице после " + maxRetries + " попыток.");
        }
    }
}
