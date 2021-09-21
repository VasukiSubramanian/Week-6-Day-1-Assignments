Feature: Merge Lead functionality of Leaftaps application

Scenario Outline: Merge two existing leads

Given Click on Merge Leads link
Given Click on From Lead widget
Given Enter <firstname1> in firstname field
Given Click on Find Leads button
Given Click on First LeadID
Given Click on To Lead widget
Given Enter <firstname2> in firstname field
Given Click on Find Leads button
Given Click on First LeadID
When Click Merge Button
Then View Leads page should be displayed

Examples:
|firstname1|firstname2|
|'go'|'ba'|