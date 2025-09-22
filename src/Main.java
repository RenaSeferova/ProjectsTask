
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sira sayini girin:");
        int rows = scanner.nextInt();

        System.out.println("Nece oturacaq var:");
        int seats = scanner.nextInt();

        Sinema sinema = new Sinema(rows, seats);

        int choice;
        do {
            System.out.println("\n1. Oturacaqları göstər");
            System.out.println("2. Bilet al");
            System.out.println("3. Statistik məlumat");
            System.out.println("4. Çıxış");
            System.out.print("Seçiminizi edin: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    sinema.showCinema();
                    break;
                case 2:
                    sinema.buyTicket(scanner);
                    break;
                case 3:
                    sinema.statistics();
                    break;
                case 4:
                    System.out.println("Proqram bitdi.");
                    break;
                default:
                    System.out.println("Yanlış seçim! Yenidən cəhd edin.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

