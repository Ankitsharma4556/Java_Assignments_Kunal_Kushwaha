package randomGenerator;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomCSVGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of iterations required: ");
        int iterations = scanner.nextInt();

        String[] headers = {
                "LOAD_AMOUNT",
                "FULL_NAME",
                "MOBILE",
                "CORPORATE_EMAIL",
                "DOB",
                "NAME_ON_CARD",
                "EMAIL"
        };

        String outputFileName = "Zaagle_Static_upload.csv";

        try (FileWriter writer = new FileWriter(outputFileName)) {
            writer.append(String.join(",", headers)).append("\n");

            for (int i = 0; i < iterations; i++) {
                String loadAmount = String.valueOf(generateRandomInt(100, 10000)); // Random amount between 100-1000
                String fullName = generateRandomFullName(); // Random full name
                String mobile = generateRandomMobile(); // Random 10-digit mobile number
                String corporateEmail = generateRandomEmail(fullName); // Random corporate email
                String dob = generateRandomDOB(); // Random date in DDMMYYYY format
                String nameOnCard = fullName;
                String email = corporateEmail;


                String row = String.join(",", loadAmount, fullName, mobile, corporateEmail, dob, nameOnCard, email);

                writer.append(row).append("\n");
            }

            System.out.println("CSV file generated successfully: " + outputFileName);

        } catch (IOException e) {
            System.out.println("Error while writing to the file: " + e.getMessage());
        }
    }


    private static String generateRandomFullName() {
        String[] firstNames = {"John", "Jane", "Michael", "Sarah", "David", "Emily", "Chris", "Anna"};
        String[] lastNames = {"Smith", "Johnson", "Brown", "Taylor", "Anderson", "Thomas", "Lee", "Walker"};

        Random random = new Random();
        String firstName = firstNames[random.nextInt(firstNames.length)];
        String lastName = lastNames[random.nextInt(lastNames.length)];

        return firstName + " " + lastName;
    }

    private static String generateRandomMobile() {
        Random random = new Random();
        StringBuilder mobile = new StringBuilder("9");
        for (int i = 1; i < 10; i++) {
            mobile.append(random.nextInt(10));
        }
        return mobile.toString();
    }

    private static String generateRandomEmail(String fullName) {
        String[] domains = {"example.com", "corporate.com", "email.com", "domain.com"};
        Random random = new Random();
        String domain = domains[random.nextInt(domains.length)];

        String email = fullName.toLowerCase().replace(" ", ".") + "@" + domain;
        return email;
    }


    private static String generateRandomDOB() {
        Random random = new Random();
        int day = generateRandomInt(1, 30); //
        int month = generateRandomInt(1, 12);
        int year = generateRandomInt(1970, 2005);

        return String.format("%02d%02d%d", day, month, year);
    }


    private static int generateRandomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}