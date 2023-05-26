package com.molecrawler.crawler.link.impl;

import com.molecrawler.crawler.link.LinkRelevance;

public class LinkRelevanceClassifier implements LinkRelevance, Comparable<LinkRelevanceClassifier> {

    private static final int DEFAULT_VALUE_CLASSIFIER = 10;
    private String url;
    private int classifier;
    private int priority;

    public LinkRelevanceClassifier(String url, int classifier, int priority) {
        this.url = url;
        this.classifier = classifier;
        this.priority = priority;
    }

    public LinkRelevanceClassifier(String url, int classifier) {
        this(new )
    }

    @Override
    public int compareTo(LinkRelevanceClassifier other) {
        return Integer.compare(other.classifier, this.classifier);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getClassifier() {
        return classifier;
    }

    public void setClassifier(int classifier) {
        this.classifier = classifier;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
