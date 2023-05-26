package com.molecrawler.crawler.core;

import com.molecrawler.crawler.enums.CrawlerJob;

import java.util.List;

public class CrawlerParams {

    private CrawlerJob crawlerJob;
    private List<String> startSeeds;
    private String beforeSeed;
    private String afterSeed;

    public CrawlerParams(CrawlerJob crawlerJob, List<String> startSeeds, String beforeSeed, String afterSeed) {
        this.crawlerJob = crawlerJob;
        this.startSeeds = startSeeds;
        this.beforeSeed = beforeSeed;
        this.afterSeed = afterSeed;
    }

    public CrawlerParams(CrawlerJob crawlerJob, List<String> startSeeds) {
        this.crawlerJob = crawlerJob;
        this.startSeeds = startSeeds;
    }

    public CrawlerParams() {
    }

    public String seedStart() {
        if (!startSeeds.isEmpty()) {
            for (String seed : startSeeds) {
                return seed;
            }
        }
        return null;
    }

    public CrawlerJob getCrawlerJob() {
        return crawlerJob;
    }

    public void setCrawlerJob(CrawlerJob crawlerJob) {
        this.crawlerJob = crawlerJob;
    }

    public List<String> getStartSeeds() {
        return startSeeds;
    }

    public void setStartSeeds(List<String> startSeeds) {
        this.startSeeds = startSeeds;
    }

    public String getBeforeSeed() {
        return beforeSeed;
    }

    public void setBeforeSeed(String beforeSeed) {
        this.beforeSeed = beforeSeed;
    }

    public String getAfterSeed() {
        return afterSeed;
    }

    public void setAfterSeed(String afterSeed) {
        this.afterSeed = afterSeed;
    }
}
