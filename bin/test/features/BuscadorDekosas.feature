Feature: HU-001 Buscador Dekosas
  Yo como usuario de Dekosas
  Quiero usar el buscador
  Para ver los productos que manejan

  Scenario Outline: <Escenario>
    Given me encuentro en la pagina de Dekosas con la url <Url>
    When busco el producto <Producto> en el buscador
    Then podre ver el producto <Producto> en la pantalla

    Examples: 
      | Escenario                                 | Producto                                                                 | Url                     |
      | Buscar el producto en el buscador Dekosas | Lámpara Decorativa De Pared 3D Escudo Capitán América Fx - DKS Worldwide | https://dekosas.com/co/ |
      | Buscar el producto en el buscador Dekosas | Báscula De Grasa Corporal Con Bluetooth Renpho - DKS Worldwide           | https://dekosas.com/co/ |
      | Buscar el producto en el buscador Dekosas | Lámpara Candelabro Negro - Bedlife                                       | https://dekosas.com/co/ |
      | Buscar el producto en el buscador Dekosas | Lámpara Colgante Helio Oval - Lienxo                                     | https://dekosas.com/co/ |
      | Buscar el producto en el buscador Dekosas | Licuadora Manual Negra - Bodum                                           | https://dekosas.com/co/ |
