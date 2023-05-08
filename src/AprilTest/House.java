package AprilTest;

public class House extends Property {
    private double yardSize;
    private int noOfFloors;

    public House(double yardSize, int noOfFloors,String propertyCode, String location, int noOfBedrooms, int noOfBathrooms,
                 double rentPerMonth, boolean isOccupied) {
        super(propertyCode, location, noOfBedrooms, noOfBathrooms, rentPerMonth, isOccupied);
        this.yardSize = yardSize;
        this.noOfFloors = noOfFloors;
    }

    public double getYardSize() {
        return yardSize;
    }

    public void setYardSize(double yardSize) {
        this.yardSize = yardSize;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    @Override
    public double totalRentIncome(){
        if (isOccupied()){
        return getRentPerMonth()*getNoOfBedrooms()*getNoOfFloors();
    }
        return 0;
    }

    @Override
    public String propertyCode() {
        return getPropertyCode();
    }

    @Override
    public String toString() {
        return super.toString() +','+'\n'+
                "yardSize=" + getYardSize() +','+'\n'+
                ", noOfFloors=" + getNoOfFloors() +','+'\n'+
                ", totalRentIncome="+totalRentIncome()+
                '}';
    }
}
