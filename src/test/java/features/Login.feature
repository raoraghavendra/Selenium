Feature: Application login

Scenario Outline: Home page default login

Given User is on landing page "https://www.classicrummy.com/"
When User login into application with <username> and <password>  and  Clicked on submit button
Then Home page is populated

Examples:
|username         |password  |
|9505236581     |949494     |
|9505236581     |123456     |
