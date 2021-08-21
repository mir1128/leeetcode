package com.looboo.algorithm.utils;

import java.time.Duration;
import java.time.Instant;

public class StopWatch {
    private Instant start;

    public static StopWatch startWatch() {
        return new StopWatch().start();
    }

    private StopWatch start() {
        this.start = Instant.now();
        return this;
    }

    public long stop() {
        if (start == null) {
            throw new RuntimeException("not start yet.");
        }

        Instant now = Instant.now();
        long duration = Duration.between(start, now).toMillis();
        System.out.printf("start at: %s, stop at %s, cost: %s%n", start, now, duration);
        return duration;
    }
}
