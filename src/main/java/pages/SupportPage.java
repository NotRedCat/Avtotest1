package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SupportPage {
    public void openUrl(String url) {
        open(url);
    }
    public void SelectType (String type){
            $(By.xpath("//div[@class = \"v-input__append-inner\"]")).click();
            $(By.xpath("//div[@class ='v-list-item__content']//*[text()='"+type+"']")).click();
        }
    public void InputDiscription(String text){
        $(By.xpath("//div[@class='v-input v-textarea v-input--hide-details v-input--dense theme--light v-text-field v-text-field--is-booted v-text-field--enclosed v-text-field--outlined']")).click();
        $(By.xpath("//textarea")).sendKeys("",text);
    }
    public void clickSupport() {
        $(By.xpath("//a[@href='/support']")).click();
    }

    public void clickSave(String text) {
        $(By.xpath("//button[@name= '" + text + "']/..")).click();
    }



}

