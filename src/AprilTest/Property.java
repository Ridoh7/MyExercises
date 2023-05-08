package AprilTest;

public abstract class Property {
    private String PropertyCode;
    private String Location;
    private int NoOfBedrooms;
    private int NoOfBathrooms;
    private  double RentPerMonth;
    private boolean isOccupied;

    public Property(String propertyCode, String location, int noOfBedrooms, int noOfBathrooms,
                    double rentPerMonth, boolean isOccupied) {
        PropertyCode= propertyCode;
        Location = location;
        NoOfBedrooms = noOfBedrooms;
        NoOfBathrooms = noOfBathrooms;
        RentPerMonth = rentPerMonth;
        this.isOccupied = isOccupied;
    }

    public String getPropertyCode() {
        return PropertyCode;
    }


    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getNoOfBedrooms() {
        return NoOfBedrooms;
    }

    public void setNoOfBedrooms(int noOfBedrooms) {
        NoOfBedrooms = noOfBedrooms;
    }

    public int getNoOfBathrooms() {
        return NoOfBathrooms;
    }

    public void setNoOfBathrooms(int noOfBathrooms) {
        NoOfBathrooms = noOfBathrooms;
    }

    public double getRentPerMonth() {
        return RentPerMonth;
    }

    public void setRentPerMonth(double rentPerMonth) {
        RentPerMonth = rentPerMonth;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public abstract double totalRentIncome();
    public abstract String propertyCode();

    @Override
    public String toString() {
        return "\nProperty{" +
                "PropertyCode='" + PropertyCode + ','+'\n' +
                " Location='" + Location + ','+'\n' +
                " NoOfBedrooms=" + NoOfBedrooms +','+'\n'+
                " NoOfBathrooms=" + NoOfBathrooms +','+'\n'+
                " RentPerMonth=" + RentPerMonth +','+'\n'+
                " isOccupied=" + isOccupied +','+'\n'+
                '}';
    }
}
