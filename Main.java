import java.util.Scanner;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Date anotherDate = new Date();
        String anotherDateString = anotherDate.toString();
        anotherDate.setTime(123478);
        boolean isBefore = currentDate.before(anotherDate);
        System.out.println(isBefore);

        Scanner myScanner = new Scanner(System.in);
        String resString = myScanner.nextLine();
        System.out.println(resString);
        resString = myScanner.next();
        System.out.println(resString);
    }
}