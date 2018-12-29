Feature: Login to leaf
Scenario Outline: Positive Login
Given Open The Browser
And Max The Browser
And Set The Timeout
And Launch The Url
#And Enter the UserName as DemoSalesManager
And Enter the UserName as <username>
#And Enter the Password as crmsfa
And Enter the Password as <password>
When Click on the loginbutton
And verify login
And click crmsfa        
And click leads
And click createlead
And enter cmpname as <cmpname>
And enter firstname as <fname>
And enter lastname as <lname>    
Then click createleadbutton


Examples: 

|username|password|cmpname|fname|lname|
#|demosalesmanager|crmsfa|abc|nandhu|k|
#|democsr|crmsfa|xyz|mathu|m|
|demosalesmanager|crmsfa|EGinnovations|Kalai|rajendran|
|democsr|crmsfa|gs3india|jayapradha|rajendran|

