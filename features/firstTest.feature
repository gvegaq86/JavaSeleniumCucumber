Feature: Web Login
  @P300 @setCookies
  Scenario Outline: User Should be able to login with valid credentials
  Given the user is on login page
  When the user enters valid credentials
  |param1|param2|param3|
  |'<a>' |'<b>' |'<c>' |
  And hits submit
  Then the user should be logged in successfully

    Examples:
    |a |b |c |
    |g |i |o |
    |h |j |m |