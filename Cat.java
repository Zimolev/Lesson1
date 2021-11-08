package com.company;

public class Cat implements Entyty{

    private String name;
    private int runDistance;
    private int jumpHeight;

    public Cat(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public int RunningDistance() {
        return this.runDistance;
    }

    @Override
    public int JumpingHeight() {
        return this.jumpHeight;
    }

    @Override
    public String names() {
        return this.name;
    }

    @Override
    public void run() {
        System.out.println("Cat " + this.name + " умеет бегать " + this.runDistance);
    }

    @Override
    public void jump() {
        System.out.println("Cat " + this.name + " умеет прыгать " + this.jumpHeight);
    }
}
