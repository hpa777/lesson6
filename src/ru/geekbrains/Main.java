package ru.geekbrains;

public class Main {

    public static void main(String[] args) {
	    Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Дружок");
        Cat cat1 = new Cat("Мурзик");

        System.out.println("Всего собак: " + Dog.getCreatedCount());
        System.out.println("Всего котов: " + Cat.getCreatedCount());
        System.out.println("Всего животных: " + Animal.getCreatedCount());

        try {
            dog1.run(300);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            dog2.run(700);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            cat1.swim(5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
