package com.molecrawler.crawler;

import org.jsoup.nodes.Document;
import org.openqa.selenium.WebDriver;

public class CrawlerContext {

    private WebDriver driver;
    private Document document;


    public CrawlerContext(WebDriver driver, Document document) {
        this.driver = driver;
        this.document = document;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
