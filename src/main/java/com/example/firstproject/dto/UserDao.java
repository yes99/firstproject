package com.example.firstproject.dto;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<ArticleForm> listForBeanPropertyRowMapper(){
        String query = "SELECT * FROM ojt";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper<ArticleForm>(ArticleForm.class));
    }

    public int insert(ArticleForm form){
        String query = "INSERT INTO ojt(date, title, assign, perform, fail) VALUES(?,?,?,?,?)";
        return jdbcTemplate.update(query, form.getDate(), form.getTitle(), form.getAssign(), form.getPerform(), form.getFail());

    }
}


/*
form.getAssign();
form.getDate();
form.getTitle();
form.getFail();
form.getPerform();

 */