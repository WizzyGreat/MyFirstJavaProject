
package javaprojectmadlibsgame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// MAD LIBS GAME
				Scanner scanner = new Scanner(System.in);
				
			
				String adjective1;
				String noun1;
				String adjective2;
				String verb1;
				String adjective3;
				
				System.out.print("Enter an adjective1 (Description):");
				adjective1 = scanner.nextLine();
				System.out.print("Enter a noun1 (animal or person):");
				noun1 = scanner.nextLine();
				System.out.print("Enter an adjective2 (Description):");
				adjective2 = scanner.nextLine();
				System.out.print("Enter a verb1 end with -ion (action):");
				verb1 = scanner.nextLine();
				System.out.print("Enter an adjective3 (Description):");
				adjective3 = scanner.nextLine();
				
				
				
				System.out.println("I went to " + adjective1 + "" +  "" +"school");
				System.out.println("I was flagabastered when i saw " +  noun1);
				System.out.println(noun1 + "advice the youth to learn a good tech skill" + verb1);
			    System.out.println("Everybody wwere " + adjective3);
			    
			    scanner.close();
			}


	}

