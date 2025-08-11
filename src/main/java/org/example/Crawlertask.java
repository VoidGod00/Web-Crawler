package org.example;

import java.util.Set;
import java.util.concurrent.Phaser;

public class Crawlertask implements Runnable {
    private final URLstore urlstore;
    private final URLfetcher urlfetcher;
    private final int maxDepth;
    private final int currDepth;
    private final Phaser phaser;

    public Crawlertask(URLstore urlstore, URLfetcher urlfetcher, int maxDepth, int currDepth, Phaser phaser) {
        this.urlstore = urlstore;
        this.urlfetcher = urlfetcher;
        this.maxDepth = maxDepth;
        this.currDepth = currDepth;
        this.phaser = phaser;
    }

    @Override
    public void run() {
        try{
            String url = urlstore.getNextURL();
            System.out.println(Thread.currentThread().getName()+" "+url);
            if(url==null || currDepth>maxDepth) return;

            Set<String> links = urlfetcher.fetchURL(url);
            for(String link : links){
                if(urlstore.getURL(link)){
                    phaser.register();
                    Webcrawler.Submittask(urlstore,urlfetcher,currDepth+1,maxDepth);
                }
            }
        }catch(Exception e){
            System.out.println("Error occured!!");
        }finally{
            phaser.arriveAndDeregister();
        }
    }

}
