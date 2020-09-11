package main;
import list.*;
import person.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List l= new List();
        System.out.println("Welcome to VIVEK's Contact List App");
        System.out.println("Press 1 to add a new contact\n" +
                "Press 2 to view all contacts\n" +
                "Press 3 to search for a contact\n" +
                "Press 4 to delete a contact\n" +
                "Press 5 to exit program ");

        while(true){
            int i =sc.nextInt();
            switch (i){
                case 1:
                    l.add();
                    System.out.println("Press 1 to add a new contact\n" +
                            "Press 2 to view all contacts\n" +
                            "Press 3 to search for a contact\n" +
                            "Press 4 to delete a contact\n" +
                            "Press 5 to exit program ");
                    break;
                case 2:
                    l.view();
                    System.out.println("Press 1 to add a new contact\n" +
                            "Press 2 to view all contacts\n" +
                            "Press 3 to search for a contact\n" +
                            "Press 4 to delete a contact\n" +
                            "Press 5 to exit program ");
                    break;
                case 3:
                    l.search();
                    System.out.println("Press 1 to add a new contact\n" +
                            "Press 2 to view all contacts\n" +
                            "Press 3 to search for a contact\n" +
                            "Press 4 to delete a contact\n" +
                            "Press 5 to exit program ");
                    break;
                case 4:
                    System.out.println("delete program");
                    l.delete();
                    System.out.println("Press 1 to add a new contact\n" +
                            "Press 2 to view all contacts\n" +
                            "Press 3 to search for a contact\n" +
                            "Press 4 to delete a contact\n" +
                            "Press 5 to exit program ");
                    break;
                default:
                    System.out.println("Please Enter a Valid Key");

            }
            if(i==5){
                break;
            }
        }


    }
}
