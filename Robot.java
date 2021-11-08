package com.company;

public class Robot implements Entyty{

    private String name;
    private int runDistance;
    private int jumpHeight;

    public Robot(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Robot " + this.name + " умеет бегать " + this.runDistance);

    }

    @Override
    public void jump() {
        System.out.println("Robot " + this.name + " умеет прыгать " + this.jumpHeight);
    }

    @Override
    public int RunningDistance() {
        return this.runDistance;
    }

    @Override
    public String names() {
        return this.name;
    }

    @Override
    public int JumpingHeight() {
        return this.jumpHeight;
    }


}
