package com.example.demo.controller;


public class User {
    private String name;
    private String comment;

    // コンストラクタ
    public User(String name, String comment) {
        this.name = name;
        this.comment = comment;
    }

    // getterメソッド
    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }

}