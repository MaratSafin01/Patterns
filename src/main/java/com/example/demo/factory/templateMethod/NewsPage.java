package com.example.demo.factory.templateMethod;

public class NewsPage extends WebsiteTemplate {
    @Override
    protected void showContent() {
        System.out.println("News");
    }
}
