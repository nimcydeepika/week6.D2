Feature: CreateLead functionally for Leaftaps application

#Background:
#Given Open the chrome browser
#And Load the application url

Scenario Outline: CreateLead with mandatory information
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' page should be displayed
When Click on 'Leads' link
Then 'My Leads' page should be displayed
When Click on 'Create Lead' link
Then 'Create Lead' page should be displayed
Given Enter the company name as 'Tcs'
And Enter the first name as 'Nimcy'
And Enter the last name as 'Deepika'
When Click create lead button
Then 'View Lead' page should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
