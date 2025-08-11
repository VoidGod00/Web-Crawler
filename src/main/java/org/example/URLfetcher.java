package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.util.HashSet;
import java.util.Set;

public class URLfetcher {
    public Set<String> fetchURL(String url){
        Set<String> Links = new HashSet<>();
        Document documents=null;
        try{
            documents=Jsoup.connect(url).timeout(50000).get();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
        System.out.println(documents.text());
        Elements anchortags = documents.select("a[href]");
        for(Element link:anchortags){
            String extractedURL = link.absUrl("href");
            if(!extractedURL.isEmpty()){
                Links.add(extractedURL);
                System.out.println(Links);
            }

        }
        return Links;
    }
}
