Feature: HU-004 Prueba exitosa y errada 

  Scenario: : Buscar un producto en el buscador fallido
    Given inicializo la pagina Dekosas con la url https://dekosas.com/co/
    When deseo un producto del buscador
      | nombreProducto |
      | Bion3          |
    Then puedo validar el articulo en pantalla

  Scenario: : Buscar un producto en el buscador exitoso
    Given inicializo la pagina Dekosas con la url https://dekosas.com/co/
    When deseo un producto del buscador
      | nombreProducto                                                           |
      | Lámpara Decorativa De Pared 3D Escudo Capitán América Fx - DKS Worldwide |
    Then puedo validar el articulo en pantalla
