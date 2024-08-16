@AlertDialogPage
Feature: AlertDialogPage Feature

    # Cucumberda given when then yapısında literaturun aksine kisiler hep farkli sekilde caselerini yaziyorlar. Ben her islemimi bir when then ile tanımlamayı tercih ettim. Mantıklı birlestirmeler ile birden fazla adımı bir gherkin cumlesine stepDefinationsta baglayabiliriz. Bu konuyu dilerseniz teknik gorusmede de tartısabılırız.
    # Farklı dinamik kullanımları olması açısından aşağıdaki dinamik verileri farklı kullandım.

  @Case-2-1 @All
  Scenario Outline: Validate List Dialog Selection and Alert Message <capabilities>
    Then should see Home Page
    When taps to "App" menu
    When taps to "Alert Dialogs" menu
    When taps to "List dialog" menu on the Alert Dialog Page
    Then should see List Dialog Panel on the Alert Dialog Page
    When taps to random option List Dialog Panel on the Alert Dialog Page
    Then selected item should be correct in the alert message on the Alert Dialog Page
    Examples:
      | capabilities   |
      | noReset=true   |



