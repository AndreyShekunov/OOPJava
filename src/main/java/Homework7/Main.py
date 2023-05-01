from Drink import Drink
from HotDrink import HotDrink
from HotDrinksMachine import HotDrinksMachine

drink_list = HotDrinksMachine()
hot_drink_list = HotDrinksMachine()

drink_coca_cola = Drink('Кока-кола', 200)
drink_pepsi_cola = Drink('Пепси-кола', 200)

hot_drink_capochino = HotDrink('Капучино', 300, 65)
hot_drink_americano = HotDrink('Американо', 200, 80)

drink_list.setProduct(drink_coca_cola)
drink_list.setProduct(drink_pepsi_cola)

hot_drink_list.setProduct(hot_drink_capochino)
hot_drink_list.setProduct(hot_drink_americano)

drink_list.finishProduct()
# Название: Кока-кола, стоимость: 200
# Название: Пепси-кола, стоимость: 200

hot_drink_list.finishProduct()
# Название: Капучино; Стоимость: 300; Температура: 65
# Название: Американо; Стоимость: 200; Температура: 80
