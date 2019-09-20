/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using
 * ASCII (American Standard Code for Information Interchange). Using the already
 * created file named `ASCIIArt.java` write a program that outputs your artwork
 * to the console. The goal of this project is to use ONLY what we have learned
 * in Unit 1 to create anything you would like so be creative (and school
 * appropriate). Artwork must also have a caption describing what it's
 * depicting.
 * 
 * For those of you who have dabbled in coding before, try to contain your code
 * to just what we have discussed in this unit.
 * 
 * @author Mr. Rasmussen
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void tip() {
		System.out.println("     	         _	 ");
		System.out.println("                / \\");
		System.out.println("               /   \\");
	}

	public static void blade() {
		System.out.println("               | N |");
		System.out.println("               | E |");
		System.out.println("               | W |");
		System.out.println("               | P |");
		System.out.println("               | O |");
		System.out.println("               | R |");
		System.out.println("               | T |");
	}

	public static void handguard() {
		System.out.println("            |\\_|   |_/|");
		System.out.println("            | _     _ |");
		System.out.println("            |/ |   | \\|");
	}

	public static void handle() {
		System.out.println("                \\_/");
		System.out.println("                | |");
		System.out.println("                |_|");
		System.out.println("                / \\");
		System.out.println("                \\_/");
	}

	public static void main(String[] args) {
		tip();
		blade();
		handguard();
		handle();
		System.out.println("\n The Great Sword Of Newport Knights");
	}
}