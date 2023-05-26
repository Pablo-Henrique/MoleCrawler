package com.molecrawler.crawler.exception;

public class DataNotFoundException extends RuntimeException {
    private boolean ranOutOfLinks;

    public DataNotFoundException(String message) {
        super(message);
    }

    public boolean ranOutOfLinks() {
        return ranOutOfLinks;
    }

    public void setRanOutOfLinks(boolean ranOutOfLinks) {
        this.ranOutOfLinks = ranOutOfLinks;
    }
}
