#Author: vestupinan@qvision.com.co
#language:es

Característica: Verificar que el usuario inicie sesion correctamente

  como cliente de la tienda
  quiero acceder a la tienda web
  para ver el detalle de un producto




  Esquema del escenario: conocer el detalle de un producto de la tienda
    Dado el usuario tiene sus datos para iniciar sesion
      | usuario   | claveUsuario   |
      | <usuario> | <claveUsuario> |
    Cuando el usuario se autentica en la pagina
    Y selecciona un producto
      | <item> |
    Entonces el puede ver las especificaciones del producto BACK

    Ejemplos:

      | usuario       | claveUsuario | item                |
      | standard_user | secret_sauce | Sauce Labs Backpack |