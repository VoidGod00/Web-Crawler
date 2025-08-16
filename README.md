🚀 Project Title & Tagline
================================

**Project Title:** WebCrawler
**Tagline:** A simple web crawler written in Java using Spring Boot and Maven

📖 Description
================================

The WebCrawler project is a sample implementation of a web crawler using Java, Spring Boot, and Maven. It crawls a given URL, extracts links, and stores them in a database. The project uses multi-threading to speed up the crawling process. The crawler also checks if a URL has been visited before to avoid infinite loops and to improve performance.

The project is designed to be modular, with separate classes for URL fetching, URL storing, and crawling. This makes it easy to extend and modify the crawler for specific use cases.

this github repository contain the source code and the executable file named 'web_crawler.jar' in the app folder that can be used to run this project as a standalone program.

✨ Features
================================

1. **Multi-threading**: The crawler uses multiple threads to fetch URLs concurrently, making it faster and more efficient.
2. **URL Storage**: The crawler stores visited URLs in a ConcurrentHashMap to avoid revisiting the same URL multiple times.
3. **Link Extraction**: The crawler extracts links from HTML pages using the Jsoup library.
4. **Crawl Control**: The crawler checks if a URL has been visited before and skips it if it has.
5. **Customizable**: The crawler can be easily customized to crawl specific websites or to extract specific data.
6. **Error Handling**: The crawler handles errors and exceptions gracefully, ensuring that the crawling process continues even if some URLs are not accessible.
7. **Database Integration**: The crawler stores visited URLs in a database, making it easy to track and analyze crawled data.
8. **Command-Line Interface**: The crawler can be run from the command line, making it easy to schedule and automate crawling tasks.

🧰 Tech Stack
================================

| Technology | Version |
| --- | --- |
| Java | 1.8 |
| Spring Boot | 2.5.6 |
| Maven | 3.6.3 |
| Jsoup | 1.14.3 |

📁 Project Structure
================================

```
web-crawler/
src/
main/
java/
org/example/
Webcrawler.java
Main.java
Crawlertask.java
URLstore.java
URLfetcher.java
resources/
application.properties
pom.xml
test/
java/
org/example/
...
```

⚙️ How to Run
================================

**Setup**: Install Java and Maven on your machine. Download the project from GitHub and extract it to a directory of your choice.

**Environment**: Make sure you have a Java Development Kit (JDK) installed on your machine. You can check your JDK version by running `java -version` in the command line.

**Build and Run**: Run the program by downloading 'Web_crawler.jar' in the app folder and give input of about depth, how many thread to use and the URL of the targeted website.


🧪 Testing Instructions
================================

To test the crawler, follow these steps:

1. Start the crawler by running 'Web_crawler.jar' file and give any website URLs to test the program.
2. Monitor the crawling process by checking the console output. You should see URLs being crawled and links being extracted.
3. Once the crawling process is complete, you can stop the crawler by pressing `Ctrl+C` in the command line.

📸 Screenshots
================================


<img width="2560" height="1440" alt="Screenshot (76)" src="https://github.com/user-attachments/assets/dadefe2f-c64a-4a28-905f-d2fec387e4fd" />


👤 Author
================================

This project was created by Sahil Niazi.

📝 License
================================

This project is licensed under the MIT License. See `LICENSE` for details.
