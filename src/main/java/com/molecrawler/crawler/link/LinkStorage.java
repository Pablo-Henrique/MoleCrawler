package com.molecrawler.crawler.link;

import com.molecrawler.crawler.link.impl.LinkRelevanceClassifier;

import java.util.List;

public interface LinkStorage {

    void add(LinkRelevance link);

    LinkRelevance select();

    List<LinkRelevance> select(int limit);

    boolean hasPendingLink();

    int count();

    default void addAll(List<String> urls) {
        for (String urlSingle : urls) {
            add(new LinkRelevanceClassifier(urlSingle, 0));
        }
    }

}
