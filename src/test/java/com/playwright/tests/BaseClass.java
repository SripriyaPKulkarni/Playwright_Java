package com.playwright.tests;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;

public class BaseClass {

    @Test
            public  void testing(){
        Playwright playwright=Playwright.create();
        Browser browser = playwright.chromium().launch();
        Page page = browser.newPage();

        page.navigate("https://github.com/");

        System.out.println(page.title());

    }



}
