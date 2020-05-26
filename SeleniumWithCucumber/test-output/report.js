$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/Workspace 2019/SeleniumWithCucumber/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "MMT Login Feature",
  "description": "",
  "id": "mmt-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "MMT Login Test Scenario",
  "description": "",
  "id": "mmt-login-feature;mmt-login-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user click on my account link",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enter \"\u003cusername\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user type \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user click on login",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "mmt-login-feature;mmt-login-test-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 15,
      "id": "mmt-login-feature;mmt-login-test-scenario;;1"
    },
    {
      "cells": [
        "puneetverma0711@gmail.com",
        "confidom@123"
      ],
      "line": 16,
      "id": "mmt-login-feature;mmt-login-test-scenario;;2"
    },
    {
      "cells": [
        "puneetverma@gmail.com",
        "125"
      ],
      "line": 17,
      "id": "mmt-login-feature;mmt-login-test-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "MMT Login Test Scenario",
  "description": "",
  "id": "mmt-login-feature;mmt-login-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user click on my account link",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enter \"puneetverma0711@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user type \"confidom@123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user click on login",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_click_on_my_account_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "login.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "puneetverma0711@gmail.com",
      "offset": 12
    }
  ],
  "location": "login.user_enter_email(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "login.user_click_on_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "confidom@123",
      "offset": 11
    }
  ],
  "location": "login.user_type_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "login.user_click_on_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 17,
  "name": "MMT Login Test Scenario",
  "description": "",
  "id": "mmt-login-feature;mmt-login-test-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user click on my account link",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enter \"puneetverma@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user type \"125\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user click on login",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_click_on_my_account_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "login.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "puneetverma@gmail.com",
      "offset": 12
    }
  ],
  "location": "login.user_enter_email(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "login.user_click_on_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "125",
      "offset": 11
    }
  ],
  "location": "login.user_type_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "login.user_click_on_login()"
});
formatter.result({
  "status": "skipped"
});
});