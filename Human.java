package com.company;

public class Human implements Entyty{

    private String name;
    private int jumpHeight;
    private int runDistance;

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

    public Human(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    @Override
    public void run() {
        System.out.println("Human " + this.name + " умеет бегать " + this.runDistance);

    }

    @Override
    public void jump() {
        System.out.println("Human " + this.name + " умеет прыгать " + this.jumpHeight);
    }


}
