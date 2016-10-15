Feature: End to End functionality

  Background:
    Given User on Nopcomerce Home page

  Scenario Outline: Successfully Login

    When User Enter correct "<email>" and "<password>"
    Then User should sucessfully login

    Examples:
      | email                  | password |
      | peyuskeni1788@keni.com | password |

  Scenario Outline: Succesfully Registration

    When User goto the registration page
    And user fill all  details like "<gender>","<firstname>","<lastname>","<day>","<month>","<year>","<email>","<companyname>","<password>","<conformpassword>"
    Then user should see the message "Your registration completed"
    And do logout
    Examples:
      | gender | firstname | lastname | day | month  | year | email               | companyname | password | conformpassword |
      | male   | peyus     | keni     | 17  | August | 1988 | peyus.keni@keni.com | keni        | password | password        |


  Scenario Outline:unsuccessful Registration

    When User goto the registration page
    And user fill all  details like "<gender>","<firstname>","<lastname>","<day>","<month>","<year>","<email>","<companyname>","<password>","<conformpassword>"
    Then user should be unsuccessfully registered
    Examples:
      | gender | firstname | lastname | day | month   | year | email               | companyname | password | conformpassword |
      | male   | p         | k        | 0   | january | 0000 | k.k@k.com           | k           | k        | k               |
      |        |           |          |     |         |      |                     |             |          |                 |

  Scenario Outline: search Ieam

    When user enter search item"<productname>"
    Then user should see item <count> total
    Examples:
      | productname | count |
      | windows     | 1     |
      | laptop      | 2     |

  Scenario Outline: search Ieam

    When user enter search item"<productname>"
    Then user should see item <count> total
    And no result fount with message "No products were found that matched your criteria"
    Examples:
      | productname | count |
      | iphone      | 0     |

  Scenario Outline: Add to card
    When user enter search item"<productname>"
    Then user add product in card
    Examples:
      | productname |
      | windows     |
      | laptop      |

  Scenario: computer categories
    When user goto "computer"
    Then user should see the "Desktops","Notebooks","Software"
    And Toatal iteam shouls be '12'


  Scenario Outline: select categories
    When user goto "<category>" and subcategory <caterory_count>
    Then user should see the <caterory_count> and  <Total_count>
    Examples:
      | category          | caterory_count | Total_count |
      | Computers         | 3              | 12          |
      | Electronics       | 3              | 9           |
      | Apparel           | 3              | 10          |
      | Digital downloads | 0              | 3           |
      | Books             | 0              | 3           |
      | Jewelry           | 0              | 3           |
      | Gift Cards        | 0              | 3           |
