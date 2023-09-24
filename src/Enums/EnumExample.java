package Enums;

public class EnumExample {

    public enum DaysInWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public static void main(String[] args) {
        System.out.println(DaysInWeek.SUNDAY);
        System.out.println(DaysInWeek.MONDAY);
        System.out.println(DaysInWeek.TUESDAY);
        System.out.println(DaysInWeek.WEDNESDAY);
        System.out.println(DaysInWeek.THURSDAY);
        System.out.println(DaysInWeek.FRIDAY);
        System.out.println(DaysInWeek.SATURDAY);

    }

}
