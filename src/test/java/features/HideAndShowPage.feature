@HideAndShowPage
Feature: HideAndShowPage Feature

    # Cucumberda given when then yapısında literaturun aksine kisiler hep farkli sekilde caselerini yaziyorlar. Ben her islemimi bir when then ile tanımlamayı tercih ettim. Mantıklı birlestirmeler ile birden fazla adımı bir gherkin cumlesine stepDefinationsta baglayabiliriz. Bu konuyu dilerseniz teknik gorusmede de tartısabılırız.
    # Farklı dinamik kullanımları olması açısından aşağıdaki dinamik verileri farklı kullandım.


 #Bu casede second click olarak yazmışsınız fakat ne istediğinizi tam anlamadım. Bir tek tıklayarak akışı kontrol ettim. Eğer hide butonuna 2 kez hızlıca tıklanırsa(double click) yapılırsa buton hide yazısında kalıp textbox gitmekte. Bu şekilde bir bug mevcut bilginize.

  @Case-4-1 @All
  Scenario Outline: Validate Hide and Show Button Functionality in Fragment <capabilities>
    Then should see Home Page
    When taps to "App" menu
    When taps to "Fragment" menu
    When taps to "Hide and Show" menu
    Then should see first hide button on the Hide And Show Page
    Then should see second hide button on the Hide And Show Page
    Then should see first textbox on the Hide And Show Page
    Then should see second textbox on the Hide And Show Page
    When taps to first hide button on the Hide And Show Page
    Then should see first textbox is hidden on the Hide And Show Page
    Then should see first hide button text "Show" on the Hide And Show Page
    When taps to first hide button on the Hide And Show Page
    Then should see first textbox on the Hide And Show Page
    Then should see first hide button text "Hide" on the Hide And Show Page
    Examples:
      | capabilities   |
      | noReset=true   |



