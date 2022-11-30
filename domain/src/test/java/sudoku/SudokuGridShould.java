package sudoku;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author vinay.panday
 * @version 1.0
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "")
public class SudokuGridShould {

}
