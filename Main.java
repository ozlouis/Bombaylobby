package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static WebDriver driver;

    public static void main(String[] args) {
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://bombaylobby.com");
         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/a[2]")).click();

        System.out.println("THE TITLE OF THE WEBPAGE IS: " + driver.getTitle());
    }
}