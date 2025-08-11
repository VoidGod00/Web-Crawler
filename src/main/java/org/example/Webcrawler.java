package org.example;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;

public class Webcrawler {
    private static Phaser phaser; //it stores the value that how many url as pass through and is executed
    private static ExecutorService executorservice; //it allows us to not create unnecessary thread in the program

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter url:");
        String url = scanner.nextLine();

        System.out.println("Enter depth:");
        final int depth = scanner.nextInt();
        System.out.println("Enter the number of threads:");
        final int threads = scanner.nextInt();

        URLstore urlstore = new URLstore();
        URLfetcher urlfetcher = new URLfetcher();
        phaser = new Phaser(1);
        executorservice = Executors.newFixedThreadPool(threads);

        urlstore.getURL(url);

        long start=System.currentTimeMillis();

        Submittask(urlstore,urlfetcher,0,depth);

        phaser.awaitAdvance(phaser.getPhase());

        executorservice.shutdown();
        System.out.println("time taken :  "+(System.currentTimeMillis()-start));
    }

    public static void Submittask(URLstore urlstore, URLfetcher urlfetcher, int currdepth, int maxDepth) {
        executorservice.submit(new Crawlertask(urlstore,urlfetcher,maxDepth,currdepth,phaser));

    }
}
