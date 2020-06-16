@FluxoProposta @GravarProposta
Feature: Service youtube

  Background: 
    Given que acesso o youtube
    And pesquiso um video

  Scenario: vizualizar video
    When curto o video
    Then acessarei o video certo
