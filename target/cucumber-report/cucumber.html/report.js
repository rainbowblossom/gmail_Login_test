$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Gmail login functionality",
  "description": "As a user i want to login in gmail account",
  "id": "gmail-login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4443403800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "I should login with valid credentials successfully",
  "description": "",
  "id": "gmail-login-functionality;i-should-login-with-valid-credentials-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I enter username \"testqa5556@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter password \"Abcd4567\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I am able to login gmail account",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I verify that gmail logo is displayed",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "testqa5556@gmail.com",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterUsername(String)"
});
formatter.result({
  "duration": 194700400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnNextButton()"
});
formatter.result({
  "duration": 74085600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Abcd4567",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 3063651400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnNextButton()"
});
formatter.result({
  "duration": 68095200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iAmAbleToLoginGmailAccount()"
});
formatter.result({
  "duration": 89600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iVerifyThatGmailLogoIsDisplayed()"
});
formatter.result({
  "duration": 4224063100,
  "status": "passed"
});
formatter.after({
  "duration": 655836600,
  "status": "passed"
});
});