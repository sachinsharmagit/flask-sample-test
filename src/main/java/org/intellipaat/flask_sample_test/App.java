package org.intellipaat.flask_sample_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import junit.framework.Assert;
/**
 * flask-sample-test
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver = new HtmlUnitDriver();			
		driver.get("http://3.80.97.59:82/");
	    WebElement element = driver.findElement(By.tagName("h1"));
	    String val = element.getText();
	    Assert.assertEquals("Test case failed", "Hello Earth! This message is from Kubernetes!", val);
	    driver.close();
    }
}
