package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.EnuygunPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class EnuygunStepDefinitions {

    EnuygunPage enuygunPage = new EnuygunPage();

    @Given("kullanici {string} sitesine gider")
    public void kullanici_sitesine_gider(String enuygun_url) {

        Driver.getDriver().get(ConfigReader.getProperty("enuygun_url"));

    }

    @And("kullanici kalkis icin havaalani secer {string}")
    public void kullaniciKalkisIcinHavaalaniSecer(String kalkisHavalimani) {

        enuygunPage.neredenTextBox.sendKeys(kalkisHavalimani);
        enuygunPage.ilkHavalimani.click();
    }


    @And("kullanici varis icin havaalani secer {string}")
    public void kullaniciVarisIcinHavaalaniSecer(String varisHavalimani) {

        enuygunPage.nereyeTextBox.sendKeys(varisHavalimani);
        enuygunPage.ilkHavalimani.click();
    }


    @And("kullanici gidis tarihi secer {string}")
    public void kullaniciGidisTarihiSecer(String gidisTarihi) {

        enuygunPage.gidisTarihi.click();
        enuygunPage.gidisgun(gidisTarihi.split(" ")[0]);
    }

    @And("kullanici yolcu bilgilerini girer")
    public void kullaniciYolcuBilgileriniGirer() {

        enuygunPage.ucusDurumu.click();
    }


    @Given("kullanici Tamam butonuna tiklar")
    public void kullanici_tamam_butonuna_tiklar() {

        enuygunPage.tamamButton.click();

    }

    @And("kullanici Ucuz bilet bul butonuna tiklar")
    public void kullaniciUcuzBiletBulButonunaTiklar() {

        enuygunPage.biletAramaButton.click();
    }


    @And("kullanici uygun olan ucusu secer")
    public void kullaniciUygunOlanUcusuSecer() {

        enuygunPage.secButton.click();
    }

    @Given("kullanici iletisim bilgilerini girer")
    public void kullanici_iletisim_bilgilerini_girer(DataTable dataTable) {

        List<String> iletisimBilgileri = dataTable.row(1);
        enuygunPage.emailTextBox.sendKeys(iletisimBilgileri.get(0));
        enuygunPage.cepNoTextBox.sendKeys(iletisimBilgileri.get(1));
        enuygunPage.adTextBox.sendKeys(iletisimBilgileri.get(2));
        enuygunPage.soyadTextBox.sendKeys(iletisimBilgileri.get(3));


        Select select1 = new Select(enuygunPage.gunBox);
        select1.selectByVisibleText(iletisimBilgileri.get(4).split(" ")[0]);
        enuygunPage.gunBox.sendKeys(iletisimBilgileri.get(4).split(" ")[0]);
        enuygunPage.ayBox.sendKeys(iletisimBilgileri.get(4).split(" ")[1]);
        enuygunPage.yilBox.sendKeys(iletisimBilgileri.get(4).split(" ")[2]);
        enuygunPage.tcNoTextBox.sendKeys(iletisimBilgileri.get(5));
        enuygunPage.hesCodeTextBox.sendKeys(iletisimBilgileri.get(7));

    }


    @Given("Kullanici destek seviyesini standart destek olarak belirler")
    public void kullanici_destek_seviyesini_standart_destek_olarak_belirler() {

        enuygunPage.destekSeviyeRadioBox.click();

    }

    @Given("kullanici bilet iptal güvencesi istiyorum'u secer")
    public void kullanici_bilet_iptal_güvencesi_istiyorum_u_secer() {

        enuygunPage.biletIptalRadioBox.click();

    }

    @Given("kullanici ödemeye ilerle butonuna tiklar")
    public void kullanici_ödemeye_ilerle_butonuna_tiklar() {

        enuygunPage.odemeyeIlerleButton.click();

    }

    @And("kullanici odeme bilgilerini girer")
    public void kullaniciOdemeBilgileriniGirer() {

        enuygunPage.kartNoTextBox.
                sendKeys("4141414141414141",
                        Keys.TAB, "05",
                        Keys.TAB, "2025",
                        Keys.TAB, "364");
    }

    @Given("kullanici Acik Riza Metni'ni onaylar")
    public void kullanici_acik_riza_metni_ni_onaylar() {

        enuygunPage.rizaMetniOnay.click();

    }

    @Given("kullanici Satin al butonuna tiklar")
    public void kullanici_satin_al_butonuna_tiklar() {

        enuygunPage.satinAlButton.click();
    }
}
