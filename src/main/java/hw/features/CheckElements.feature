@ALL
Feature: check elements

  Scenario Outline: check some elements text
    When I open page "https://dnipro.ithillel.ua/"
    And check if "<element>" contains "<text>"

    Examples:
      | element                                           | text                              |
      | //button[@id='btn-consultation-hero']             | Безкоштовна консультація          |
      | //h2[contains(@class, 'block-course-cats_title')] | Курси в Комп'ютерній школі Hillel |
      | //button[@data-dropdown-trigger='aboutSchool']    | школа                             |
      | //button[@data-dropdown-trigger='coursesMenu']    | курси                             |
      | //span[@data-city-id='dp']                        | Дніпро                             |
