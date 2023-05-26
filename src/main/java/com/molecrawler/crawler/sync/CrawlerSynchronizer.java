package com.molecrawler.crawler.sync;

import com.google.common.util.concurrent.AbstractExecutionThreadService;
import com.molecrawler.crawler.core.Crawler;
import com.molecrawler.crawler.exception.DataNotFoundException;
import com.molecrawler.crawler.link.LinkRelevance;
import com.molecrawler.crawler.link.LinkStorage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrawlerSynchronizer extends AbstractExecutionThreadService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CrawlerSynchronizer.class);
    private final LinkStorage linkStorage;
    private Crawler crawler;

    public CrawlerSynchronizer(LinkStorage linkStorage) {
        this.linkStorage = linkStorage;
    }

    @Override
    protected void run() throws Exception {
        while (isRunning()) {
            try {
                LinkRelevance relevance = linkStorage.select();
                if (relevance != null) {

                } else {
                    LOGGER.info("Sem link relevante: " + relevance);
                }
            } catch (DataNotFoundException exception) {
                if (!linkStorage.hasPendingLink()) {
                    LOGGER.info("LinkStorage ficou sem links, interrompendo crawlers.");
                    stopAsync();
                    break;
                }

                LOGGER.info("Aguardando novos links no Storage.", exception);
                Thread.sleep(500);
            } catch (Exception e) {
                LOGGER.atTrace().addArgument(e).log();
            }
        }
    }
}