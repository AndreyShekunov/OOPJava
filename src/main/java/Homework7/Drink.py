class Drink():
    def __init__(self, name, valume):
        self.__name = name
        self.__valume = valume

    def getName(self):
        return self.__name

    def setName(self, name):
        self.__name = name

    def getValume(self):
        return self.__valume

    def setValume(self, valume):
        self.__valume = valume

    def __str__(self):
        return f"Название: {self.__name}, стоимость: {self.__valume}"
