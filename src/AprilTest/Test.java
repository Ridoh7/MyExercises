package AprilTest;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Property house1 = new House(6000, 6, "HOU001", "Kwara", 4, 6,
                4000, true);
        Property apartment2 = new Apartment(3, "APA002", "JOS", 5, 8,
                8000, true);
        Property condo3 = new Condo("swimming pool, football pitch, gym", 3, "CON003",
                "Lagos", 12, 15, 20000, true);
        Property house4 = new House(4000, 4, "HOU004", "Abuja", 12,
                38, 15000, true);
        Property apartment5 = new Apartment(7, "APA005", "Victoria Island,Lagos", 3,
                5, 18000, false);
        Property condo6 = new Condo("Clinic,Car Park,Flower Garden", 5, "CON006",
                "Lekki Lagos", 9, 11, 7000, false);
        Property apartment7 = new Apartment(5, "APA007", "Abuja", 2, 3,
                6000, true);
        Property house8 = new House(5000, 4, "HOU008", "Kwara", 12,
                25, 6500, true);
        Property condo9 = new Condo("Recreation centre,Gym", 3, "CON009", "Jos",
                8, 10, 9000, true);
        Property apartment10 = new Apartment(2, "APA010", "Kwara", 5, 7,
                7000, true);


        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("a. View all apartments");
            System.out.println("b. View all houses");
            System.out.println("c. View all condos");
            System.out.println("d. View all properties");
            System.out.println("e. View all occupied properties");
            System.out.println("f. View all unoccupied properties");
            System.out.println("g. View through search by location");
            System.out.println("h. Get total number of houses");
            System.out.println("i. Get total number of apartments");
            System.out.println("j. Get total number of condos");
            System.out.println("k. Get total number of bedrooms in apartment");
            System.out.println("l. Get total number of bedrooms in houses");
            System.out.println("m. Get total number of bedrooms in condos");
            System.out.println("n. Get total number of bathrooms in apartments");
            System.out.println("o. Get total number of bathrooms in houses");
            System.out.println("p. Get total number of bathrooms in condos");
            System.out.println("q. Get total rent income per months from houses");
            System.out.println("r. Get total rent income per months from apartments");
            System.out.println("s. Get total rent income per months from condo");
            System.out.println("t. Get total number of occupied apartments");
            System.out.println("u. Get total number of occupied houses");
            System.out.println("v. Get total number of occupied condos");
            System.out.println("w. Get total number of unoccupied apartments");
            System.out.println("x. Get total number of unoccupied houses");
            System.out.println("y. Get total number of unoccupied condos");
            System.out.println("z. Exit");

            String choice = scanner.nextLine();
            RentalRepository repository = new RentalRepository(10);

            repository.addProperty(apartment2);
            repository.addProperty(apartment7);
            repository.addProperty(apartment5);
            repository.addProperty(apartment10);
            repository.addProperty(house1);
            repository.addProperty(house8);
            repository.addProperty(house4);
            repository.addProperty(condo3);
            repository.addProperty(condo6);
            repository.addProperty(condo9);

            repository.updateProperty(1,apartment2);

            if (choice.equals("a")) {
                System.out.println("\nAll apartments:");
                System.out.println(Arrays.toString(repository.viewAllApartments()));
            } else if (choice.equals("b")) {
                System.out.println("\nAll houses:");
                System.out.println(Arrays.toString(repository.viewAllHouses()));
            } else if (choice.equals("c")) {
                System.out.println("\nAll condos");
                System.out.println(Arrays.toString(repository.viewAllCondos()));
            } else if (choice.equals("d")) {
                System.out.println("\nAll properties");
                System.out.println(Arrays.toString(repository.viewAllProperties()));
            } else if (choice.equals("e")) {
                System.out.println("\nAll Occupied Properties");
                System.out.println(Arrays.toString(repository.getOccupiedProperties()));
            } else if (choice.equals("f")) {
                System.out.println("\nAll Unoccupied Properties");
                System.out.println(Arrays.toString(repository.getUnoccupiedProperties()));
            } else if (choice.equals("g")) {
                System.out.println("\nSearch by location");
                System.out.println(Arrays.toString(repository.searchByLocation("Abuja")));
            } else if (choice.equals("h")) {
                System.out.println("\nGet total number of houses");
                System.out.println((repository.getTotalNumberOfAllHouses()));
            }
            else if (choice.equals("i")) {
                System.out.println("\nGet total number of apartments");
                System.out.println((repository.getTotalNoOfApartments()));
            }
            else if (choice.equals("j")) {
                System.out.println("\nGet total number of condos");
                System.out.println((repository.getTotalNoOfAllCondos()));
            }
            else if (choice.equals("k")) {
                System.out.println("\nGet total number of bedrooms in houses");
                System.out.println((repository.getTotalNumberOfBedroomInHouses()));
            }
            else if (choice.equals("l")) {
                System.out.println("\nGet total number of bedrooms in Apartments");
                System.out.println((repository.getTotalNoOfBedroomsInApartments()));
            }
            else if (choice.equals("m")) {
                System.out.println("\nGet total number of  bedrooms in condos");
                System.out.println((repository.getTotalNoOfBedroomInCondos()));
            }
            else if (choice.equals("n")) {
                System.out.println("\nGet total number of bathrooms in apartments");
                System.out.println((repository.getTotalNumberOfBathroomsInApartments()));
            }
            else if (choice.equals("o")) {
                System.out.println("\nGet total number of bathrooms houses");
                System.out.println((repository.getTotalNoOfBathroomInHouses()));
            }
            else if (choice.equals("p")) {
                System.out.println("\nGet total number of bathrooms in condos ");
                System.out.println((repository.getTotalNoOfBathroomInCondos()));
            }
            else if (choice.equals("q")) {
                System.out.println("\nGet total rent income per months from houses ");
                System.out.println((repository.getTotalRentIncomePerMonthForHouses()));
            }
            else if (choice.equals("r")) {
                System.out.println("\nGet total rent income per months from Apartments");
                System.out.println((repository.getTotalRentIncomePerMonthFromApartments()));
            }
            else if (choice.equals("s")) {
                System.out.println("\nGet total rent income per months from condos ");
                System.out.println((repository.getTotalRentalIncomePerMonthForCondos()));
            }
            else if (choice.equals("t")) {
                System.out.println("\nGet total number of occupied apartments ");
                System.out.println((repository.getTotalNoOfOccupiedApartments()));
            }
            else if (choice.equals("u")) {
                System.out.println("\nGet total number of occupied houses ");
                System.out.println((repository.getTotalNumberOfOccupiedHouses()));
            }
            else if (choice.equals("v")) {
                System.out.println("\nGet total number of occupied condos");
                System.out.println((repository.getTotalNumberOfOccupiedCondos()));
            }
            else if (choice.equals("w")) {
                System.out.println("\nGet total number of unoccupied apartments");
                System.out.println((repository.getTotalNumberOfUnoccupiedApartments()));
            }
            else if (choice.equals("x")) {
                System.out.println("\nGet total number of unoccupied houses");
                System.out.println((repository.getTotalNumberOfUnoccupiedHouses()));
            }
            else if (choice.equals("y")) {
                System.out.println("\nGet total number of unoccupied condos");
                System.out.println((repository.getTotalNumberOfOccupiedCondos()));

            }
        }
    }
}