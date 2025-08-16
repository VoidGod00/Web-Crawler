🚀 Project Title & Tagline
================================

**Project Title:** WebCrawler
**Tagline:** A simple web crawler written in Java using Spring Boot and Maven

📖 Description
================================

The WebCrawler project is a sample implementation of a web crawler using Java, Spring Boot, and Maven. It crawls a given URL, extracts links, and stores them in a database. The project uses multi-threading to speed up the crawling process. The crawler also checks if a URL has been visited before to avoid infinite loops and to improve performance.

The project is designed to be modular, with separate classes for URL fetching, URL storing, and crawling. This makes it easy to extend and modify the crawler for specific use cases.

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

**Build**: Run the command `mvn package` in the project directory to build the project.

**Deploy**: Run the command `java -jar target/web-crawler.jar` to start the crawler.

🧪 Testing Instructions
================================

To test the crawler, follow these steps:

1. Start the crawler by running the command `java -jar target/web-crawler.jar`.
2. Open a web browser and navigate to the URL `http://localhost:8080/crawl`. This will start the crawling process.
3. Monitor the crawling process by checking the console output. You should see URLs being crawled and links being extracted.
4. Once the crawling process is complete, you can stop the crawler by pressing `Ctrl+C` in the command line.

📸 Screenshots
================================

[Insert screenshots of the crawler in action, or use placeholders if needed]

📦 API Reference
================================

The crawler exposes a simple REST API for crawling and retrieving crawled data. You can access the API by sending HTTP requests to `http://localhost:8080`.

* **GET /crawl**: Starts the crawling process.
* **GET /crawl-status**: Returns the current crawling status.
* **GET /crawl-data**: Returns the crawled data in JSON format.

👤 Author
================================

This project was created by Sahil Niazi.

📝 License
================================

This project is licensed under the MIT License. See `LICENSE` for details.
