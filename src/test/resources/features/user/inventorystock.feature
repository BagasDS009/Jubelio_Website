@Inventory
Feature: Inventory Stock at app.jubelio

  @InventoryStock
  Scenario Outline: Inventory Stock
    Given Login "<email>", "<pass>", click button login
    And an inventory adjustment button click
    And validate the inventory adjustment page
    And click "<lokasi>"
    When you select an item
    Then validate the name "<name>" successfully

    Examples:
      | name   | email                        | pass        | lokasi            |
      | Naruto | qa.rakamin.jubelio@gmail.com | Jubelio123! | Pusat             |
      | Naruto | qa.rakamin.jubelio@gmail.com | Jubelio123! | Simatupang Garden |
      | Naruto | qa.rakamin.jubelio@gmail.com | Jubelio123! | Gudang Pedia      |

  @DeleteStock
  Scenario Outline: Inventory Stock - Delete
    Given Login "<email>", "<pass>", click button login
    And an inventory adjustment button click
    And validate the inventory adjustment page
    And click "<lokasi>"
    When you detele item "<delete>"
    Then validate the name empty

    Examples:
      |  | email                        | pass        | lokasi | delete |
      |  | qa.rakamin.jubelio@gmail.com | Jubelio123! | Pusat  | Ya     |
      |  | qa.rakamin.jubelio@gmail.com | Jubelio123! | Pusat  | Batal  |