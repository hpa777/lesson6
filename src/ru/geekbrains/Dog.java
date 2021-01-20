package ru.geekbrains;

public class Dog extends Animal{

    private static int createdCount;

    public static int getCreatedCount() {
        return createdCount;
    }

    public Dog(String name) {
        super(name);
        createdCount++;
    }

    @Override
    public void run(int length) {
        if (length <= 500) {
            super.run(length);
        } else {
            throw new IllegalArgumentException(super.name + " не может пробежать больше 500 метров");
        }
    }

    @Override
    public void swim(int length) {
        if (length <= 10) {
            super.swim(length);
        } else {
            throw new IllegalArgumentException(super.name + " не может проплыть больше 10 метров");
        }

    }

}