public class Vehicle {
    // Creating 3 variables
    public String color;
    private int numDoors;
    boolean gasPowered;

    // Default constructor
    public Vehicle(){
    }

    // Constructors that take parameters
    public Vehicle(String color){
        this.color = color;
    }

    public Vehicle(String color, int numDoors){
        this.color = color;
        this.numDoors = numDoors;
    }

    public Vehicle(int numDoors, boolean gasPowered){
        this.numDoors = numDoors;
        this.gasPowered = gasPowered;
    }

    public Vehicle(String color,  int numDoors, boolean gasPowered){
        this.color = color;
        this.numDoors = numDoors;
        this.gasPowered = gasPowered;
    }

    // Cresting getters
    public String getColor(){
        return color;
    }
    public int getNumDoors(){
        return numDoors;
    }
    public boolean getGasPowered(){
        return gasPowered;
    }

    // Creating setters
    public void setColor(String color){
        this.color = color;
    }
    public void setNumDoors(int numDoors){
        this.numDoors = numDoors;
    }
    public void setGasPowered(boolean gasPowered){
        this.gasPowered = gasPowered;
    }

    // Overridden toString method
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", numDoors=" + numDoors +
                ", gasPowered=" + gasPowered +
                '}';
    }

    public boolean isEcoFriendly(){
        return (numDoors == 2 && !gasPowered);
    }

}
