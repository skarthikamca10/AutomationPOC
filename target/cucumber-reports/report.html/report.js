$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test.feature");
formatter.feature({
  "line": 1,
  "name": "Account Creation",
  "description": "",
  "id": "account-creation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "To Create a Userdetails",
  "description": "",
  "id": "account-creation;to-create-a-userdetails",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    },
    {
      "line": 3,
      "name": "@Userdetails"
    },
    {
      "line": 3,
      "name": "@TC01"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launch URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Provide contact information \"\u003cFirst_name\u003e\", \"\u003cLast_name\u003e\", \"\u003cPhone\u003e\",\"\u003cEmail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Provide Mailing information \"\u003cAddress\u003e\", \"\u003cCity\u003e\",\"\u003cState_Province\u003e\", \"\u003cPostal_Code\u003e\", \"\u003cCountry\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Provide User information \"\u003cUsername\u003e\", \"\u003cPassword\u003e\",\"\u003cConfirmpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User created account successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "account-creation;to-create-a-userdetails;",
  "rows": [
    {
      "cells": [
        "First_name",
        "Last_name",
        "Phone",
        "Email",
        "Address",
        "City",
        "State_Province",
        "Postal_Code",
        "Country",
        "Username",
        "Password",
        "Confirmpassword"
      ],
      "line": 12,
      "id": "account-creation;to-create-a-userdetails;;1"
    },
    {
      "cells": [
        "Karthika",
        "Sengottaiyan",
        "9791510104",
        "skarthikamca10@gmail.com",
        "Kodaiyur",
        "Karur",
        "TamilNadu",
        "639001",
        "INDIA",
        "Karthi",
        "karthimalar",
        "karthimalar"
      ],
      "line": 13,
      "id": "account-creation;to-create-a-userdetails;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 170900,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "To Create a Userdetails",
  "description": "",
  "id": "account-creation;to-create-a-userdetails;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Userdetails"
    },
    {
      "line": 3,
      "name": "@TC01"
    },
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launch URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Provide contact information \"Karthika\", \"Sengottaiyan\", \"9791510104\",\"skarthikamca10@gmail.com\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Provide Mailing information \"Kodaiyur\", \"Karur\",\"TamilNadu\", \"639001\", \"INDIA\"",
  "matchedColumns": [
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Provide User information \"Karthi\", \"karthimalar\",\"karthimalar\"",
  "matchedColumns": [
    9,
    10,
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User created account successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountCreation.userLaunchURL()"
});
formatter.result({
  "duration": 8114895200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Karthika",
      "offset": 29
    },
    {
      "val": "Sengottaiyan",
      "offset": 41
    },
    {
      "val": "9791510104",
      "offset": 57
    },
    {
      "val": "skarthikamca10@gmail.com",
      "offset": 70
    }
  ],
  "location": "AccountCreation.provideContactInformation(String,String,String,String)"
});
formatter.result({
  "duration": 743193499,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kodaiyur",
      "offset": 29
    },
    {
      "val": "Karur",
      "offset": 41
    },
    {
      "val": "TamilNadu",
      "offset": 49
    },
    {
      "val": "639001",
      "offset": 62
    },
    {
      "val": "INDIA",
      "offset": 72
    }
  ],
  "location": "AccountCreation.provideMailingInformation(String,String,String,String,String)"
});
formatter.result({
  "duration": 750088499,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Karthi",
      "offset": 26
    },
    {
      "val": "karthimalar",
      "offset": 36
    },
    {
      "val": "karthimalar",
      "offset": 50
    }
  ],
  "location": "AccountCreation.provide_User_information(String,String,String)"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 5584267899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 13
    }
  ],
  "location": "AccountCreation.userShouldButton(String)"
});
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "duration": 7712237000,
  "status": "passed"
});
formatter.match({
  "location": "AccountCreation.userCreatedAccountSuccessfully()"
});
formatter.write("Note: Your user name is Karthi.");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "duration": 5360603900,
  "status": "passed"
});
formatter.after({
  "duration": 808875500,
  "status": "passed"
});
});