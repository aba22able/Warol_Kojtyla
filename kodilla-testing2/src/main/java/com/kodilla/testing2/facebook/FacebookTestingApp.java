package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FacebookTestingApp
{
    public static final String NEW_ACCOUNT_BUTTON_ID = "//div[@class= \"_6ltg\"]/a";
    public static final String XPATH_SELECT_DAY = "//div[@class=\"_5k_5\"]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[@class=\"_5k_5\"]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[@class=\"_5k_5\"]/span/span/select[3]";
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com/");

        TimeUnit.SECONDS.sleep(3);
        WebElement cookiesButton = driver.findElement(By.xpath("//div[@class= \"_9xo5\"]/button[2]"));
        cookiesButton.click();

        WebElement newAccountButton = driver.findElement(By.xpath(NEW_ACCOUNT_BUTTON_ID));
        newAccountButton.click();

        TimeUnit.SECONDS.sleep(1);
        while(!driver.findElement(By.xpath(XPATH_SELECT_DAY)).isDisplayed());

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDayOfBirth = new Select(selectComboDay);
        selectDayOfBirth.selectByIndex(17);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonthOfBirth = new Select(selectComboMonth);
        selectMonthOfBirth.selectByIndex(4);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYearOfBirth = new Select(selectComboYear);
        selectYearOfBirth.selectByValue("1920");
    }

}
