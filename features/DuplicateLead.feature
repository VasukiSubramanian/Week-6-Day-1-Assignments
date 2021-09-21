Feature: Duplicate Lead functionality of Leaftaps application

Scenario Outline: Duplicate existing lead

Given Click on Find Leads link
Given Click on Phone link
Given Search for phonenumber <phonenumber>
Given Click on Find Leads button
Given Click on First LeadID
Given Click Duplicate Lead Link
When Click on Update button
Then View Leads page should be displayed

Examples:
|phonenumber|
|'99'|