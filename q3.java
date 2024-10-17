import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CitySTDCode {

    public static void main(String[] args) {
        // Create a HashMap to store city names and their STD codes
        HashMap<String, String> citySTDMap = new HashMap<>();

        // Adding city names and their corresponding STD codes
        citySTDMap.put("New York", "212");
        citySTDMap.put("Los Angeles", "213");
        citySTDMap.put("Chicago", "312");
        citySTDMap.put("Houston", "713");
        citySTDMap.put("Phoenix", "602");
        citySTDMap.put("Philadelphia", "215");
        citySTDMap.put("San Antonio", "210");

        // Display the details of the hash table
        System.out.println("City Name and STD Code:");
        for (Map.Entry<String, String> entry : citySTDMap.entrySet()) {
            System.out.println("City: " + entry.getKey() + ", STD Code: " + entry.getValue());
        }

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the name of the city to search for its STD code: ");
        String city = scanner.nextLine();

        // Search for the specific city
        if (citySTDMap.containsKey(city)) {
            System.out.println("The STD code for " + city + " is: " + citySTDMap.get(city));
        } else {
            System.out.println("City not found in the database.");
        }

        // Close the scanner
        scanner.close();
    }
}
