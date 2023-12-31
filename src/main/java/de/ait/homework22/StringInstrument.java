package de.ait.homework22;

public class StringInstrument  extends MusicalInstrument{

    private int numberOfStrings;

    public StringInstrument(String name, String type, double price, int numberOfStrings) {
        super(name, type, price);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play(){
        System.out.println("plays "  + getName() + " with number of strings "  + numberOfStrings);
    }
}
