class HotDrink():
    def __init__(self, name, value, temperature):
        self.__temperature = temperature
        self.__value = value
        self.__name = name

    def getTemperature(self):
        return self.__temperature

    def setTemperature(self, temperature):
        self.__temperature = temperature

    def getValue(self):
        return self.__value

    def setValue(self, value):
        self.__value = value

    def getName(self):
        return self.__name

    def setName(self, name):
        self.__name = name

    def __str__(self):
        return f"Название: {self.__name}; Стоимость: {self.__value}; Температура: {self.__temperature}"
