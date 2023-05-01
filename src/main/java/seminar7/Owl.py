from Animal import Animal
from Salmon import Salmon


class Owl(Animal):
    def __init__(self, isDomesticated, hunger):
        self.__isDomesticated = isDomesticated
        self.__hunger = hunger

    def feed(self, salmon):
        if isinstance(salmon, Salmon):
            if salmon.isCooked():
                self.__hunger -= 10
            else:
                self.__hunger -= 9

    def voice(self):
        pass

    def getIsDomesticated(self):
        return self.__isDomesticated

    def setIsDomesticated(self, isDomesticated):
        self.__isDomesticated = isDomesticated

    def getHunger(self):
        return self.__hunger

    def setHunger(self, hunger):
        self.__hunger = hunger

    def getName(self):
        return self.__name

    def setName(self, name):
        self.__name = name

    def getAge(self):
        return self.__age

    def setAge(self, age):
        self.__age = age

    def __str__(self):
        return f"Имя: {self.__name}, возраст: {self.__age}, голод: {self.__hunger}, одомашненный: {self.__isDomesticated}"
