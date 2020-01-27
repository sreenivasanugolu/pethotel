package features.tasks;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HelpAndContact {
    public static class AboutOyester {
        public static final Target TFLApp = Target.the("About Oyster link")
                .located(By.linkText("Contact us about Oyster"));
    }
}
