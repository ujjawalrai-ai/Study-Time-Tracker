package main;

import model.*;
import service.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TrackerService tracker = new TrackerService();

        while (true) {
            System.out.println("\n1. Add Session");
            System.out.println("2. Show Sessions");
            System.out.println("3. Total Time");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                sc.nextLine();

                System.out.print("Enter subject: ");
                String name = sc.nextLine();

                System.out.print("Enter time: ");
                int time = sc.nextInt();

                Subject sub = new Subject(name);
                StudySession session = new StudySession(sub, time);

                tracker.addSession(session);
            }

            else if (choice == 2) {
                tracker.showAllSessions();
            }

            else if (choice == 3) {
                System.out.println("Total: " + tracker.getTotalStudyTime());
            }

            else {
                break;
            }
        }
    }
}