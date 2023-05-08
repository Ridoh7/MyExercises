package AprilTest;

public class Condo extends Property {
    private String amenities;
    private int noOfFloors;

    public Condo(String amenities, int noOfFloors,String propertyCode, String location, int noOfBedrooms, int noOfBathrooms,
                 double rentPerMonth, boolean isOccupied) {
        super(propertyCode,location,noOfBedrooms,noOfBathrooms,rentPerMonth,isOccupied);
        this.amenities = amenities;
        this.noOfFloors = noOfFloors;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    @Override
    public double totalRentIncome() {
        if (isOccupied()) {
            return getRentPerMonth() * getNoOfBedrooms() * getNoOfFloors();
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
                "amenities='" + getAmenities() + ','+'\n' +
                "noOfFloors=" + getNoOfFloors() +','+'\n'+
                "totalRentIncome="+ totalRentIncome()+
                '}';
    }
}
