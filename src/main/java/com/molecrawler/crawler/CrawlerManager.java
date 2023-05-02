package com.molecrawler.crawler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created Classe que gerencia os Crawlers, criando, verificando performance, Inciando os Crawlers etc..
 */
public class CrawlerManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(CrawlerManager.class);
    public Map<String, CrawlerContext> crawlers = new HashMap<>();


    public CrawlerContext startCrawlers(String crawlerID) {
        if (!crawlers.containsKey(crawlerID)) {
            throw new IllegalArgumentException("Crawler ID not found: " + crawlerID);
        }
        CrawlerContext crawlerContext = crawlers.get(crawlerID);

        return 
    }

}
