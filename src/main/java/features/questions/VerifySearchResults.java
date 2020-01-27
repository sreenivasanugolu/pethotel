package features.questions;

import features.tasks.SearchResults;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class VerifySearchResults {
    public static Question<String> heading() {
       return TheTarget.textOf(SearchResults.SEARCH_RESULTS_HEADING);
    }
}
