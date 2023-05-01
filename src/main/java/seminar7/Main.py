from Cat import Cat
from Dog import Dog
from Owl import Owl
from Salmon import Salmon

cat_one = Cat(True, 90)
cat_one.setName('Мурзик')
cat_one.setAge(3)

dog_one = Dog('борзая', 70)
dog_one.setName('Мухтар')
dog_one.setAge(4)

owl_one = Owl(True, 80)
owl_one.setName('Совух')
owl_one.setAge(1)

salmon_one = Salmon(True)
# Имя: Мурзик, возраст: 3, голод: 90, в хорошем настроении: True
print(cat_one)
cat_one.feed(salmon_one)
# Имя: Мурзик, возраст: 3, голод: 82, в хорошем настроении: True
print(cat_one)
print()

print(dog_one)
# Имя: Мухтар, возраст: 4, голод: 70, порода: борзая
dog_one.feed(salmon_one)
print(dog_one)
# Имя: Мухтар, возраст: 4, голод: 65, порода: борзая
print()

print(owl_one)
# Имя: Совух, возраст: 1, голод: 80, одомашненный: True
owl_one.feed(salmon_one)
print(owl_one)
# Имя: Совух, возраст: 1, голод: 70, одомашненный: True
