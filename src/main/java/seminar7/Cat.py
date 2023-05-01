from Animal import Animal
from Salmon import Salmon


class Cat(Animal):
    def __init__(self, isInGoodMood, hunger):
        self.__isInGoodMood = isInGoodMood
        self.__hunger = hunger

    def feed(self, salmon):
        if isinstance(salmon, Salmon):
            if salmon.isCooked():
                self.__hunger -= 8
            else:
                self.__hunger -= 4

    def voice(self):
        pass

    def getisInGoodMood(self):
        return self.__isInGoodMood

    def setInGoodMood(self, inGoodMood):
        self.__isInGoodMood = inGoodMood

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
        return f"Имя: {self.__name}, возраст: {self.__age}, голод: {self.__hunger}, в хорошем настроении: {self.__isInGoodMood}"
