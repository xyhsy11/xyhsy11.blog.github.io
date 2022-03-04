import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo {
    public static void main(String[] args) throws IOException {
        String path = JsoupDemo.class.getClassLoader().getResource("students.xml").getPath();
        Document dom = Jsoup.parse(new File(path),"utf-8");
        Elements elements = dom.getElementsByTag("students");
        Element element = elements.get(0);

        System.out.println(elements.text());



    }
}
