package ru.geekbrains;

public class Cat extends Animal {

    private static int createdCount;

    public static int getCreatedCount() {
        return createdCount;
    }

    public Cat(String name) {
        super(name);
        createdCount++;
    }

    @Override
    public void run(int length) {
        if (length <= 200) {
            super.run(length);
        } else {
            throw new IllegalArgumentException(super.name + " не может пробежать больше 200 метров");
        }
    }

    @Override
    public void swim(int length) {
        throw new UnsupportedOperationException(super.name + " не умеет плавать");
    }

}
