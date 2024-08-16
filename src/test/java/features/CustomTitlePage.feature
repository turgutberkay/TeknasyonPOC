@CustomTitlePage
Feature: CustomTitlePage Feature

    # Cucumberda given when then yapısında literaturun aksine kisiler hep farkli sekilde caselerini yaziyorlar. Ben her islemimi bir when then ile tanımlamayı tercih ettim. Mantıklı birlestirmeler ile birden fazla adımı bir gherkin cumlesine stepDefinationsta baglayabiliriz. Bu konuyu dilerseniz teknik gorusmede de tartısabılırız.
    # Farklı dinamik kullanımları olması açısından aşağıdaki dinamik verileri farklı kullandım.

  @Case-1-1 @All
  Scenario Outline: Validate TextBox and NavigationBar Updates in Custom Title Activity <capabilities>
    Then should see Home Page
    When taps to "App" menu
    When taps to "Activity" menu
    When taps to "Custom Title" menu
    Then should see default left textBox text "Left is best" on the Activity Page
    Then should see default right textBox text "Right is always right" on the Activity Page
    Then should see default left navigationBar text "Left is best" on the Activity Page
    Then should see default right navigationBar text "Right is always right" on the Activity Page
    When change to left textBox value to "<newLeftText>" on the Activity Page
    Then should see the left navigationBar text updated to "<newLeftText>" on the Activity Page
    When change the right textBox value to "<newRightText>" on the Activity Page
    Then should see the right navigationBar text updated to "<newRightText>" on the Activity Page
    Examples:
      | capabilities            || newLeftText            | | newRightText  |
      | noReset=false            || yeni sol               | | yeni sag      |



