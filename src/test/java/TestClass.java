import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class TestClass extends PageObject {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Test
    public void testMethod(){
        driver.get("https://google.com");

    }
}
