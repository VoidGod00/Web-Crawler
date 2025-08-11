package org.example;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

public class URLstore {
    private ConcurrentHashMap<String,Boolean> VisitedURL = new ConcurrentHashMap<>();
    private BlockingQueue<String> URL = new LinkedBlockingQueue<>();

    public boolean getURL(String url){
        if(VisitedURL.putIfAbsent(url,true) == null){
            URL.offer(url);
            return true;
        }
        return false;
    }
    public String getNextURL() throws InterruptedException{
        return URL.poll();
    }
    public boolean isQueueEmpty(){
        return URL.isEmpty();
    }
}
