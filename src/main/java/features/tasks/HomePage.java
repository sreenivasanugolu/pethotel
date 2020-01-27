package features.tasks;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://tfl.gov.uk")
public class HomePage extends PageObject {
    public static final Target ACCEPT_COOKIES = Target.the("Accept Cookies")
            .located(By.linkText("Accept all cookies"));
    public static final Target DONE = Target.the("Done button")
            .located(By.linkText("Done"));
    public static final Target SEARCH = Target.the("Search field").located(By.id("q"));

}
