package ru.geekbrains;

public class Animal {

    private static int createdCount;

    public static int getCreatedCount() {
        return createdCount;
    }

    protected String name;

    public Animal(String name) {
        createdCount++;
        this.name = name;
    }

    public void run(int length) {
        if (length > 0) {
            System.out.printf("%s пробежал %d метров.\n", this.name, length);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void swim(int length) {
        if (length > 0) {
            System.out.printf("%s проплыл %d метров.\n", this.name, length);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
