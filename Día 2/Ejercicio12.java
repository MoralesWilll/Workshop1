import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your birth day (1-31): ");
            int day = sc.nextInt();
            
            System.out.print("Enter your birth month (1-12): ");
            int month = sc.nextInt();
            
            String horoscope;
            
            switch (month) {
                case 1 -> {
                    if (day < 20) {
                        horoscope = "Capricorn";
                    } else {
                        horoscope = "Aquarius";
                    }
                }
                case 2 -> {
                    if (day < 19) {
                        horoscope = "Aquarius";
                    } else {
                        horoscope = "Pisces";
                    }
                }
                case 3 -> {
                    if (day < 21) {
                        horoscope = "Pisces";
                    } else {
                        horoscope = "Aries";
                    }
                }
                case 4 -> {
                    if (day < 20) {
                        horoscope = "Aries";
                    } else {
                        horoscope = "Taurus";
                    }
                }
                case 5 -> {
                    if (day < 21) {
                        horoscope = "Taurus";
                    } else {
                        horoscope = "Gemini";
                    }
                }
                case 6 -> {
                    if (day < 21) {
                        horoscope = "Gemini";
                    } else {
                        horoscope = "Cancer";
                    }
                }
                case 7 -> {
                    if (day < 23) {
                        horoscope = "Cancer";
                    } else {
                        horoscope = "Leo";
                    }
                }
                case 8 -> {
                    if (day < 23) {
                        horoscope = "Leo";
                    } else {
                        horoscope = "Virgo";
                    }
                }
                case 9 -> {
                    if (day < 23) {
                        horoscope = "Virgo";
                    } else {
                        horoscope = "Libra";
                    }
                }
                case 10 -> {
                    if (day < 23) {
                        horoscope = "Libra";
                    } else {
                        horoscope = "Scorpio";
                    }
                }
                case 11 -> {
                    if (day < 22) {
                        horoscope = "Scorpio";
                    } else {
                        horoscope = "Sagittarius";
                    }
                }
                case 12 -> {
                    if (day < 22) {
                        horoscope = "Sagittarius";
                    } else {
                        horoscope = "Capricorn";
                    }
                }
                default -> horoscope = "Invalid input";
            }
            
            System.out.println("Your horoscope is: " + horoscope);
        }
    }
}