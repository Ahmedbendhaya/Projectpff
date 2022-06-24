$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Devis.feature");
formatter.feature({
  "name": "demander un devis",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Devis"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Demander un devis de plusieurs articles",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Devis2"
    }
  ]
});
formatter.step({
  "name": "Je suis connecte a mon compte avec mon \u003cmail\u003e et mon \u003cpassword\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "Selectionner un article en utilisant un \u003cparametre\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "ajouter cet article au devis",
  "keyword": "And "
});
formatter.step({
  "name": "Selectionner un article en utilisant un \u003cparametre1\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "ajouter cet article au devis",
  "keyword": "And "
});
formatter.step({
  "name": "Selectionner un article en utilisant un \u003cparametre2\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "ajouter cet article au devis",
  "keyword": "And "
});
formatter.step({
  "name": "je genere le devis",
  "keyword": "And "
});
formatter.step({
  "name": "Le devis doit etre genere",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "mail",
        "password",
        "parametre",
        "parametre1",
        "parametre2"
      ]
    },
    {
      "cells": [
        "Ben.dhaya.ahmed.baha.eddine@hotmail.com",
        "22080023A",
        "Asus",
        "PC PORTABLE ASUS CHROMEBOOK",
        "SMARTPHONE XIAOMI REDMI 9A 32G - BLEU"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Demander un devis de plusieurs articles",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Devis"
    },
    {
      "name": "@Devis2"
    }
  ]
});
formatter.step({
  "name": "Je suis connecte a mon compte avec mon Ben.dhaya.ahmed.baha.eddine@hotmail.com et mon 22080023A",
  "keyword": "Given "
});
formatter.match({
  "location": "DevisStepDef.DevisStepDef.je_suis_connecte_a_mon_compte(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Selectionner un article en utilisant un Asus",
  "keyword": "When "
});
formatter.match({
  "location": "DevisStepDef.DevisStepDef.rechercher_un_article_en_tapant_un_param_tre(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027TALAN-OKCHBNQ\u0027, ip: \u002710.70.0.193\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002718.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [null, findElement {using\u003did, value\u003dsearch}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 102.0.5005.115, chrome: {chromedriverVersion: 102.0.5005.61 (0e59bcc00cc4..., userDataDir: C:\\Users\\ABENDH~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:50370}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:50370/devtoo..., se:cdpVersion: 102.0.5005.115, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:145)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:66)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:383)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:375)\r\n\tat RechercherPage.RechercherPage.Boxsearch(RechercherPage.java:25)\r\n\tat DevisStepDef.DevisStepDef.rechercher_un_article_en_tapant_un_param_tre(DevisStepDef.java:31)\r\n\tat ✽.Selectionner un article en utilisant un Asus(file:///C:/Users/abendhaya/Desktop/Project1-main/Mytek_PFF/src/test/resources/Features/Devis.feature:18)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "ajouter cet article au devis",
  "keyword": "And "
});
formatter.match({
  "location": "DevisStepDef.DevisStepDef.ajouter_cet_article_au_devis()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Selectionner un article en utilisant un PC PORTABLE ASUS CHROMEBOOK",
  "keyword": "And "
});
formatter.match({
  "location": "DevisStepDef.DevisStepDef.rechercher_un_article_en_tapant_un_param_tre(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "ajouter cet article au devis",
  "keyword": "And "
});
formatter.match({
  "location": "DevisStepDef.DevisStepDef.ajouter_cet_article_au_devis()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Selectionner un article en utilisant un SMARTPHONE XIAOMI REDMI 9A 32G - BLEU",
  "keyword": "And "
});
formatter.match({
  "location": "DevisStepDef.DevisStepDef.rechercher_un_article_en_tapant_un_param_tre(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "ajouter cet article au devis",
  "keyword": "And "
});
formatter.match({
  "location": "DevisStepDef.DevisStepDef.ajouter_cet_article_au_devis()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "je genere le devis",
  "keyword": "And "
});
formatter.match({
  "location": "DevisStepDef.DevisStepDef.je_genere_le_devis()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Le devis doit etre genere",
  "keyword": "Then "
});
formatter.match({
  "location": "DevisStepDef.DevisStepDef.le_devis_doit_etre_genere()"
});
formatter.result({
  "status": "skipped"
});
});