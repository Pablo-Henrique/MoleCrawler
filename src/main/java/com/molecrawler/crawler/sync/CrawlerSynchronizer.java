package com.molecrawler.crawler.sync;

import com.google.common.util.concurrent.AbstractExecutionThreadService;
import com.molecrawler.crawler.link.LinkStorage;

public class CrawlerSynchronizer extends AbstractExecutionThreadService {

    private LinkStorage linkStorage;

    public CrawlerSynchronizer(LinkStorage linkStorage) {
        this.linkStorage = linkStorage;
    }

    @Override
    protected void run() throws Exception {
        while (isRunning()) {
            try {
                LinkRelevance links = linkStorage.selectLink();
            }catch () {

            }
        }
    }
}