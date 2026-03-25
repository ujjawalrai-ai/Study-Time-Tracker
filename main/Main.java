package main;

import model.*;
import service.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TrackerService tracker = new TrackerService();

        while (true) {
            System.out.println("1. Add Session");
            System.out.println("2. Show Sessions");
            System.out.println("3. Total Time");
            System.out.println("4. Subject-wise Time");
            System.out.println("5. Set Daily Goal");
            System.out.println("6. Check Goal");
            System.out.println("7. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                sc.nextLine();

                System.out.print("Enter subject: ");
                String name = sc.nextLine();

                System.out.print("Enter time: ");
                int time = sc.nextInt();

                Subject sub = new Subject(name);
                System.out.print("Enter date (YYYY-MM-DD): ");
                sc.nextLine(); // clear buffer
                String date = sc.nextLine();

                StudySession session = new StudySession(sub, time, date);

                tracker.addSession(session);
            }

            else if (choice == 2) {
                tracker.showAllSessions();
            }

            else if (choice == 3) {
                System.out.println("Total: " + tracker.getTotalStudyTime());
            }

            else if (choice == 4) {
    tracker.showSubjectWiseTime();
}

        else if (choice == 5) {
            System.out.print("Enter daily goal (minutes): ");
            int goal = sc.nextInt();
            tracker.setDailyGoal(goal);
        }

        else if (choice == 6) {
            tracker.checkGoal();
        }

        else if (choice == 7) {
    break;
}
        }
    }
}