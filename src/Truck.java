public class Truck extends Vehicle{
    // Creating 2 other variables
    public int seats;
    double trunkSpace;

    // Default constructor
    public Truck(){
    }

    //Mirror constructors from Vehicle class
    public Truck(String color){
        super(color);
    }

    public Truck(String color, int numDoors){
        super(color, numDoors);
    }

    public Truck(int numDoors, boolean gasPowered){
        super(numDoors, gasPowered);
    }

    public Truck(String color,  int numDoors, boolean gasPowered){
        super(color, numDoors, gasPowered);
    }

    // Constructors that use variables from Truck class
    public Truck(String color,  int numDoors, boolean gasPowered, int seats){
        super(color, numDoors, gasPowered);
        this.seats = seats;
    }

    public Truck(String color,  int numDoors, boolean gasPowered, double trunkSpace){
        super(color, numDoors, gasPowered);
        this.trunkSpace = trunkSpace;
    }

    public Truck(String color,  int numDoors, boolean gasPowered, int seats, double trunkSpace){
        super(color, numDoors, gasPowered);
        this.trunkSpace = trunkSpace;
        this.seats = seats;
    }

    //Overridden toString method for Truck class
    @Override
    public String toString() {
        return "Truck{" +
                "color='" + getColor() + '\'' +
                ", numDoors=" + getNumDoors() +
                ", gasPowered=" + getGasPowered() +
                '}' + "seats= " + seats + "Trunk Space= " +
                trunkSpace;
    }

    @Override
    public boolean isEcoFriendly() {
        return super.isEcoFriendly() && seats <= 2 && trunkSpace == 0;
    }

}
