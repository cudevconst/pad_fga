package com.example.mobifonev2.Logging;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "check_log")
public class Logging {

    @Id
    private Integer id;
    private String ip;
    private String username;
    private Date date_log;

    public Logging() {
    }

    public Logging(Integer id, String ip, String username, Date date_log) {
        this.id = id;
        this.ip = ip;
        this.username = username;
        this.date_log = date_log;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate_log() {
        return date_log;
    }

    public void setDate_log(Date date_log) {
        this.date_log = date_log;
    }
}
