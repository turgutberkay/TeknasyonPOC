@IncomingMessagePage
Feature: IncomingMessagePage Feature

    # Cucumberda given when then yapısında literaturun aksine kisiler hep farkli sekilde caselerini yaziyorlar. Ben her islemimi bir when then ile tanımlamayı tercih ettim. Mantıklı birlestirmeler ile birden fazla adımı bir gherkin cumlesine stepDefinationsta baglayabiliriz. Bu konuyu dilerseniz teknik gorusmede de tartısabılırız.
    # Farklı dinamik kullanımları olması açısından aşağıdaki dinamik verileri farklı kullandım.

  @Case-5-1 @All
  Scenario Outline: Verify Notification Display and Detail Consistency <capabilities>
    Then should see Home Page
    When taps to "App" menu
    When taps to "Notification" menu
    When taps to "IncomingMessage" menu
    When taps to Show Notification button on the Incoming Message Page
    When open to Notification Panel
    Then should see App Notification Title Text "Joe"
    When taps to App Notification
    Then should see correct Notification Message on the Incoming Message Page
    Examples:
      | capabilities   |
      | noReset=true   |





