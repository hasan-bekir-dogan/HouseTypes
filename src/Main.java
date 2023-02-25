import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Create 3 object that called house
        House house1 = new House("House 1", 150000, 110, 3, 1);
        House house2 = new House("House 2", 250000, 165, 4, 2);
        House house3 = new House("House 3", 110000, 90, 2, 1);

        // Create a list that consist of house objects
        BaseHome[] houseList = {house1, house2, house3};

        // Calculate and print total price of houses
        double totalHousePrice = BaseHome.getTotalPrice(houseList);
        System.out.println("Total price of houses: " + totalHousePrice);

        // Calculate and print average square meter of houses
        double avgHousePrice = BaseHome.getAvgSquareMeter(houseList);
        System.out.println("Average square meter of houses: " + avgHousePrice + "\n");

        /*----------------------------------------------------------------------------------*/

        // Create 3 object that called villa
        Villa villa1 = new Villa("Villa 1", 850000, 220, 5, 2);
        Villa villa2 = new Villa("Villa 2", 2500000, 400, 8, 3);
        Villa villa3 = new Villa("Villa 3", 1200000, 350, 7, 2);

        // Create a list that consist of villa objects
        BaseHome[] villaList = {villa1, villa2, villa3};

        // Calculate and print total price of villas
        double totalVillaPrice = BaseHome.getTotalPrice(villaList);
        System.out.println("Total price of villas: " + totalVillaPrice);

        // Calculate and print average square meter of houses
        double avgVillaPrice = BaseHome.getAvgSquareMeter(villaList);
        System.out.println("Average square meter of villas: " + avgVillaPrice + "\n");

        /*----------------------------------------------------------------------------------*/

        // Create 3 object that called summer house
        SummerHouse summerHouse1 = new SummerHouse("Summer House 1", 450000, 70, 1, 1);
        SummerHouse summerHouse2 = new SummerHouse("Summer House 2", 650000, 95, 2, 1);
        SummerHouse summerHouse3 = new SummerHouse("Summer House 3", 2100000, 90, 4, 2);

        // Create a list that consist of summer house objects
        BaseHome[] summerHouseList = {summerHouse1, summerHouse2, summerHouse3};

        // Calculate and print total price of summer houses
        double totalSummerHousePrice = BaseHome.getTotalPrice(summerHouseList);
        System.out.println("Total price of summer houses: " + totalSummerHousePrice);

        // Calculate and print average square meter of houses
        double avgSummerHousePrice = BaseHome.getAvgSquareMeter(summerHouseList);
        System.out.println("Average square meter of summer houses: " + avgSummerHousePrice + "\n");

        /*----------------------------------------------------------------------------------*/

        // Create a list that consist of all type of houses objects
        BaseHome[] allTypeHouseList = {house1, house2, house3, villa1, villa2, villa3, summerHouse1, summerHouse2, summerHouse3};

        // Calculate and print total price of all type of houses
        double totalAllHouseTypePrice = BaseHome.getTotalPrice(allTypeHouseList);
        System.out.println("Total price of all type of houses: " + totalAllHouseTypePrice);

        // Calculate and print average square meter of all type of houses
        double avgAllHouseTypeSquareMeter = BaseHome.getAvgSquareMeter(allTypeHouseList);
        System.out.println("Average square meter of all type of houses: " + avgAllHouseTypeSquareMeter + "\n");

        // Filter and print in all type of houses
        List<BaseHome> filteredAllHouseTypes1 = BaseHome.filterAllHouseTypes(allTypeHouseList, 1);
        System.out.println("Name of houses that room number is 1: ");
        int i = 0;
        for(BaseHome house : filteredAllHouseTypes1) {
            System.out.print(house.getName());
            if(i++ != filteredAllHouseTypes1.size()-1){
                System.out.print(", ");
            }
        }
        System.out.println("\n");

        List<BaseHome> filteredAllHouseTypes2 = BaseHome.filterAllHouseTypes(2, allTypeHouseList);
        System.out.println("Name of houses that lounge number is 2: ");
        i = 0;
        for(BaseHome house : filteredAllHouseTypes2) {
            System.out.print(house.getName());
            if(i++ != filteredAllHouseTypes2.size()-1){
                System.out.print(", ");
            }
        }
        System.out.println("\n");

        List<BaseHome> filteredAllHouseTypes3 = BaseHome.filterAllHouseTypes(allTypeHouseList, 2, 1);
        System.out.println("Name of houses that room number is 2 and lounge number is 1: ");
        i = 0;
        for(BaseHome house : filteredAllHouseTypes3) {
            System.out.print(house.getName());
            if(i++ != filteredAllHouseTypes3.size()-1){
                System.out.print(", ");
            }
        }

    }
}
