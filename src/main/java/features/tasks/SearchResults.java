package features.tasks;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchResults {
    public static final Target SEARCH_RESULTS_HEADING = Target.the("Search headline")
            .located(By.className("hero-headline"));
    public static final Target SERVICE_LINES = Target.the("Service Lines ")
            .located(By.xpath("//span[contains(@class,'service-name')]"));
}
