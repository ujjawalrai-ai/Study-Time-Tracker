package main;

import model.*;
import service.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TrackerService tracker = new TrackerService();

        while (true) {
            System.out.println("\n--- Study Tracker ---");
            System.out.println("1. Add Study Session");
            System.out.println("2. View All Sessions");
            System.out.println("3. Total Study Time");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                sc.nextLine(); // clear buffer

                System.out.print("Enter subject: ");
                String name = sc.nextLine();

                System.out.print("Enter duration (minutes): ");
                int time = sc.nextInt();

                Subject subject = new Subject(name);
                StudySession session = new StudySession(subject, time);

                tracker.addSession(session);
            }

            else if (choice == 2) {
                tracker.showAllSessions();
            }

            else if (choice == 3) {
                System.out.println("Total Study Time: " + tracker.getTotalStudyTime() + " minutes");
            }

            else if (choice == 4) {
    tracker.showSubjectWiseTime();
}

            else {
                System.out.println("Exit!");
            }
        }

        sc.close();
    }
}
