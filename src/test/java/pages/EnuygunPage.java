package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EnuygunPage {

    public EnuygunPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "OriginInput")
    public WebElement neredenTextBox;

    @FindBy(css = ".region > span")
    public WebElement ilkHavalimani;

    @FindBy(id = "DestinationInput")
    public WebElement nereyeTextBox;

    @FindBy(xpath = "/html//input[@id='DepartureDate']")
    public WebElement gidisTarihi;

    @FindBy(css = ".block.default-btn.passenger-select-button > span")
    public WebElement ucusDurumu;

    @FindBy(className = "primary-link-btn")
    public WebElement tamamButton;

    @FindBy(css = ".block.primary-btn > span:nth-of-type(1)")
    public WebElement biletAramaButton;

    @FindBy(xpath = "(//*[@class='ei-arrow_forward-material'])[1]")
    public WebElement secButton;

    @FindBy(id = "contact_email")
    public WebElement emailTextBox;

    @FindBy(id = "contact_cellphone")
    public WebElement cepNoTextBox;

    @FindBy(id = "firstName_0")
    public WebElement adTextBox;

    @FindBy(id = "lastName_0")
    public WebElement soyadTextBox;

    @FindBy(id = "birthDateDay_0")
    public WebElement gunBox;

    @FindBy(id = "birthDateMonth_0")
    public WebElement ayBox;

    @FindBy(id = "birthDateYear_0")
    public WebElement yilBox;

    @FindBy(id = "publicId_0")
    public WebElement tcNoTextBox;

    @FindBy(className = "passenger-gender")
    public WebElement cinsiyetRadioBox;

    @FindBy(id = "healthCode_0")
    public WebElement hesCodeTextBox;

    @FindBy(className = "standart-bottom")
    public WebElement destekSeviyeRadioBox;

    @FindBy(xpath = "(//div[@id='ReservationAssurance']//div)[19]")
    public WebElement biletIptalRadioBox;

    @FindBy(xpath = "(//button[@type='button'])[13]")
    public WebElement odemeyeIlerleButton;

    @FindBy(id = "cardnumber")
    public WebElement kartNoTextBox;

    @FindBy(id = "creditCardMonth")
    public WebElement kartSonAy;

    @FindBy(id = "creditCardYear")
    public WebElement kartSonYil;

    @FindBy(id = "cvc")
    public WebElement kartCVC;

    @FindBy(xpath = "(//input[@name='Agreement'])[2]")
    public WebElement rizaMetniOnay;


    @FindBy(xpath = "(//button[contains(@class,'js-payment-btn')])[1]")
    public WebElement satinAlButton;

    @FindBy(css = "td.CalendarDay.CalendarDay_1.CalendarDay__default.CalendarDay__default_2")
    List<WebElement> gidisTarihiTakvimi;

    public void gidisgun(String gun) {

        List<WebElement> listem = gidisTarihiTakvimi;
        for (WebElement w : listem) {
            if(w.getText().equals(gun) ) {
                w.click();
                break;
            }

        }
    }




}
