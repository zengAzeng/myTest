package com.spider.music;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: 顾沐
 * Date: 2020/3/9
 * Time: 17:56
 * Function:
 */
public class spiderMusic {


    public static void main(String[] args) throws IOException {
        String path="http://image.baidu.com/";
        String nextPage="";
        spiderData(path);
    }

    //爬取数据
    public static void spiderData(String path) throws IOException {
        Document document = Jsoup.connect(path).get();

        System.out.println(document);
    }
}
