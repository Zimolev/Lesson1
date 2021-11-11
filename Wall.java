package com.company;

public class Wall implements Barier {

    private int heigth;

    public Wall(int heigth) {
        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    public boolean moving(Entyty entyty) {
        entyty.jump();

        System.out.print("Барьер высотой: " + heigth + " " +  entyty.names());

        if (getHeigth() <= entyty.JumpingHeight()) {
            System.out.println(" смог перепрыгнуть");

            return true;
        } else {
            System.out.println(" не смог перепрыгнуть");

            return false;
        }
    }
}
