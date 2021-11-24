package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.BasicPage;

import java.util.concurrent.TimeUnit;

public class BasicRageDef {
    BasicPage basicPage = new BasicPage();
    @Then ("open {string} url")
    public void openUrl(String arg0) {
        basicPage.openUrl(arg0);
    }
    @Then("click {string} button")
    public void clickButton(String arg0) {
        basicPage.clickButton(arg0);
    }

    @Then("Input {string} Email")
    public void inputEmail(String arg0) {
        basicPage.InputEmail(arg0, UserConfig.USER_EMAIL);
    }

    @Then("Input {string} Pass")
    public void inputPass(String arg0) {
        basicPage.InputPass(arg0, UserConfig.USER_PASS);
    }

    @Then("Input {string} NoEmail")
    public void inputnoEmail(String arg0) {
        basicPage.InputEmail(arg0, UserConfig.NOUSER_EMAIL);
    }

    @Then("Input {string} NoPass")
    public void inputnoPass(String arg0) {
        basicPage.InputPass(arg0, UserConfig.NOUSER_PASS);
    }

    @Then("Content with {string} visible")
    public void contentWithVisible(String arg0) throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);

}
}

