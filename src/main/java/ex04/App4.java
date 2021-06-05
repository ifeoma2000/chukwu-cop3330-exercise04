package ex04;
/*
Mad libs are a simple game where you create a story template with blanks for words. You, or another player, then construct a list of words and place them into the story, creating an often silly or funny story as a result.

Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a story that you create.

Example Output
Enter a noun: dog
Enter a verb: walk
Enter an adjective: blue
Enter an adverb: quickly
Do you walk your blue dog quickly? That's hilarious!

Constraints
Use a single output statement for this program.
If your language supports string interpolation or string substitution, use it to build up the output.

Challenges
Add more inputs to the program to expand the story.
Implement a branching story, where the answers to questions determine how the story is constructed.
 */
//UCF COP3330 Summer 2021 Assignment 1 Solution Copyright 2021 Ifeoma Chukwu
import java.util.Scanner;
public class App4 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a noun: ");
    String name1 = input.nextLine();
    System.out.println("Enter a verb: ");
    String name2 = input.nextLine();
    System.out.println("Enter an adjective: ");
    String name3 = input.nextLine();
    System.out.println("Enter an adverb: ");
    String name4 = input.nextLine();
    System.out.println("Do you" +" "+ name2+ " "+"your"+" "+name3+" "+name1+" "+name4+"?");
}
}
