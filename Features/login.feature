Feature: Login to leaf
Scenario: Positive Login
Given Open The Browser
And Max The Browser
And Set The Timeout
And Launch The Url
And Enter the UserName as DemoSalesManager
And Enter the Password as crmsfa
When Click on the loginbutton
Then verify login






