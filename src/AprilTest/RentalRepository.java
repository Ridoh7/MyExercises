package AprilTest;

import AprilAssessment.Apartments;

import java.util.Arrays;
import java.util.Scanner;

public class RentalRepository {
    private Property[] properties;
    private int size;

    public RentalRepository(int capacity) {
        properties = new Property[capacity];
        this.size = 0;
    }

    //implementing create
    public void addProperty(Property property){
        if (size== properties.length){
            Property[] newProperties= new Property[size*2];
            System.arraycopy(properties,0,newProperties,0,size);
            properties=newProperties;
        }
        properties[size++]=property;
    }
    //implementing read to get details of specific property at a certain index
    public Property getProperty(int index){
        if (index<0 || index>=size){
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return properties[index];
    }

   //implementing read to get detail of all properties
    public Property[] getProperties() {
        return Arrays.copyOf(properties,size);
    }
    //implementing update
    public void updateProperty(int index, Property newProperty){
        if (index<0||index>size){
            throw new IndexOutOfBoundsException("Invalid index");
        }
        properties[index]=newProperty;
    }
    //implementing delete
    public void deleteProperty(int index){
        if (index<0||index>size){
            throw new IndexOutOfBoundsException("Invalid index");
        }
        System.arraycopy(properties,index+1,properties,index,size-index-1);
        properties[--size]=null;

    }
    public Property[] getOccupiedProperties() {
        int occupiedIndex = 0;
        for (int i = 0; i < size; i++) {
            if (properties[i].isOccupied()) {
                occupiedIndex++;
            }
        }
        Property[] occupiedProperties = new Property[occupiedIndex];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (properties[i].isOccupied()) {
                occupiedProperties[j] = properties[i];
                j++;
            }
        }
        return occupiedProperties;
    }

    public Property[] getUnoccupiedProperties() {
        int unOccupiedIndex = 0;
        for (int i = 0; i < size; i++) {
            if (!properties[i].isOccupied()) {
                unOccupiedIndex++;
            }
        }
        Property[] unOccupiedProperties = new Property[unOccupiedIndex];
        int z = 0;
        for (int i = 0; i < size; i++) {
            if (!properties[i].isOccupied()) {
                unOccupiedProperties[z] = properties[i];
                z++;
            }
        }
        return unOccupiedProperties;
    }
    public Property[] viewAllProperties() {
        Property[] allProperties = new Property[size];
        for (int i = 0; i < size; i++) {
            allProperties[i] = properties[i];
        }
        return allProperties;
    }


    public Apartment[] viewAllApartments() {
        int apaCount=0;
        for (int i=0; i<size; i++)
            if (properties[i] instanceof Apartment) {
                apaCount++;
            }
        Apartment[] apartments = new Apartment[apaCount];
        int z = 0;
        for (int i = 0; i < size; i++) {
            if (properties[i] instanceof Apartment) {
                apartments[z] = (Apartment) properties[i];
                z++;
            }
        }
            return apartments;
        }

        public House[] viewAllHouses(){
            int houCount= 0;
            for (int i = 0; i < size; i++) {
                if (properties[i] instanceof House) {
                    houCount++;
                }
            }
            House[] houses = new House[houCount];
             int z = 0;
            for (int i = 0; i < size; i++) {
                if (properties[i] instanceof House) {
                    houses[z] = (House) properties[i];
                    z++;
                }
            }
            return houses;
        }

        public Condo[] viewAllCondos() {
            int conCount= 0;
            for (int i = 0; i < size; i++) {
                if (properties[i] instanceof Condo) {
                    conCount++;
                }
            }
            Condo[] condos = new Condo[conCount];
            int z = 0;
            for (int i = 0; i < size; i++) {
                if (properties[i] instanceof Condo) {
                    condos[z] = (Condo) properties[i];
                    z++;
                }
            }
            return condos;
        }


        public Property[] searchByLocation(String location) {
            Property[] matchingProperties = new Property[size];
            int index = 0;
            for (int i = 0; i < size; i++) {
                if (properties[i].getLocation().equalsIgnoreCase(location)) {
                    matchingProperties[index] = properties[i];
                    index++;
                }
            }
            return Arrays.copyOf(matchingProperties, index);
        }

        public Property searchByPropertyCode(String propertyCode) {
            for (Property property: properties) {
                if (property.getPropertyCode().equals(propertyCode)){
                    return property;
                }
            }
            return null;
        }

