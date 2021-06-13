Feature: HU001

  Background: 
    Given que me encuentro en la pagina de Dekosas con la url https://https://dekosas.com/co/

  Scenario: Buscar el producto en el buscador de Dekosas
    When busco un producto en el buscador
      | nombreProducto                                                           |
      | Lámpara Decorativa De Pared 3D Escudo Capitán América Fx - DKS Worldwide |
    Then podre ver el producto buscado en la pantalla

  Scenario: Buscar el producto en el buscador de Dekosas
    When busco un producto en el buscador
      | nombreProducto                                                 |
      | Báscula De Grasa Corporal Con Bluetooth Renpho - DKS Worldwide |
    Then podre ver el producto buscado en la pantalla
