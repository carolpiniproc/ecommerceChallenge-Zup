#language:en
@searchAndBuyFlow
Feature: Search and add to card on Amazon website
  I want to add a book on the shopping cart

  @searchAndBuyFeature
  Scenario Outline: Search for a book and add it to the shopping cart
    Given customer is on Amazon
    When searches for <value>
    And wants a regular cover
    And he adds it on the shopping cart
    Then the book <value> is there
    Examples:
      | value                             |
      | "Introdução ao teste de software" |

