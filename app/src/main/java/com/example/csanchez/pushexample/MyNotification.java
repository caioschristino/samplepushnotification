package com.example.csanchez.pushexample;

/**
 * Created by csanchez on 11/02/18.
 */

public class MyNotification {
    private String title;
    private String body;

    public MyNotification(String title, String body){
        this.body = body;
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }
}
