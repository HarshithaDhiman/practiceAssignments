package practiceAssignments.switchAssignments_9;

import java.util.Scanner;

public class PrintWeekDayOrWeekEnd {
    public static void main(String[] args) {
        String day;
        System.out.print("Enter day of the week: ");
        Scanner sc = new Scanner(System.in);
        day = sc.next();
        switch (day.toLowerCase()){
            case "monday"-> System.out.println("Its a weekday");
            case "tuesday"-> System.out.println("Its a weekday");
            case "wednesday"->System.out.println("Its a weekday");
            case "thursday"->System.out.println("Its a weekday");
            case "friday"->System.out.println("Its a weekday");
            case "saturday"->System.out.println("Its a weekend");
            case "sunday"->System.out.println("Its a weekend");
        }
    }
}
