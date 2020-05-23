$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/RITESH/seleniumframework/CucumberPOM/src/main/java/com/qa/features/Guru99.feature");
formatter.feature({
  "line": 1,
  "name": "Guru99 demo application test",
  "description": "",
  "id": "guru99-demo-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Guru99 home page test",
  "description": "",
  "id": "guru99-demo-application-test;validate-guru99-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user logging into system",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate homepage title",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 15110482889,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 193176041,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enter_username_and_password()"
});
formatter.result({
  "duration": 2712292149,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_homepage_title()"
});
formatter.result({
  "duration": 10816459520,
  "status": "passed"
});
});