package threads;

import general.Egg;
import zoo.Cage;

import java.util.ArrayList;

public class ReptileEggHatcherThread extends Thread {
    private Cage reptileCage;
    private ArrayList<Egg> reptileEggs;


    public ReptileEggHatcherThread(Cage reptileCage, ArrayList<Egg> reptileEggs) {
        this.reptileCage = reptileCage;
        this.reptileEggs = reptileEggs;
    }


    @Override
    public void run() {
        super.run();
        try {
            sleep(10000);

            reptileCage.addReptileEggs(reptileEggs);


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
