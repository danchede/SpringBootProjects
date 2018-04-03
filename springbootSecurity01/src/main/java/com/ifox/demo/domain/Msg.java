package com.ifox.demo.domain;

public class Msg {
    private String title;
    private String content;
    private String exraInfo;

    public Msg() {
    }

    public Msg(String title, String content, String exraInfo) {
        this.title = title;
        this.content = content;
        this.exraInfo = exraInfo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExraInfo() {
        return exraInfo;
    }

    public void setExraInfo(String exraInfo) {
        this.exraInfo = exraInfo;
    }
}
