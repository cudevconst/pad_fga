package com.example.mobifonev2.Logging;

public class LoggingReport {
    private String username;
    private Integer count;

    public LoggingReport() {
    }

    public LoggingReport(String username, Integer count) {
        this.username = username;
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LoggingReport(String username) {
        this.username = username;
    }
}
