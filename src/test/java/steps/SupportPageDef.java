package steps;

import io.cucumber.java.en.Then;
import pages.SupportPage;

import java.util.concurrent.TimeUnit;

public class SupportPageDef {
        SupportPage supportPage = new SupportPage();

        @Then("open {string} supportUrl")
        public void openUrl(String arg0) {
            supportPage.openUrl(arg0);
        }
        @Then("input {string} text")
        public void inputText(String arg0) {
            supportPage.InputDiscription(arg0);

        }
        @Then("click support")
        public void clickSupport() throws InterruptedException {
            supportPage.clickSupport();
            TimeUnit.SECONDS.sleep(2);
        }
        @Then("select {string} type")
        public void selectType(String arg0) {
            supportPage.SelectType(arg0);
        }
        @Then("click {string} save")
        public void clickButton(String arg0) throws InterruptedException {
            supportPage.clickSave(arg0);
            TimeUnit.SECONDS.sleep(3);
    }

    }



