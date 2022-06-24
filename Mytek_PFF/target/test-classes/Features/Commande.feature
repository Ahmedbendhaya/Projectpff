Feature: passer une commande
 @Commande1
  Scenario Outline: Passer une commande en utilisant le mode de livraison a domicile et le paiement a la livraison
    Given Je suis connecte a mon compte avec mon <mail> et mon <password>
    When Selectionner un article en utilisant un <parametre>
    And ajouter cet article au panier
    And Selectionner un article en utilisant un <parametre1>
    And ajouter cet article au panier
    And Choisir le mode de livraison 
    And Choisir le mode de paiement
    Then Le récapitulatif de la commande est affichee domicile

    Examples: 
      | mail                                    | password  | parametre       | parametre1                                                                   |
      | Ben.dhaya.ahmed.baha.eddine@hotmail.com | 22080023A | Asus ChromeBook | PC PORTABLE LENOVO IDEAPAD 1 11IGL05 N4020 4GO 128GO SSD - GRIS (81VT0058FG) |
@Commande2
     Scenario Outline: Passer une commande en utilisant le mode de livraison parcking drive et le paiement a la livraison
    Given Je suis connecte a mon compte avec mon <mail> et mon <password>
    When Selectionner un article en utilisant un <parametre>
    And ajouter cet article au panier
    And Selectionner un article en utilisant un <parametre1>
    And ajouter cet article au panier
    And Choisir le mode de livraison Parcking drive
    And Choisir le mode de paiement
    Then Le récapitulatif de la commande est affichee

    Examples: 
      | mail                                    | password  | parametre       | parametre1                                                                   |
      | Ben.dhaya.ahmed.baha.eddine@hotmail.com | 22080023A | Asus ChromeBook | PC PORTABLE LENOVO IDEAPAD 1 11IGL05 N4020 4GO 128GO SSD - GRIS (81VT0058FG) |
    