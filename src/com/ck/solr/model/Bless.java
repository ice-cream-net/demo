package com.ck.solr.model;

import java.util.Date;

public class Bless {
    private Integer id;

    private String bless_content;

    private Date bless_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBless_content() {
        return bless_content;
    }

    public void setBless_content(String bless_content) {
        this.bless_content = bless_content == null ? null : bless_content.trim();
    }

    public Date getBless_time() {
        return bless_time;
    }

    public void setBless_time(Date bless_time) {
        this.bless_time = bless_time;
    }
}