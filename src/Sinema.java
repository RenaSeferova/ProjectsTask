
import java.util.Scanner;
public class Sinema {
    int setirler;
    int oturacaqlar;
    String[][] sinemazal;
    int purchasedTickets = 0;
    int currentIncome = 0;

    // Kanstruktor
    public Sinema(int setirler, int oturacaqlar) {
        this.setirler = setirler;
        this.oturacaqlar = oturacaqlar;
        this.sinemazal = new String[setirler][oturacaqlar];

        // Başlanğıcda bütün yerləri "S" (Satılmamış) kimi qeyd etmk
        for (int i = 0; i < setirler; i++) {
            for (int j = 0; j < oturacaqlar; j++) {
                sinemazal[i][j] = "S";
            }
        }
    }

    // Bilet qiymətini hesablayan metod
    public int calculateTicketPrice(int setir) {
        int cemoturcaqlar = setirler * oturacaqlar;
        if (cemoturcaqlar <= 60) {
            return 10;
        } else {
            int frontHalf = setirler / 2;
            return (setir <= frontHalf) ? 10 : 8;
        }
    }

    // Zalı göstərmək
    public void showCinema() {
        System.out.println("\nCinema:");
        for (int i = 0; i < setirler; i++) {
            for (int j = 0; j < oturacaqlar; j++) {
                System.out.print(sinemazal[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Bilet almaq
    public void buyTicket(Scanner scanner) {
        System.out.print("Sıra nömrəsini daxil edin: ");
        int setirler = scanner.nextInt();

        System.out.print("Oturacaq nömrəsini daxil edin: ");
        int oturacaqlar = scanner.nextInt();

        if (sinemazal[setirler- 1][oturacaqlar - 1].equals("B")) {
            System.out.println("Bu yer artıq alınıb!");
        } else {
            int ticketPrice = calculateTicketPrice(setirler);
            System.out.println("Ticket price: " + ticketPrice + " AZN");
            sinemazal[setirler - 1][oturacaqlar - 1] = "B";
            purchasedTickets++;
            currentIncome += ticketPrice;
        }
    }

    // Statistik məlumat
    public void statistics() {
        System.out.println("\nStatistika:");
        System.out.println("Satılmış biletlərin sayı: " + purchasedTickets);
        System.out.println("Cari gəlir: " + currentIncome + " AZN");
    }
}






