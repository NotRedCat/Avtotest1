package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BasicPage {

    public void openUrl(String url) {

        open(url);
    }

    public void InputEmail(String label, String text){
        $(By.xpath("//input[@input-label='" + label + "']")).val(text);
    }
    public void InputPass(String label, String text){
        $(By.xpath("//input[contains(@input-label, '" + label + "')]")).val(text);
    }
    public void clickButton(String text) {
        $(By.xpath("//span[contains(text(), '" + text + "')]/..")).click();
    }
    public void contentIsVisible(String text) {
        $(By.xpath("//*[contains(text(),'" + text +"')]"));

    }


}
