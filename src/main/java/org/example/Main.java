package org.example;

import org.example.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        System.out.print("Room number: ");
        int roomNumber = sc.nextInt();
        sc.nextLine();
        try {

            System.out.print("Enter the date of Checkin (dd/MM/yyyy) : ");
            Date checkin = sdf.parse(sc.next());

            System.out.print("Enter the date of Check-out (dd/MM/yyyy) : ");
            Date checkout = sdf.parse(sc.next());
            System.out.println();

            Reservation reservation1 = new Reservation(checkout, checkin, roomNumber);
            System.out.println(reservation1.toString());
            System.out.println();

            System.out.println("Enter data to update the reservation: ");
            System.out.print("Enter the new date of Checkin (dd/MM/yyyy) : ");
            checkin = sdf.parse(sc.next());

            System.out.print("Enter the new date of Check-out (dd/MM/yyyy) : ");
            checkout = sdf.parse(sc.next());

            reservation1.updateDates(checkin, checkout);
            System.out.println(reservation1);
        }
        catch (ParseException e){
            System.out.println("Error: invalid date format");
        }
        catch (IllegalArgumentException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }
    }
}

