$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Features/AmazonSearch.feature");
formatter.feature({
  "name": "amazon search",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@UserStory02"
    }
  ]
});
formatter.scenario({
  "name": "seach item",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UserStory02"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "Entered Item name \u0027apple\u0027",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "item will be shown",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});