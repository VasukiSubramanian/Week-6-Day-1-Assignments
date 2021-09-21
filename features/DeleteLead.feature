Feature: Delete Lead functionality of Leaftaps application

Scenario Outline: Delete existing lead

Given Click on Find Leads link
Given Click on Phone link
Given Search for phonenumber <phonenumber>
Given Click on Find Leads button
Given Click on First LeadID
When Click on Delete button
Then My Leads page should be displayed

Examples:
|phonenumber|
|'99'|