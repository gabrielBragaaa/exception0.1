package org.example;

import org.example.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int roomNumber = sc.nextInt();
        System.out.print("Enter the date of Checkin (dd/MM/yyyy) : ");
        sc.nextLine();
        String checkin = sc.nextLine();
        Date chekinDate = sdf.parse(checkin);
        System.out.print("Enter the date of Check-out (dd/MM/yyyy) : ");
        String checkout = sc.nextLine();
        Date chekoutDate = sdf.parse(checkout);
        if (!chekoutDate.after(chekinDate)) {
            System.out.println("Error iin reservation: Check-out date must be after chekin-in date");
        } else {
            Reservation reservation1 = new Reservation(chekoutDate, chekinDate, roomNumber);
            System.out.println(reservation1.toString());
        }


    }
}