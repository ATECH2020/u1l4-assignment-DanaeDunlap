import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int seconds = scanner.nextInt();
			

        //Your code goes here
				int hour = seconds / 3600; 
				int minutes = seconds / 60; 
				System.out.print(hour + " " + minutes);


        // closing the scanner object
        scanner.close();
    }
}