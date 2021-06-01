package io.github.bhhan;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "classpath:features",
        glue = "io.github.bhhan.steps"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
