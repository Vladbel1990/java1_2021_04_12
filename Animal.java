package ru.geekbrains.java1.lesson2;

public abstract class Animal {

    public static int count;

    public static int getCount() {
        return count;

    }

    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected int maxSwimDistance;

    public Animal(int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        count++;
    }

    public abstract boolean run(int distance);
    public abstract boolean swim(int distance);
    public abstract boolean jump(int height);

    public void printInfo() {
        System.out.println(this);
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "maxRunDistance=" + maxSwimDistance +
                ", maxJumpHeight=" + maxJumpHeight +
                ", maxSwimDistance=" + maxSwimDistance +
                '}';
    }
}
