package spider;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: 顾沐
 * Date: 2020/3/6
 * Time: 13:34
 * Function:
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String netUrl="http://sc.chinaz.com/tupian/ribenmeinv.html";
        Document document = Jsoup.connect(netUrl).get();
        System.out.println(document.select("img"));

    }
}
