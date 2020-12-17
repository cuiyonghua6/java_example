package org.example;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class duanzi {
    public static void main(String[] args) throws IOException {
        Connection doc = Jsoup.connect("http://www.nows.fun/")
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.108 Safari/537.36");

        Element element = doc.get().select("span[id=sentence]").get(0);
        String text1 = element.text();
        System.out.println(text1);
//        System.out.println();
//        System.out.println("hello");
//        System.out.println("eho");
//        System.out.println("hellllllllll");



    }
}
