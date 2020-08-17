#language:en
@searchAndBuyFlow
Feature: Search and add to card on Amazon website
  I want to add a product on the shopping cart

  @searchAndBuyBook
  Scenario: Search for a book and add it to the shopping cart
    Given customer is on Amazon
    When searches for "Introdução ao teste de software"
    And wants a regular cover
    And he adds it on the shopping cart
    Then the book "Introdução ao teste de software" is there

  @searchAndBuyDVD
  Scenario: Search for a book and add it to the shopping cart
    Given customer is on Amazon
    When searches for "Lucky Cucumber"
    And he adds it on the shopping cart
    Then the book "Lucky Cucumber" is there

  @searchAndBuyHardCoverBook
  Scenario: Search for a book and add it to the shopping cart
    Given customer is on Amazon
    When searches for "O MBA da vida real"
    And wants a hard cover book
    And he adds it on the shopping cart
    Then the book "O MBA da vida real" is there

  @searchAndAddABookOnKindle
  Scenario: Search for a book and add it to the shopping cart
    Given customer is on Amazon
    When searches for "Berkshire Hathaway"
    And wants a new book on Kindle
    Then Amazon asks for login