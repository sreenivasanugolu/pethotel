package features.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static features.tasks.MenuBar.STATUS_UPDATES;

public class SelectMenu {
    public static Performable option(MenuBar menuBar) {
        return Click.on(menuBar.menuOption());
    }
}
