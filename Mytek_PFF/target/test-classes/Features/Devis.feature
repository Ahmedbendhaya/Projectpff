@Devis
Feature: demander un devis

  @Devis1
  Scenario Outline: Demander un devis d un article
    Given Je suis connecte a mon compte avec mon <mail> et mon <password>
    When Selectionner un article en utilisant un <parametre>
    And Je demande un devis
    Then Le devis doit etre genere

    Examples: 
      | mail                                    | password  | parametre |
      | Ben.dhaya.ahmed.baha.eddine@hotmail.com | 22080023A | Asus      |

   @Devis2
  Scenario Outline: Demander un devis de plusieurs articles
    Given Je suis connecte a mon compte avec mon <mail> et mon <password>
    When Selectionner un article en utilisant un <parametre>
    And ajouter cet article au devis
    And Selectionner un article en utilisant un <parametre1>
    And ajouter cet article au devis
    And Selectionner un article en utilisant un <parametre2>
    And ajouter cet article au devis
    And je genere le devis
    Then Le devis doit etre genere

    Examples: 
      | mail                                    | password  | parametre | parametre1                  | parametre2                            |
      | Ben.dhaya.ahmed.baha.eddine@hotmail.com | 22080023A | Asus      | PC PORTABLE ASUS CHROMEBOOK | SMARTPHONE XIAOMI REDMI 9A 32G - BLEU |

  @Devis3 
  Scenario Outline: Demander un devis apres le vidage du devis
    Given Je suis connecte a mon compte avec mon <mail> et mon <password>
    When Selectionner un article en utilisant un <parametre>
    And ajouter cet article au devis
    And Je vide le devis
    And Selectionner un article en utilisant un <parametre1>
    And ajouter cet article au devis
    And Selectionner un article en utilisant un <parametre2>
    And ajouter cet article au devis
    And je genere le devis
    Then Le devis doit etre genere

    Examples: 
      | mail                                    | password  | parametre | parametre1                  | parametre2                            |
      | Ben.dhaya.ahmed.baha.eddine@hotmail.com | 22080023A | Asus      | PC PORTABLE ASUS CHROMEBOOK | SMARTPHONE XIAOMI REDMI 9A 32G - BLEU |

  @Devis4 
  Scenario Outline: Demander un devis Lorsque je ne suis pas connecté
    Given Je suis dans la page de MyTek
    When Selectionner un article en utilisant un <parametre>
    And ajouter cet article au devis
    And Je clique sur la page de devis
    Then Un formulaire doit s afficher
    When Je remplis le formulaire avec mon <mail> et mon (<prenom> et mon <nom>
    And Je demande le devis
    Then Le devis doit etre envoye

    Examples: 
      | mail                                  | prenom | parametre | nom       |
      | Ben.dhaya.ahmed.baha.eddine@yahoo.com | ahmed  | Asus      | ben dhaya |

  @Devis5
  Scenario Outline: Ajouter un article au devis lorsqu il est hors stock
    Given Je suis connecte a mon compte avec mon <mail> et mon <password>
    When Selectionner un article en utilisant un <parametre>
    Then le bouton ajouter au devis n est pas disponible

    Examples: 
      | mail                                    | password  | parametre                                                 |
      | Ben.dhaya.ahmed.baha.eddine@hotmail.com | 22080023A | PC PORTABLE ACER ASPIRE A315-56 I3 10È GÉN 8GO 1TO - NOIR |
