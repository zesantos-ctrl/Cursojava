package datas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DataCalculo {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2026-10-13");
        LocalDateTime d05 = LocalDateTime.parse("2026-10-13T01:30:26");
        Instant d06 = Instant.parse("2026-10-13T01:13:26Z");

        // Calculando datas
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        System.out.println("=================================");

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        System.out.println("=================================");

        LocalDateTime pastWeekInstant = d05.minus(7, ChronoUnit.DAYS);
        LocalDateTime nextWeekInstant = d05.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d05);
        Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println("t1 = " + t1.toDays() + " dias");
        System.out.println("t2 = " + t2.toDays() + " dias");
        System.out.println("t3 = " + t3.toDays() + " dias");
        System.out.println("t4 = " + t4.toDays() + " dias");

    }
}
