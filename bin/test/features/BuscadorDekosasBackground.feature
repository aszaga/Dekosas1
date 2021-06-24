Feature: HU-003 Buscador Dekosas Background

  Background: 
    Given  me encuentro en la pagina de Dekosas con la url https://dekosas.com/co/

  Scenario: : Buscar un producto en el buscador
    When busco un producto en el buscador
      | nombreProducto                                                           |
      | Lámpara Decorativa De Pared 3D Escudo Capitán América Fx - DKS Worldwide |
    Then podre ver el producto buscado en pantalla

  Scenario: : Buscar un producto en el buscador
    When busco un producto en el buscador
      | nombreProducto                                                 |
      | Báscula De Grasa Corporal Con Bluetooth Renpho - DKS Worldwide |
    Then podre ver el producto buscado en pantalla
