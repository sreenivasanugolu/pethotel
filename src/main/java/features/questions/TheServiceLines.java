package features.questions;

import features.tasks.SearchResults;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;

import java.util.List;

public class TheServiceLines {
    public static Question<List<String>> displayed() {
        return TheTarget.textValuesOf(SearchResults.SERVICE_LINES);
    }
}
