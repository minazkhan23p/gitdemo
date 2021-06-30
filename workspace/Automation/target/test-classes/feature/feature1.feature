Feature: Application Login


Scenario: Homepage default Login

Given User has landed to the login page
When user has provided "minaz" and "abc123"
And clicks on login button
Then user is landed to the homepage

Scenario: Homepage default Login2
Given User has landed to the login page
When user has provided "min" and "adfv123"
And clicks on login button
Then user is landed to the homepage