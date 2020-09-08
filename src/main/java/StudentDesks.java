import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int classOne = scanner.nextInt(); 
				int classTwo = scanner.nextInt(); 
				int classThree = scanner.nextInt(); 
				int deskOne, deskTwo, deskThree; 

        /*
         *  your code goes here
         */

				if (classOne % 2 == 0){
						deskOne = classOne / 2; 
				} 
				else {
					deskOne = (classOne / 2) + 1; 
				}

				if(classTwo % 2 == 0){
					deskTwo = classTwo / 2; 
				}
				else {
					deskTwo = (classTwo / 2) + 1; 
				}

				if(classThree % 2 == 0){
					deskThree = classThree / 2; 
				}
				else {
					deskThree = (classThree / 2) + 1; 
				}

				int totalDesk = deskOne + deskTwo + deskThree; 

				System.out.print(totalDesk);

        // closing the scanner object
        scanner.close();
    }
}