        public int getTotalNumberOfProperties() {
            Property[] properties = new Property[size];
            int count = 0;
            for (Property property: properties) {
                count++;

            }
            return count;
        }

        public int getTotalNoOfApartments() {
            int count = 0;
            for (Property property: properties) {
                if (property instanceof Apartment) {
                    count++;
                }
            }
            return count;
        }

        public int getTotalNoOfBedroomsInApartments() {
            int count = 0;
            for (Property property: properties) {
                if (property instanceof Apartment) {
                    count += ((Apartment) property).getNoOfBedrooms();
                }
            }
            return count;
        }

        public int getTotalNumberOfBathroomsInApartments() {
            int count = 0;
            for (Property property: properties) {
                if (property instanceof Apartment) {
                    count += ((Apartment) property).getNoOfBathrooms();
                }
            }
            return count;
        }

        public double getTotalRentIncomePerMonthFromApartments() {
            double totalIncome = 0.0;
            for (Property property : properties) {
                if (property instanceof Apartment && property.isOccupied()) {
                    totalIncome += ((Apartment) property).totalRentIncome();
                }
            }
            return totalIncome;
        }

        public int getTotalNoOfOccupiedApartments() {
            int count = 0;
            for (Property property: properties) {
                if (property instanceof Apartment && property.isOccupied()) {
                    count++;
                }
            }
            return count;
        }

        public int getTotalNumberOfUnoccupiedApartments() {
            int count = 0;
            for (Property property: properties) {
                if (property instanceof Apartment && !property.isOccupied()) {
                    count++;
                }
            }
            return count;
        }

        public int getTotalNoOfAllCondos() {
            int count = 0;
            for (Property property: properties) {
                if (property instanceof Condo) {
                    count++;
                }
            }
            return count;
        }

        public int getTotalNoOfBedroomInCondos() {
            int count = 0;
            for (Property property: properties) {
                if (property instanceof Condo) {
                    count += ((Condo) property).getNoOfBedrooms();
                }
            }
            return count;
        }

        public int getTotalNoOfBathroomInCondos() {
            int count = 0;
            for (Property property: properties) {
                if (property instanceof Condo) {
                    count += ((Condo) property).getNoOfBathrooms();
                }
            }
            return count;
        }

        public double getTotalRentalIncomePerMonthForCondos() {
            double totalIncome = 0.0;
            for (Property property: properties) {
                if (property instanceof  Condo && property.isOccupied()) {
                    totalIncome += ((Condo) property).totalRentIncome();
                }
            }
            return totalIncome;
        }

        public int getTotalNumberOfOccupiedCondos() {
            int count = 0;
            for (Property property: properties) {
                if (property instanceof Condo && property.isOccupied()) {
                    count++;
                }
            }
            return count;
        }

        public int getTotalNumberOfUnoccupiedCondos() {
            int count = 0;
            for (Property property: properties) {
                if (property instanceof Condo && !property.isOccupied()) {
                    count++;
                }
            }
            return count;
        }

        public int getTotalNumberOfAllHouses() {
            int count = 0;
            for (Property property: properties) {
                if (property instanceof House) {
                    count++;
                }
            }
            return count;
        }

        public int getTotalNumberOfBedroomInHouses() {
            int count = 0;
            for (Property property: properties) {
                if (property instanceof House) {
                    count += ((House) property).getNoOfBedrooms();
                }
            }
            return count;
        }

        public int getTotalNoOfBathroomInHouses() {
            int count = 0;
            for (Property property: properties) {
                if (property instanceof House) {
                    count += ((House) property).getNoOfBathrooms();
                }
            }
            return count;
        }

        public double getTotalRentIncomePerMonthForHouses() {
            double totalIncome = 0.0;
            for (Property property: properties) {
                if (property instanceof  House && property.isOccupied()) {
                    totalIncome += ((House) property).totalRentIncome();
                }
            }
            return totalIncome;
        }

        public int getTotalNumberOfOccupiedHouses() {
            int count = 0;
            for (Property property: properties) {
                if (property instanceof House && property.isOccupied()) {
                    count++;
                }
            }
            return count;
        }

        public int getTotalNumberOfUnoccupiedHouses() {
            int count = 0;
            for (Property property: properties) {
                if (property instanceof House && !property.isOccupied()) {
                    count++;
                }
            }
            return count;
        }



    }

