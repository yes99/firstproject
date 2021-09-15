package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;

public class ArticleForm {

    private String date;
    private String title;
    private String assign;
    private String perform;
    private String fail;

    public String getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getAssign() {
        return assign;
    }

    public String getPerform() {
        return perform;
    }

    public String getFail() {
        return fail;
    }

    public ArticleForm(String date, String title, String assign, String perform, String fail) {
        this.date = date;
        this.title = title;
        this.assign = assign;
        this.perform = perform;
        this.fail = fail;
    }

    @Override
    public String toString() {
        return "ArticleForm{" +
                "date='" + date + '\'' +
                ", title='" + title + '\'' +
                ", assign='" + assign + '\'' +
                ", perform='" + perform + '\'' +
                ", fail='" + fail + '\'' +
                '}';
    }

    public Article toEntity() {
        return new Article(null,date,  title, assign, perform, fail);
    }
}
