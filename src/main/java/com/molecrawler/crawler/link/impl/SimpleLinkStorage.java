package com.molecrawler.crawler.link.impl;

import com.molecrawler.crawler.exception.DataNotFoundException;
import com.molecrawler.crawler.link.LinkRelevance;
import com.molecrawler.crawler.link.LinkStorage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class SimpleLinkStorage implements LinkStorage {
    private static final Logger LOGGER = LoggerFactory.getLogger(LinkStorage.class);
    private final List<LinkRelevance> links = new ArrayList<>();

    @Override
    public synchronized void add(LinkRelevance link) {
        links.add(link);
        LOGGER.info("Link foi adicionado ao storage de links Relevantes LinkAdd: " + link);
    }

    @Override
    public boolean hasPendingLink() {
        return links.isEmpty();
    }

    @Override
    public synchronized LinkRelevance select() {
        if (links.isEmpty()) {
            throw new DataNotFoundException("No more links available in the storage.");
        } else {
            for (LinkRelevance relevance : links) {
                return relevance;
            }
        }
        return null;
    }

    @Override
    public synchronized List<LinkRelevance> select(int limit) {
        List<LinkRelevance> selected = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            try {
                selected.add(select());
            } catch (DataNotFoundException e) {
                break;
            }
        }
        return selected;
    }

    @Override
    public synchronized int count() {
        return 0;
    }

    @Override
    public synchronized void addAll(List<String> urls) {
        LinkStorage.super.addAll(urls);
    }
}
