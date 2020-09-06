import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
				int hourDegree = scanner.nextInt(); 
				 


        /*
         *  your code goes here
         */
				int hour = hourDegree / 30; 
				double min = (hourDegree % 30.0) * 2;
				double minDegree = min * 6; 

				System.out.println(minDegree);

        // closing the scanner object
        scanner.close();
    }
}