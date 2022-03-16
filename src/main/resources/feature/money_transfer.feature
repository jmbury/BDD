Feature: Transfer money, a lot of money

#  Scenario: Transfer money from current account to saving account
#    Given I have 1500 on currentAccount
#    And I have 777 on savingAccount
#    When I transfer 666 from currentAccount to savingAccount
#    Then Tranfer was executed
#    And Statement appear "A lot of money"


  Scenario Outline: Transfer money from current account to saving account
    Given I have <current_ac> on currentAccount
    And I have <saving_ac> on savingAccount
    When I transfer <howMuchTransfer> from currentAccount to savingAccount
    Then Tranfer was executed
    And Statement appear <what_statement>
    Examples:
    |current_ac|saving_ac|howMuchTransfer|what_statement|
    |1000      |1000     |500            |"String1"     |
    |1500      |1500     |1200           |"String2"     |
