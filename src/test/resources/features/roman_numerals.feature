Feature: Roman Numerals Converter
  As a developer
  I want to convert integers to Roman numerals
  So that numbers can be displayed in the Roman numeral system

  Scenario: Convert 1 to Roman numerals
    Given I have a Roman numeral converter
    When I convert 1 to Roman numerals
    Then the result should be "I"

  Scenario: Convert 2 to Roman numerals
    Given I have a Roman numeral converter
    When I convert 2 to Roman numerals
    Then the result should be "II"

  Scenario: Convert 3 to Roman numerals
    Given I have a Roman numeral converter
    When I convert 3 to Roman numerals
    Then the result should be "III"

  Scenario: Convert 4 to Roman numerals
    Given I have a Roman numeral converter
    When I convert 4 to Roman numerals
    Then the result should be "IV"

  @wip
  Scenario: Convert 5 to Roman numerals
    Given I have a Roman numeral converter
    When I convert 5 to Roman numerals
    Then the result should be "V"

  @wip
  Scenario: Convert 9 to Roman numerals
    Given I have a Roman numeral converter
    When I convert 9 to Roman numerals
    Then the result should be "IX"

  @wip
  Scenario: Convert 10 to Roman numerals
    Given I have a Roman numeral converter
    When I convert 10 to Roman numerals
    Then the result should be "X"
