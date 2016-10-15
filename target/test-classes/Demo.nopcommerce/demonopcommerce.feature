Feature: Registration
  As a new user
  I want to register on nopcommerce application
  SO that i can buy the product from Nopcommerce application

  Scenario Outline: Succesfully Registration
    Given User on Nopcomerce Home page
    When User goto the registration page
    And user fill all  details like "<gender>","<firstname>","<lastname>","<day>","<month>","<year>","<email>","<companyname>","<password>","<conformpassword>"
    Then user should see the message "Your registration completed"
    Examples:
      | gender | firstname | lastname | day | month  | year | email               | companyname | password | conformpassword |
      | male   | peyus     | keni     | 17  | August | 1988 | peyus.keni@keni.com | keni        | password | password       |


  Scenario Outline:unsuccessful Registration
    Given User on Nopcomerce Home page
    When User goto the registration page
    And user fill all  details like "<gender>","<firstname>","<lastname>","<day>","<month>","<year>","<email>","<companyname>","<password>","<conformpassword>"
    Then user should be unsuccessfully registered
    Examples:
      | gender | firstname | lastname | day | month   | year | email               | companyname | password | conformpassword |
      | male   | p         | k        | 0   | january | 0000 | k.k@k.com           | k           | k        | k               |
      |        |           |          |     |         |      |                     |             |          |                 |
      |female  |   f       |    f     |  29  |   May  |  2014| 00000000@000000.com |             |00000000  |     00000000    |


  Scenario Outline: sucessfully login
    Given i on Nopcomerce Home page
    When user enters "<email>" , "<password>" on login page and do login
    Then user should be log in sucessfully
    Examples: | email               | password |
    | peyus.keni@keni.com | password |

  Scenario Outline: unsucessfully login
    Given i on Nopcomerce Home page
    When user enters "<email>" , "<password>" on login page and do login
    Then user should see unsucessfully message
    Examples: | email               | password |
    | peyus@keni.com | password |