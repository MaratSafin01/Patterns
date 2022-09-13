package com.example.demo.factory.templateMethod;

public class WelcomePage extends WebsiteTemplate {
    @Override
    protected void showContent() {
        System.out.println("Welcome");
    }
}
