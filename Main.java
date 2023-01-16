import java.io.*;
import java.util.*;

public class Main {
    private static ArrayList<String> fileList = new ArrayList<>();

    public static void main(String[] args) {
        // Welcome screen
        System.out.println("Welcome to Lockedme.com!");
        System.out.println("Developed by Jeevan Abraham");

        File folder = new File("C:\\Users\\Jeevan\\eclipse-workspace");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                fileList.add(listOfFiles[i].getName());
            }
        }

        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. View files in ascending order");
            System.out.println("2. Add/Delete/Search a file");
            System.out.println("3. Return to main context");
            System.out.println("4. Close the application");

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    Collections.sort(fileList);
                    for (String file : fileList) {
                        System.out.println(file);
                    }
                    break;
                case 2:
                    System.out.println("Please select an option:");
                    System.out.println("1. Add a file");
                    System.out.println("2. Delete a file");
                    System.out.println("3. Search for a file");
                    int subChoice = input.nextInt();
                    input.nextLine();
                    switch (subChoice) {
                        case 1:
                            System.out.println("Enter the file name to add:");
                            String fileToAdd = input.nextLine();
                            fileList.add(fileToAdd);
                            System.out.println("File added successfully!");
                            break;
                        case 2:
                            System.out.println("Enter the file name to delete:");
                            String fileToDelete = input.nextLine();
                            if (fileList.contains(fileToDelete)) {
                                fileList.remove(fileToDelete);
                                System.out.println("File deleted successfully!");
                            } else {
                                System.out.println("File not found!");
                            }
                            break;
                        case 3:
                            System.out.println("Enter the file name to search:");
                            String fileToSearch = input.nextLine();
                            if (fileList.contains(fileToSearch)) {
                                System.out.println("File found!");
                            } else {
                                System.out.println("File not found!");
                            }
                            break;
                        default:
                            System.out.println("Invalid choice! Please try again.");
                    }
                    break;
                case 3:
                    // code to return to main context
                    break;
                case 4:
                    System.out.println("Closing the application...");
                    System.exit(0);
            }
        }
    }
}
