package features.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class Search {
    public static Performable forStation(String station) {
        return Task.where("{0} searches for station #station",
                Enter.theValue("Waterloo").into(HomePage.SEARCH).thenHit(Keys.ENTER)
        ).with("station").of(station);
    }
}
