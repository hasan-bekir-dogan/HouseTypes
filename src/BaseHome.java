import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class BaseHome {

    private String name;
    private double price;
    private double squareMeter;
    private int roomNumber;
    private int loungeNumber;

    public BaseHome(String name, double price, double squareMeter, int roomNumber, int loungeNumber) {
        this.name = name;
        this.price = price;
        this.squareMeter = squareMeter;
        this.roomNumber = roomNumber;
        this.loungeNumber = loungeNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSquareMeter() {
        return this.squareMeter;
    }

    public void setSquareMeter(double squareMeter) {
        this.squareMeter = squareMeter;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getLoungeNumber() {
        return this.loungeNumber;
    }

    public void setLoungeNumber(int loungeNumber) {
        this.loungeNumber = loungeNumber;
    }

    // Calculate total price of houses
    public static double getTotalPrice(BaseHome[] houses) {
        List<BaseHome> houseList = Arrays.asList(houses);

        double totalPrice = houseList
                .stream()
                .mapToDouble(a->a.getPrice())
                .sum();

        BigDecimal bd = new BigDecimal(totalPrice).setScale(2,RoundingMode.HALF_DOWN);

        return bd.doubleValue();
    }

    // Calculate average square meter of houses
    public static double getAvgSquareMeter(BaseHome[] houses) {
        List<BaseHome> houseList = Arrays.asList(houses);

        double avgSquareMeter = houseList
                .stream()
                .mapToDouble(a->a.getSquareMeter())
                .average()
                .orElse(0.0);

        BigDecimal bd = new BigDecimal(avgSquareMeter).setScale(2,RoundingMode.HALF_DOWN);

        return bd.doubleValue();
    }

    // Overloaded filterAllHouseTypes(). Filter all house types as parameters that consist of room number and lounge number
    public static List<BaseHome> filterAllHouseTypes(BaseHome[] houses, int roomNumber, int loungeNumber) {
        List<BaseHome> houseList = Arrays.asList(houses);

        List<BaseHome> filteredHouseList = houseList
                .stream()
                .filter(h -> h.getRoomNumber() == roomNumber && h.getLoungeNumber() == loungeNumber)
                .collect(Collectors.toList());

        return filteredHouseList;
    }

    // Overloaded filterAllHouseTypes(). Filter all house types as parameter that is room number
    public static List<BaseHome> filterAllHouseTypes(BaseHome[] houses, int roomNumber) {
        List<BaseHome> houseList = Arrays.asList(houses);

        List<BaseHome> filteredHouseList = houseList
                .stream()
                .filter(h -> h.getRoomNumber() == roomNumber)
                .collect(Collectors.toList());

        return filteredHouseList;
    }

    // Overloaded filterAllHouseTypes(). Filter all house types as parameter that is lounge number
    public static List<BaseHome> filterAllHouseTypes(int loungeNumber, BaseHome[] houses) {
        List<BaseHome> houseList = Arrays.asList(houses);

        List<BaseHome> filteredHouseList = houseList
                .stream()
                .filter(h -> h.getLoungeNumber() == loungeNumber)
                .collect(Collectors.toList());

        return filteredHouseList;
    }

}
