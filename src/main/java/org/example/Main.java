package org.example;

import org.example.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        System.out.print("Room number: ");
        int roomNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the date of Checkin (dd/MM/yyyy) : ");
        String checkin = sc.nextLine();
        Date chekinDate = sdf.parse(checkin);

        System.out.print("Enter the date of Check-out (dd/MM/yyyy) : ");
        String checkout = sc.nextLine();
        Date chekoutDate = sdf.parse(checkout);

        if (!chekoutDate.after(chekinDate)) {
            System.out.println("Error in reservation: Check-out date must be after chekin-in date");
        } else {
            System.out.println();
            Reservation reservation1 = new Reservation(chekoutDate, chekinDate, roomNumber);
            System.out.println(reservation1.toString());
            System.out.println();

            System.out.print("Enter data to update the reservation: ");

            System.out.print("Enter the date of Checkin (dd/MM/yyyy) : ");
            checkin = sc.nextLine();
            chekinDate = sdf.parse(checkin);

            System.out.print("Enter the date of Check-out (dd/MM/yyyy) : ");
            checkout = sc.nextLine();
            chekoutDate = sdf.parse(checkout);

            reservation1.updateDates(chekinDate, chekoutDate);
            System.out.println("Reservation: " + reservation1);
            
        }


    }
}