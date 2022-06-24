Feature: Cc.feature
  I want to use this template for my feature file
@inscription
  Scenario Outline: Tester la creation de compte
    Given Navigateur ouvert
    And Utilisateur dans la page de creation
    When je_tape <prenom> and <nom> and <Email> and <MDP> and <Confirmation_MDP>
    And je clique sur creer un compte
    Then page d_acceuil ouverte avec <prenom> and <nom> and <Email> and <MDP> and <Confirmation_MDP>

    Examples: 
      | prenom  | nom  | Email          | MDP         | Confirmation_MDP |
      |         | AZER | faresW11@gmail.com | faresfares2 | faresfares2      |
      | AZER123 | AZER | faresW22@gmail.com | faresfares2 | faresfares2      |
      |     123 | AZER | faresW33@gmail.com | faresfares2 | faresfares2      |
      | AZER    | AZER | faresW44@gmail.com | faresfares2 | faresfares2      |
      