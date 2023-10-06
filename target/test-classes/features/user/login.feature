@Login
Feature: Login Account at app.jubelio

  Scenario Outline: Login Account
    Given fills in the "<email>" with valid data email
    And fill in the "<password>" with valid data pass
    When click the login button
    Then validate page home or error "<message>"
    Examples:
      | email                        | password                        | message                            |
      | qa.rakamin.jubelio@gmail.com | Jubelio123!                     | Dashboard                          |
      | qa.rakamin.jubelio@gmail     | Jubelio123!                     | Format Email tidak valid.          |
      | qa.rakamin.jubelio@gmail.com | Jubelio123                      | Password atau email anda salah.    |
      | qa.rakamin.jubelio@gmail     | Jubelio123                      | Email dan Password anda salah.     |
      |                              |                                 | Email dan Password harus diisi.    |
      |                              | Jubelio123                      | Email harus diisi.                 |
      | qa.rakamin.jubelio@gmail.com |                                 | Password harus diisi.              |
      | qa.rakamin.jubelio@gmail.com | Ju                              | Password harus di antara 6 dan 30. |
      | qa.rakamin.jubelio@gmail.com | 1234567890123456789012345678901 | Password harus di antara 6 dan 30. |
#

# !!! ERROR DESKRIPSi !!!
# message = Email dan Password anda salah., karena error field password tidak ada. maka ERROR
