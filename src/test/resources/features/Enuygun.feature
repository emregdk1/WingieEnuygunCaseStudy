Feature: Enuygun Bilet ve Rezervasyon


  Scenario: Enuygun Bilet Arama ve Rezervasyon Yapma

    Given kullanici "enuygun.com" sitesine gider
    And kullanici kalkis icin havaalani secer "Samsun"
    And kullanici varis icin havaalani secer "İstanbul"
    And kullanici gidis tarihi secer "15 Eylül 2021"
    And kullanici yolcu bilgilerini girer
    And kullanici Tamam butonuna tiklar
    And kullanici Ucuz bilet bul butonuna tiklar
    And kullanici uygun olan ucusu secer
    And kullanici iletisim bilgilerini girer
      |e-posta |cep tel |ad |soyad |dogum tarihi |tc nu |cinsiyet |hes kod |
      |emreguduk96@gmail.com|5416202270|Emre|Guduk|04 Mayis 1996|29981270424|Erkek|M5Y9986915|
    And Kullanici destek seviyesini standart destek olarak belirler
    And kullanici bilet iptal güvencesi istiyorum'u secer
    And kullanici ödemeye ilerle butonuna tiklar
    And kullanici odeme bilgilerini girer
    And kullanici Acik Riza Metni'ni onaylar
    And kullanici Satin al butonuna tiklar