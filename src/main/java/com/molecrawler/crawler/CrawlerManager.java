package com.molecrawler.crawler;

import com.molecrawler.crawler.core.CrawlerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created Classe que gerencia os Crawlers, criando e Inciando os Crawlers..
 */
public class CrawlerManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(CrawlerManager.class);
    public Map<String, CrawlerContext> crawlers = new HashMap<>();

    public CrawlerContext startCrawlers(String crawlerID) {
        if (!crawlers.containsKey(crawlerID)) {
            throw new IllegalArgumentException("Crawler ID not found: " + crawlerID);
        }
        CrawlerContext crawlerContext = crawlers.get(crawlerID);
        crawlerContext.getCrawler().startAsync();
        return crawlerContext;
    }

    public CrawlerContext createCrawler(String crawlerID ) {

    }
}
