package Week06;

import java.util.Scanner;

/**
 *
 * @author nGQD
 */
public class OptimizedCalendar {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Input Format = year<space>firstDayOfYear (0=Sun, 1=Mon, etc): ");
        short year = scanner.nextShort(), day = scanner.nextShort();
        printCalendar("  May  ", year,( day + 120 + ((year%4==0 || year%400==0 && year%100!=0) ? 1 : 0) )% 7);
        printCalendar(" August ", year,( day + 212 + ((year%4==0 || year%400==0 && year%100!=0) ? 1 : 0)) % 7);
    }
    public static void printCalendar(String month, int year, int day){
        System.out.println("\n      " + month + year + "\nS   M   T   W   T   F   S\n");
        for(int i=0; i<31; i++){
            System.out.print((i==0) ? "    ".repeat(day&7) : (((day+i)%7)==0) ? "\n" : "");
            System.out.printf("%-4s", (i!=30) ? (i+1) : (i+1) + "\n");
        }
    }
    //31+31+30
}
