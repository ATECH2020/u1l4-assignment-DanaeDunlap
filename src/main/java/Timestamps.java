import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();


        /*
         *  your code goes here
         */
				 int hourToSec1 = hours1 * 3600;
				 int hourToSec2 = hours2 * 3600;
				 int minToSec1 = minutes1 * 60; 
				 int minToSec2 = minutes2 * 60; 
				 
				 int deltaHour = hourToSec2 - hourToSec1;
				 int deltaMin = minToSec2 - minToSec1;
				 int deltaSec = seconds2 - seconds1; 

				 int totalSec = deltaHour + deltaMin + deltaSec;

				 System.out.print(totalSec);

        // closing the scanner object
        scanner.close();
    }
}