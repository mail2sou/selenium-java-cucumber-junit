Feature: Add and verify a contract

  @smoke
  Scenario Outline: Add a contract and verify the added contract after adding insurance
    Given An user navigates to the home page
    When The user clicks on "<app>" and starts
    Then The user is redirected to the questionnaire page
    Then The user fills up the questionnaire with dob "<dob>"
    And fills up gender "<gender>"
    And fills up living situation "<livingSituation>"
    And fills up finance planning "<reFinancePlanning>"
    And fills up vehicles "<vehicles>"
    And fills up family situation "<familySituation>"
    And fills up child details "<child>"
    And fills up profession "<profession>"
    And fills up free time details "<freeTime>"
    And fills up salary "<salary>"
    And the user registers using email and password
    Then The user views recommendations
    And click on recommendation card "<card>"
    Then the user adds insurance with "<insuranceCompany>" and "<insuranceType>"
    Then the user verifies the added insurance

    Examples:
      | app    | dob        | gender   | livingSituation           | reFinancePlanning                        | vehicles | familySituation     | child | profession    | freeTime                                        | salary | card                   | insuranceCompany | insuranceType     |
      | Bedarf | 17.05.1986 | Weiblich | In meiner eigenen Wohnung | Ja, ich plane eine Anschlussfinanzierung | Auto     | Ich bin verheiratet | Nein  | Selbstständig | Ich verbringe sehr viel Zeit mit meiner Familie | 76000  | Private Altersvorsorge | Axa              | Privathaftpflicht |
