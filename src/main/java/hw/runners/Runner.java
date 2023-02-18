package hw.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/main/java/hw/features",//path to feature files
        glue = "hw.steps",//package path
        tags = "@ALL",//list feature files for run
  //      publish = true,
        dryRun = false,
        monochrome = true
)

public class Runner {

  //  @BeforeClass
  //  public static void createDriver() {
   //     System.out.println("Before class===");
        //,CUCUMBER_PUBLISH_TOKEN=4634b17e-a0cd-4811-bc62-3f5f98da054d
       // System.setProperty("CUCUMBER_PUBLISH_TOKEN", "4634b17e-a0cd-4811-bc62-3f5f98da054d");
  //  }
}
