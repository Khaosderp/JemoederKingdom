package special;

import interfaces.IBird;
import interfaces.IMammal;
import interfaces.IReptile;
import general.Animal;
import general.Egg;
import general.Gender;

import java.util.ArrayList;

public class Platypus extends Animal implements IBird, IMammal, IReptile {

    public Platypus() {
        super();
    }

    public Platypus(Gender gender, String bodyCovering, String name, String color, double weight, int maxNumberOfEggs) {
        super(gender, bodyCovering, name, color, weight, maxNumberOfEggs);
    }

    @Override
    public String communicate() {
        return ("Hey, where's perry rrrrrrrrrrrr");
    }

    @Override
    public String fly() {
        return ("A platypus can't fly! What did you expect?");
    }

    @Override
    public String crawl() {
        return ("CRAAAAAAAAAAAAAAAAWLINNG IN MY SKIIIIIIIIIIIIIIIIIN");
    }

    @Override
    public void suckle() {

    }

    @Override
    public void hatchEggs(ArrayList<Egg> layedEggs) {
    }

    @Override
    public ArrayList<Egg> layEggs() {
        return null;
    }


}
