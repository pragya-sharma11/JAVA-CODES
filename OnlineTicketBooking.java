/*   Created by IntelliJ IDEA.
 *   Author: Pragya Sharma
 *   Date: 01/08/20
 *   Time: 4:30 AM
 *   File: OnlineTicketBooking.java
 */
import java.util.Scanner;

// Software to book tickets for online conference.
public class OnlineTicketBooking {
    private static final byte TOTAL_PARTICIPANTS = 100;

    private static void sellTicket(String participantName) {
        String message = "Congratulations, " + participantName + ". " +
                "See you at the conference!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        byte numberOfTickectsSold = 0;
        while (numberOfTickectsSold <= TOTAL_PARTICIPANTS) {
            byte ticketsLeft = (byte) (TOTAL_PARTICIPANTS - numberOfTickectsSold);
            System.out.println("Total Tickets Left: " + ticketsLeft);
            System.out.println("Enter your name for ticket in Online Conference");
            Scanner scanner = new Scanner(System.in);
            String nameOfParticipant = scanner.nextLine();
            sellTicket(nameOfParticipant);
            numberOfTickectsSold++;
            if (numberOfTickectsSold == TOTAL_PARTICIPANTS) {
                scanner.close();
                System.out.println("Sorry, The tickets are sold-out!");
                break;
            }
        }
    }
}
