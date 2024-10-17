import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create a file
        System.out.print("Enter the name of the file to create: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        // Step 2: Rename the file
        System.out.print("Enter the new name to rename the file: ");
        String newFileName = scanner.nextLine();
        File newFile = new File(newFileName);
        
        if (file.renameTo(newFile)) {
            System.out.println("File renamed to: " + newFile.getName());
        } else {
            System.out.println("Failed to rename the file.");
        }

        // Step 3: Delete the file
        System.out.print("Do you want to delete the file? (yes/no): ");
        String deleteConfirmation = scanner.nextLine();
        if (deleteConfirmation.equalsIgnoreCase("yes")) {
            if (newFile.delete()) {
                System.out.println("File deleted: " + newFile.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        }

        // Step 4: Display the path of the file
        System.out.print("Enter the name of the file to display its path: ");
        String pathFileName = scanner.nextLine();
        File pathFile = new File(pathFileName);
        
        if (pathFile.exists()) {
            System.out.println("Absolute path of the file: " + pathFile.getAbsolutePath());
        } else {
            System.out.println("File does not exist.");
        }

        // Close the scanner
        scanner.close();
    }
}
