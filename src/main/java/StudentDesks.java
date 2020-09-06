import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int classOne = scanner.nextInt(); 
				int classTwo = scanner.nextInt(); 
				int classThree = scanner.nextInt(); 

        /*
         *  your code goes here
         */
				int totalKids = classOne + classTwo + classThree; 
				int totalDesk;

				if (totalKids % 2 == 0){
					totalDesk = totalKids / 2; 
				} 
				else {
					totalDesk = (totalKids / 2) + 1; 
				}

				System.out.println(totalDesk);

        // closing the scanner object
        scanner.close();
    }
}