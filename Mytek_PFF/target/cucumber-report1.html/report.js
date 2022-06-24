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
  "name": "Demander un devis d un article",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Devis1"
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
  "name": "Je demande un devis",
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
        "parametre"
      ]
    },
    {
      "cells": [
        "Ben.dhaya.ahmed.baha.eddine@hotmail.com",
        "22080023A",
        "Asus"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Demander un devis d un article",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Devis"
    },
    {
      "name": "@Devis1"
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
  "name": "Je demande un devis",
  "keyword": "And "
});
formatter.match({
  "location": "DevisStepDef.DevisStepDef.je_demande_un_devis()"
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
});