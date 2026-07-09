package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        //custom date
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2020-04-20");
        LocalDateTime d05 = LocalDateTime.parse("2020-04-20T01:30:26");
        Instant d06 = Instant.parse("2020-04-20T01:30:26Z");
        Instant d07 = Instant.parse("2020-04-20T01:30:26-03:00");

        //custom date
        LocalDate d08 = LocalDate.parse("03/11/2025", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("03/11/2025 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2020, 7, 20);
        LocalDateTime d11 =  LocalDateTime.of(2019, 7, 20, 10, 30);

        System.out.println("d01: " + d01);
        System.out.println("d02: " + d02);
        System.out.println("d03: " + d03);
        System.out.println("d04: " + d04);
        System.out.println("d05: " + d05);
        System.out.println("d06: " + d06);
        System.out.println("d07: " + d07);
        System.out.println("d08: " + d08);
        System.out.println("d09: " + d09);
        System.out.println("d10: " + d10);
        System.out.println("d11: " + d11);

    }


}
