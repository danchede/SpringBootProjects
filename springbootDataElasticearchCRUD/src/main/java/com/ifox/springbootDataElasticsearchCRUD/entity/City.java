package com.ifox.springbootDataElasticsearchCRUD.entity;


import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@Document(indexName = "province",type = "city")
public class City implements Serializable {
    private static final long serialVersionUID = -1L;
    private Long id;
    private String name;
    private String description;
    private Integer score;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
