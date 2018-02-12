package interfaces;



import general.Egg;

import java.util.ArrayList;

public interface IBird extends IEggLayer {

    String fly();

    void hatchEggs(ArrayList<Egg> layedEggs);


}
