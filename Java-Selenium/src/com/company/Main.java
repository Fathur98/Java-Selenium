package com.company;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\app\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();

        webDriver.get("https://github.com/");
        webDriver.findElement(By.linkText("Sign in")).click();
        webDriver.findElement(By.id("login_field")).sendKeys("foltak98@gmail.com");
        webDriver.findElement(By.id("password")).sendKeys("foltak98");
        webDriver.findElement(By.name("commit")).click();
//        webDriver.close();
    }
}
