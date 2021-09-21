Feature: Create Lead functionality of Leaftaps application

Scenario Outline: Create a new Lead

Given Click on Create Lead link
Given Enter the companyname as <companyname>
Given Enter the firstname as <firstname>
Given Enter the lastname as <lastname>
Given Enter the phonenumber as <phonenumber>
When Click on Create Lead button
Then View Leads page should be displayed

Examples:
|companyname|firstname|lastname|phonenumber|
|'TestLeaf'|'vasu'|'s'|'99'|
|'TestLeaf'|'sasi'|'s'|'99'|
|'TestLeaf'|'karthi'|'s'|'99'|