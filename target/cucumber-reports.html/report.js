$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/alert.feature");
formatter.feature({
  "name": "AlertHandling",
  "description": "  As a user I want to handle alerts",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I can accept an alert",
  "description": "    As a user I wanna click alerts",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "main page is open",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.MainPageSteps.mainPageIsOpen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open the Alerts page",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.MainPageSteps.iOpenTheAlertsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I make the alert appear",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.AlertSteps.iMakeTheAlertAppear()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I accept the alert",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.AlertSteps.iAcceptTheAlert()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The success message appears",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.AlertSteps.theSuccessMessageAppears()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});