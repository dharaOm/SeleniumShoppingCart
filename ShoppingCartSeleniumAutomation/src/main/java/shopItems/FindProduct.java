package shopItems;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FindProduct   {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

       WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("http://automationpractice.com");
        driver.manage().window().maximize();
        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email")).sendKeys("test172@test.com");
        driver.findElement(By.id("passwd")).sendKeys("Password");
        driver.findElement(By.id("SubmitLogin")).click();
        driver.findElement(By.className("sf-with-ul")).click();
        driver.findElement(By.className("available-now")).click();

        driver.findElement(By.id("color_2")).click();


        driver.findElement(By.id("add_to_cart")).click();
        //driver.findElement(By.xpath("//span[contains(@title,'Proceed to checkout')]"));
        driver.findElement(By.className("cross")).click();
        driver.findElement(By.className("icon-plus")).click();
        Select Size = new Select(driver.findElement(By.id("group_1")));
        Size.selectByIndex(2);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.id("add_to_cart")).click();
        driver.findElement(By.linkText("Proceed to checkout")).click();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.linkText("Proceed to checkout")).click();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.name("processAddress")).click();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.id("uniform-cgv")).click();
        driver.findElement(By.linkText("Proceed to checkout")).click();

        driver.findElement(By.linkText("Log me out")).click();
        //driver.findElement(By.className("Submit")).click();
        //driver.findElement(By.className("button ajax_add_to_cart_button btn btn-default")).click();
        //driver.findElement(By.tagName("Add to cart")).click();
       // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        //driver.findElement(By.className("button ajax_add_to_cart_button btn btn-default")).click();
        ;

        //driver.close();

    }
}
