package dev.djob.id;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/ressources/features/solver.feature", glue = "dev.djob.id.steps")
public class stepTest {
    
}
