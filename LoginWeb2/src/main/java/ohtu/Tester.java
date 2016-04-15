package ohtu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Tester {

    public static void main(String[] args) {
        //WebDriver driver = new HtmlUnitDriver();
        WebDriver driver = new FirefoxDriver();
        correctNameAndPass(driver);
        incorrectPass(driver);
        incorrectUser(driver);
        createUser(driver);
        createUserAndLogOut(driver);

    }

    public static void correctNameAndPass(WebDriver driver) {
        driver.get("http://localhost:8090");
        System.out.println(driver.getPageSource());
        WebElement element = driver.findElement(By.linkText("login"));
        element.click();

        System.out.println("==");

        System.out.println(driver.getPageSource());
        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akkep");
        element = driver.findElement(By.name("login"));
        element.submit();

        System.out.println("==");
        System.out.println(driver.getPageSource());
    }

    public static void incorrectPass(WebDriver driver) {
        driver.get("http://localhost:8090");
        System.out.println(driver.getPageSource());
        WebElement element = driver.findElement(By.linkText("login"));
        element.click();

        System.out.println("==");

        System.out.println(driver.getPageSource());
        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("login"));
        element.submit();

        System.out.println("==");
        System.out.println(driver.getPageSource());
    }

    public static void incorrectUser(WebDriver driver) {
        driver.get("http://localhost:8090");
        System.out.println(driver.getPageSource());
        WebElement element = driver.findElement(By.linkText("login"));
        element.click();

        System.out.println("==");

        System.out.println(driver.getPageSource());
        element = driver.findElement(By.name("username"));
        element.sendKeys("akkep");
        element = driver.findElement(By.name("password"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("login"));
        element.submit();

        System.out.println("==");
        System.out.println(driver.getPageSource());
    }

    private static void createUser(WebDriver driver) {
        driver.get("http://localhost:8090");
        System.out.println(driver.getPageSource());
        WebElement element = driver.findElement(By.linkText("register new user"));
        element.click();

        System.out.println("==");

        System.out.println(driver.getPageSource());
        element = driver.findElement(By.name("username"));
        element.sendKeys("beato");
        element = driver.findElement(By.name("password"));
        element.sendKeys("ahaha.wav");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("ahaha.wav");
        element = driver.findElement(By.name("add"));
        element.submit();

        System.out.println("==");
        System.out.println(driver.getPageSource());
    }

    private static void createUserAndLogOut(WebDriver driver) {
        driver.get("http://localhost:8090");
        System.out.println(driver.getPageSource());
        WebElement element = driver.findElement(By.linkText("register new user"));
        element.click();

        System.out.println("==");

        System.out.println(driver.getPageSource());
        element = driver.findElement(By.name("username"));
        element.sendKeys("maria");
        element = driver.findElement(By.name("password"));
        element.sendKeys("uuu-uuu!");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("uuu-uuu!");
        element = driver.findElement(By.name("add"));
        element.submit();

        System.out.println("==");
        
        System.out.println(driver.getPageSource());       
        element = driver.findElement(By.linkText("continue to application mainpage"));
        element.click();
        
        System.out.println("==");
        
        System.out.println(driver.getPageSource());     
        element = driver.findElement(By.linkText("logout"));
        element.click();
        
        System.out.println("==");
        
        System.out.println(driver.getPageSource());
    }
}
