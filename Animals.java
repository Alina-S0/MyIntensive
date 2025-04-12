public class Animals {
        public static void main(String[] args) {
            Dog dog1 = new Dog("Вася");
            Cat cat1 = new Cat("Лили");
            Cat cat2 = new Cat("Граф");
        
            System.out.println("Животных всего: " + Animal.getAnimalCount());
            System.out.println("Собак всего: " + Dog.getDogCount());
            System.out.println("Котов всего: " + Cat.getCatCount());

            dog1.run(450);
            dog1.swim(9);

            cat1.run(100);
            cat1.swim(10);

            Foods foods = new Foods();
            Cat[] cats = {cat1, cat2};

            for (Cat cat : cats) {
                cat.eat(foods, 9);
                System.out.println(cat.getName() + " сыт: " + cat.isFull());
            }
            System.out.println("Остаток еды в миске: " + foods.getFood() + " ед.");

            foods.addFood(17);
            System.out.println("Еда добавлена, в миске теперь: " + foods.getFood() + " ед.");

            for (Cat cat : cats) {
                if (!cat.isFull()) {
                    cat.eat(foods, 10);
                    System.out.println(cat.getName() + " сыт: " + cat.isFull());
                }
            }
            System.out.println("Осталось еды: " + foods.getFood() + " ед.");

        }

    }

    abstract class Animal {
        protected String name;
        protected static int animalCount = 0;

        public Animal(String name) {
            this.name = name;
            animalCount++;
        }

        public abstract void run(int distance);
        public abstract void swim(int distance);

        public static int getAnimalCount() {
            return animalCount;
        }

        public String getName() {
            return name;
        }
    }

    class Dog extends Animal {
        private static final int MAX_RUN_DISTANCE = 500;
        private static final int MAX_SWIM_DISTANCE = 10;
        private static int dogCount = 0;

        public Dog(String name) {
            super(name);
            dogCount++;
        }

        public void run(int distance) {
            if (distance <= MAX_RUN_DISTANCE) {
                System.out.println(name + " пробежал " + distance);
            } else {
                System.out.println(name + " не смог пробежать " + distance);
            }
        }

        public void swim(int distance) {
            if (distance <= MAX_SWIM_DISTANCE) {
                System.out.println(name + " проплыл " + distance);
            } else {
                System.out.println(name + " не смог проплыть " + distance);
            }
        }

        public static int getDogCount() {
            return dogCount;
        }
    }

    class Cat extends Animal {
        private static final int MAX_RUN_DISTANCE = 200;
        private static int catCount = 0;
        private boolean isFull;

        public Cat(String name) {
            super(name);
            catCount++;
            this.isFull = false;
        }

        public void run(int distance) {
            if (distance <= MAX_RUN_DISTANCE) {
                System.out.println(name + " пробежал(а) " + distance + " м.");
            } else {
                System.out.println(name + " не смог(ла) пробежать " + distance + " м.");
            }
        }

        public void swim(int distance) {
            System.out.println(name + " не умеет плавать");
        }

        public void eat(Foods foods, int amount) {
            if (foods.decreaseFood(amount)) {
                this.isFull = true;
                System.out.println(name + " поел(a) и теперь сыт(a)");
            } else {
                System.out.println(name + " не смог(ла) поесть - недостаточно еды в миске");
            }
        }

        public boolean isFull() {
            return isFull;
        }

        public static int getCatCount() {
            return catCount;
        }
    }

    class Foods {
        private int food;

        public void foods(int foods) {
            this.food = foods;
        }

        public boolean decreaseFood(int amount) {
            if (amount <= 0) {
                System.out.println("Eды должно быть больше нуля");
                return false;
            }
            if (food >= amount) {
                food -= amount;
                return true;
            }
            System.out.println("Недостаточно еды - oсталось: " + food + " ед.");
            return false;
        }

        public void addFood(int amount) {
            if (amount > 0) {
                food += amount;
                System.out.println("Добавили " + amount + " еды в миску");
            } else {
                System.out.println("Количество добавляемой еды должно быть больше нуля!");
            }
        }

        public int getFood() {
            return food;
        }
    }
