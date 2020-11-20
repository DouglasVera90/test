Feature: Cargar un producto en el carro de compra Ripley y que el precio sea el espardo
	Como usuario quiero cargar un notebook en el carro de compra del sitio de Ripley
	
Scenario: Verificar que el usuario pueda cargar un notebook en el carro de compra del sitio Ripley
	Given que el usuario esta en el sitio de Ripley
	When el usuario hace click en el boton menu
	And el usuario hace click en el boton tecno
	And el usuario hace click en el boton Notebooks
	And el usuario filtra por marca HP
	And el usuario hace click en el primer notebook de la lista
	And el usuario hace click en el boton agregar a la bolsa
	And el usuario hace click en el boton continuar
	And el usuario hace click en el boton bolsa de compra
	And el usuario hace click el el boton ir a la bolsa
	Then el precio del producto es el esperado
		| $849.990 |