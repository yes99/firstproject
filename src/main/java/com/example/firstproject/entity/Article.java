package com.example.firstproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Article {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String date;
    @Column
    private String title;
    @Column
    private String assign;
    @Column
    private String perform;
    @Column
    private String fail;


    public Article(Long id, String date, String title, String assign, String perform, String fail) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.assign = assign;
        this.perform = perform;
        this.fail = fail;
    }

    @Override
    public String  toString() {
        return "Article{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", title='" + title + '\'' +
                ", assign='" + assign + '\'' +
                ", perform='" + perform + '\'' +
                ", fail='" + fail + '\'' +
                '}';
    }
}
