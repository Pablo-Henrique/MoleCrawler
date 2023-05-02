package com.molecrawler.crawler.sync;

import com.google.common.util.concurrent.AbstractService;
import com.google.common.util.concurrent.Service;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorThreadService implements Service {

    private final Service delegate = new AbstractService() {
        @Override
        protected void doStart() {

        }

        @Override
        protected void doStop() {

        }
    }

    @Override
    public Service startAsync() {
        return null;
    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public State state() {
        return null;
    }

    @Override
    public Service stopAsync() {
        return delegate.stopAsync();
    }

    @Override
    public void awaitRunning() {

    }

    @Override
    public void awaitRunning(long l, TimeUnit timeUnit) throws TimeoutException {

    }

    @Override
    public void awaitTerminated() {

    }

    @Override
    public void awaitTerminated(long l, TimeUnit timeUnit) throws TimeoutException {

    }

    @Override
    public Throwable failureCause() {
        return null;
    }

    @Override
    public void addListener(Listener listener, Executor executor) {

    }
}
