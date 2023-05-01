from VendingMachine import VendingMachine


class HotDrinksMachine(VendingMachine):
    def __init__(self):
        super().__init__()
        self.__finishProduct = list()

    def getHotDrinkMachine():
        pass

    def setProduct(self, product):
        self.__finishProduct.append(product)

    def finishProduct(self):
        for drink in self.__finishProduct:
            print(drink)
