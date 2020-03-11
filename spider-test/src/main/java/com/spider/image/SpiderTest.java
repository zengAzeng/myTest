package com.spider.image;

import com.spider.SpiderDemo;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: 顾沐
 * Date: 2020/3/6
 * Time: 1:08
 * Function:
 */
public class SpiderTest {

    public static void main(String[] args) throws IOException {
        String netUrl="https://www.tupianzj.com/meinv/mm/baiximeinv/";
        String localSavePath="C:\\Users\\hhh\\Desktop\\image\\";
        String tag=".d1 img";
        String tagAttr="src";
        String nextPageTag="next";
        String netHeader="";
        String srcHttp="";
        //创建爬取类
        SpiderDemo spiderDemo = new SpiderDemo(netUrl,localSavePath,tag,tagAttr,nextPageTag,netHeader,srcHttp);
        spiderDemo.spiderData(".jpg", true);
    }
}
