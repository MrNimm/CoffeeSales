package com.maxwell;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
       /* For this assignment, you will develop two classes (separate files). The first class will contain the following:
        The main method for greeting the user when the program begins with “Welcome to the Coffee Sales Calculator.” or similar message.
                A method for user input for the bag weight and number of bags.
                A method that handles output for the results. The results will include the current date calculated using the built-in Date class. Align the output to look like a sales receipt.
                A method for output of a message that is displayed when the user is done calculating coffee sales.
                The second class will contain:
        Two constant data fields:
        One for the price per pound, which is $5.99
        One for the tax rate, which is 7.25% (expressed as 0.0725)
        A no-argument constructor that creates a sale of one bag weighing one pound.
                A constructor that accepts arguments from the first class for number of bags and the weight of each bag.
                A constructor that accepts arguments from the first class for number of bags and the weight of each bag.
                A method named getSale() that returns the sale amount before tax.
                A method named getSaleTax() that returns the tax on the transaction.
                A method named getTotalPrice() that returns the total sale price.
        A method named getPrice() that returns the price per pound.
        A method named getTaxRate() that returns the tax rate.
                Calculations will be based on the following formulas:
        totalPrice = bagWeight * numberOfBags * pricePerLB
        totalPriceWithTax = totalPrice + (totalPrice * taxRate)
        The program will calculate sales until the user indicates that there are no further sales. All output will be limited to two decimal places
        */
        System.out.println("Welcome to the Coffee Sales Calculator");
//user input
        Scanner weightofbags = new Scanner(System.in);
        System.out.println("Input weight of bags:");
        String weight = weightofbags.nextLine();
        System.out.println("Weight =" + weight);


        Scanner numberofbags = new Scanner(System.in);
        System.out.println("Input Number of Bags:");
        String number = numberofbags.nextLine();
        System.out.println("Number of bags = " + number);


    }
}
