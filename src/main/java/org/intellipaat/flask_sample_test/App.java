package org.intellipaat.flask_sample_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;
/**
 * flask-sample-test
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.setBinary("/usr/bin/google-chrome-stable");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://3.80.97.59:82/");
        WebElement element = driver.findElement(By.tagName("h1"));
        String val = element.getText();
        Assert.assertEquals("Test case failed", "Hello world! This message is from Kubernetes!", val);
        driver.close();
    }
}
