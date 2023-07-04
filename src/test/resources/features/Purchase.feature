Feature: Realizar una compra en Sauce Demo

  Scenario: Realizar un flujo de compra exitoso
    Given que el usuario se encuentra en la página de inicio
    When el usuario se autentica con el usuario "standard_user" y la contraseña "secret_sauce"
    And el usuario agrega dos productos al carrito, visualiza el carrito y completa el formulario de compra
    Then la compra se finaliza con éxito y se muestra el mensaje "THANK YOU FOR YOUR ORDER"
