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
  "name": "Demander un devis apres le vidage du devis",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Devis3"
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
  "name": "Je vide le devis",
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
  "name": "Demander un devis apres le vidage du devis",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Devis"
    },
    {
      "name": "@Devis3"
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
  "status": "passed"
});
formatter.step({
  "name": "ajouter cet article au devis",
  "keyword": "And "
});
formatter.match({
  "location": "DevisStepDef.DevisStepDef.ajouter_cet_article_au_devis()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Je vide le devis",
  "keyword": "And "
});
formatter.match({
  "location": "DevisStepDef.DevisStepDef.je_vide_le_devis()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Selectionner un article en utilisant un PC PORTABLE ASUS CHROMEBOOK",
  "keyword": "And "
});
formatter.match({
  "location": "DevisStepDef.DevisStepDef.rechercher_un_article_en_tapant_un_param_tre(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ajouter cet article au devis",
  "keyword": "And "
});
formatter.match({
  "location": "DevisStepDef.DevisStepDef.ajouter_cet_article_au_devis()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Selectionner un article en utilisant un SMARTPHONE XIAOMI REDMI 9A 32G - BLEU",
  "keyword": "And "
});
formatter.match({
  "location": "DevisStepDef.DevisStepDef.rechercher_un_article_en_tapant_un_param_tre(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ajouter cet article au devis",
  "keyword": "And "
});
formatter.match({
  "location": "DevisStepDef.DevisStepDef.ajouter_cet_article_au_devis()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je genere le devis",
  "keyword": "And "
});
formatter.match({
  "location": "DevisStepDef.DevisStepDef.je_genere_le_devis()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Le devis doit etre genere",
  "keyword": "Then "
});
formatter.match({
  "location": "DevisStepDef.DevisStepDef.le_devis_doit_etre_genere()"
});
formatter.result({
  "status": "passed"
});
});rCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:614)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:618)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getCurrentUrl(RemoteWebDriver.java:340)\r\n\tat LoginPage.LoginPage.Verif_Cnx(LoginPage.java:25)\r\n\tat DevisStepDef.DevisStepDef.je_suis_connecte_a_mon_compte(DevisStepDef.java:25)\r\n\tat ✽.Je suis connecte a mon compte avec mon Ben.dhaya.ahmed.baha.eddine@hotmail.com et mon 22080023A(file:///C:/Users/abendhaya/Desktop/Project1-main/Mytek_PFF/src/test/resources/Features/Devis.feature:33)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Selectionner un article en utilisant un Asus",
  "keyword": "When "
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
  "name": "Je vide le devis",
  "keyword": "And "
});
formatter.match({
  "location": "DevisStepDef.DevisStepDef.je_vide_le_devis()"
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