ackage com.company;

public class Treadmill implements Barier{

    private int run;

    public Treadmill(int run) {
        this.run = run;
    }

    public int getRun() {
        return run;
    }

    public boolean moving(Entyty entyty){

        entyty.run();

        System.out.print("Беговая дорожка длиной: " + run + " " +  entyty.names());

        if (getRun() <= entyty.RunningDistance()) {
            System.out.println(" смог пробежать");

            return true;
        } else {
            System.out.println(" не смог пробежать");

            return false;
        }
    }

}
