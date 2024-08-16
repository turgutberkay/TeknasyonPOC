@ContextMenuPage
Feature: ContextMenuPage Feature

    # Cucumberda given when then yapısında literaturun aksine kisiler hep farkli sekilde caselerini yaziyorlar. Ben her islemimi bir when then ile tanımlamayı tercih ettim. Mantıklı birlestirmeler ile birden fazla adımı bir gherkin cumlesine stepDefinationsta baglayabiliriz. Bu konuyu dilerseniz teknik gorusmede de tartısabılırız.
    # Farklı dinamik kullanımları olması açısından aşağıdaki dinamik verileri farklı kullandım.

  @Case-3-1 @All
  Scenario Outline: Verify Context Menu Options with Long Press Action <capabilities>
    Then should see Home Page
    When taps to "App" menu
    When taps to "Fragment" menu
    When taps to "Context Menu" menu
    Then should see long press me button on the Context Menu Page
    When long click to long press me button on the Context Menu Page
    Then should see Menu A layout on the Context Menu Page
    Then should see Menu B layout on the Context Menu Page
    Examples:
      | capabilities   |
      | noReset=true   |

