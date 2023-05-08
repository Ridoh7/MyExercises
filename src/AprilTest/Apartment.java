package AprilTest;

import AprilAssessment.PropertyCode;

public class Apartment extends Property {
    private double floorNumber;

    public Apartment(double floorNumber,String PropertyCode, String location, int noOfBedrooms, int noOfBathrooms,
                     double rentPerMonth, boolean isOccupied) {
        super(PropertyCode,location,noOfBedrooms,noOfBathrooms,rentPerMonth,isOccupied);
        this.floorNumber = floorNumber;
    }

    public double getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(double floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public double totalRentIncome() {
        if (isOccupied()) {
            return getRentPerMonth() * getNoOfBedrooms();
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
                "floorNumber=" + getFloorNumber() +','+'\n'+
                "totalRentIncome=" +totalRentIncome()+
                '}';
    }
}
