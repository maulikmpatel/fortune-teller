
import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Fortune Teller.");
		System.out.println("Please enter first name.");
		String response = input.nextLine();

		System.out.println("Please enter your last name.");
		String responseLast = input.nextLine();

		System.out.println("What is your favorite color \"ROYGBIV\", type \"Help\" for more assistance");
		String favColor = input.nextLine();
		String favColorFirst = favColor.toLowerCase();

		while (favColor.equals("Help")) {
			System.out.println("R = Red, O= Orange, Y=Yellow, G=Green, B=Blue, I=Indigo, V=Violet");
			System.out.println("What is your favorite color \"ROYGBIV\", type \"Help\" for more assistance");
			favColor = input.nextLine();
		}

		System.out.println("Please enter your age.");
		int userAge = input.nextInt();

		System.out.println("Please enter your birth month \"1-12\" ");
		int birthMonth = input.nextInt();

		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();

		String retirment;
		if (userAge % 2 == 0) {
			retirment = "in 20 years";
		} else {
			retirment = "in 25 years";
		}
		String vacationSpot;
		if (siblings == 0) {
			vacationSpot = "Kissamee, FL";
		} else if (siblings == 1) {
			vacationSpot = "Hawaii";
		} else if (siblings == 2) {
			vacationSpot = "No Vancation for you";
		} else if (siblings == 3) {
			vacationSpot = "Japan";
		} else {
			vacationSpot = "Siberia";
		}

		
		String bankBalance = "";
		
		switch (birthMonth) {
		case 1:
			bankBalance = "$200";
			break;
		case 2:
			bankBalance = "$2540";
		case 3:
			bankBalance = "$3297";
		case 4:
			bankBalance = "$25077";
		case 5:
			bankBalance = "$23066";
		case 6:
			bankBalance = "$200000";
		case 7:
			bankBalance = "$1000000000";
		case 8:
			bankBalance = "-$212";
		case 9:
			bankBalance = "$2046";
		case 10:
			bankBalance = "$8993";
		case 11:
			bankBalance = "$2123";
		case 12:
			bankBalance = "$232056";

			break;

		default:
			System.out.println("please enter a valid number");
			break;
		}
		String colorFirst = "";
		switch (favColorFirst) {
		case "red":
			colorFirst = "Ford Focus";
			break;
		case "orange":
			colorFirst = "Toyota Carolla";
			break;
		case "yellow":
			colorFirst = "Rage Rover Discovery";
			break;
		case "green":
			colorFirst = "Jeep Grand Cherokee SRT";
			break;
		case "blue":
			colorFirst = "Mercedes AMG";
			break;
		case "indigo":
			colorFirst = "GMC Sierra";
			break;
		case "violet":
			colorFirst = "Nissan Rouge";
			break;
		default:
			System.out.println("Invalid Color, please start again");
		}

		
		System.out.println(response +" "+ responseLast + " will retire in " + retirment + " with "+ bankBalance + " in the bank, a vacation home in " + vacationSpot + " and travel by "+ colorFirst);

	}
	
	
}