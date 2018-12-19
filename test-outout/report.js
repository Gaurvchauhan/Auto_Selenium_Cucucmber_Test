$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Selenium Java/com.selenium.java2/src/test/java/com/qa/features/freeCRM.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Free CRM Home page Test",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepsTest.user_open_browser()"
});
formatter.result({
  "duration": 3897834152,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepsTest.user_enters_username_and_password()"
});
formatter.result({
  "duration": 1163788514,
  "status": "passed"
});
});