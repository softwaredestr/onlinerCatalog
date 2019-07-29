import com.google.gson.Gson;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CatalogTest {

    @Test
    public void validateCode(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\ПК\\IdeaProjects\\onlinerCatalog\\src\\main\\resources\\catalog.html");
        WebElement element = driver.findElementByTagName("pre");

        String jsonCode = driver.findElementByTagName("pre").getText();

        Gson gson = new Gson();
        Catalog catalog = gson.fromJson(jsonCode, Catalog.class);

        driver.quit();
    }
}
