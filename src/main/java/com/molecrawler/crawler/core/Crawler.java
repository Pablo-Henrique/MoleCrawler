package com.molecrawler.crawler.core;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Crawler {

    private final static Logger LOGGER = LoggerFactory.getLogger(Crawler.class);
    private CrawlerParams params;

    public Crawler() {
    }

    public Crawler(CrawlerParams params) {
        this.params = params;
    }

    public List<String> linkCollector() {
        try {
            Document document = Jsoup.connect(params.seedStart()).get();
            Elements links = document.select("a[href]");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
