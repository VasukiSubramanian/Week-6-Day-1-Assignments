Feature: Edit Lead functionality of Leaftaps application

Scenario Outline: Edit existing lead

Given Click on Find Leads link
Given Click on Phone link
Given Search for phonenumber <phonenumber>
Given Click on Find Leads button
Given Click on First LeadID
Given Click on Edit link
Given Rename companyname as <companyname>
When Click on Update button
Then View Leads page should be displayed

Examples:
|companyname|phonenumber|
|'TestLeaf'|'99'|