@ScrollablePage
Feature: ScrollablePage Feature

    # Cucumberda given when then yapısında literaturun aksine kisiler hep farkli sekilde caselerini yaziyorlar. Ben her islemimi bir when then ile tanımlamayı tercih ettim. Mantıklı birlestirmeler ile birden fazla adımı bir gherkin cumlesine stepDefinationsta baglayabiliriz. Bu konuyu dilerseniz teknik gorusmede de tartısabılırız.
    # Farklı dinamik kullanımları olması açısından aşağıdaki dinamik verileri farklı kullandım.

  @Case-6-1 @All
  Scenario Outline: Verify Last Tab Functionality and Content <capabilities>
    Then should see Home Page
    When taps to "Views" menu
    When taps to "Tabs" menu
    When taps to "5. Scrollable" menu
    Then scroll to "<tab>" on the Scrollable Page
    When taps to "<tab>" on the Scrollable Page
    Then should see Tab 30 text "Content for tab with tag Tab 30" on the Scrollable Page
    Examples:
      | capabilities     | | tab      |
      | fullReset=true   | | TAB 30   |


