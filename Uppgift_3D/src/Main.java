import java.util.Arrays;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {


        /*
        AUTHOR
        Ulrika Eriksson, 2022-05-19

        INTRODUCTION
        A program that puts incoming calls in a queue for the call center. When a call is
        marked answered, it is removed from the front of the array, and the other calls are
        moved forward.

        IMPLEMENTATION
        An array of the type "Call" is created with ten spaces.
        With a switch statement in a do-while loop, the user can choose from a menu to
        register a caller or remove the first caller from the array (or exit).
        The information is stored in a  class, trough getters and setters.
        The index (i) starts at 0, and is increased with 1 after each time a caller is registered.
        When a caller is removed, the index is decreased by 1. Otherwise, there would be null
        spaces in the middle of the array.

        To remove the first call, a for loop is used in the method "marked". it starts at index
        0, and reassign its values with the ones from index 1. Then it continues with the next index,
        (1), and reassign it with the value from 2. And so on. The method prints the index, name and number.

        DISCUSSION

        The first problem I ran into was how I would send the customerArray, created in main,
        to the method "Marked" in the class "Call". I tried a bit and realised I needed to make
        a new Class object of "Call", which I named method that was not an array. I'm not
        entirely sure why I can't use "customerArray.Marked" instead, but I believe it is
        because customerArray is a Call Array.

        The next issue I had was what the method would do and not do. First, I made the
        method return the array, and then I printed the returned array. Then I had the difficulty
        which I have had before, that the print only showed the memory location of the objects
        of the array, not the attributes. I decided to incorporate the printing in the method,
        and used a variable to store the attributes and print them one at a time, and make
        the method void instead.

        First, the program crashed when the array reached the null locations. So I decided to use an if statement
        to check if the value was null before printing, and in that case break out from loop. This was something new
        and useful I learned.

        To better the code, I would like the program to catch if the user tried to put in
        to many calls in the array (an 11:th object), and maybe tell the user "Queue is full,
        caller informed to call later", or something similar.


         */


        Scanner scan = new Scanner(System.in);

        //Array with ten slots are created, and another call object to be able to use the methods.
        Call [] customerArray = new Call[10];
        Call method = new Call();

        int i = 0;

        boolean exit = true;

        do {

            System.out.println("What would you like to do?");
            System.out.println("1. Register incoming call.");
            System.out.println("2. Remove first call from array.");
            System.out.println("3. Exit program.");

            int answer = scan.nextInt();

            switch (answer) {
                case 1:

                    customerArray[i] = new Call();

                    System.out.println("Welcome to Call center!");
                    System.out.println("Please enter your name: ");
                    customerArray[i].setName(scan.next());
                    scan.nextLine();

                    System.out.println("Please enter your phone number: ");
                    customerArray[i].setPhone(scan.nextInt());
                    scan.nextLine();

                    //i is increased to set the next index.
                    i++;

                    break;


                case 2:

                    //method that sends the customerArray. Void method so nothing is returned.
                    method.Marked(customerArray);

                    //i is decreased to make sure there isn't any null spaces in the array.
                    i--;

                    break;

                case 3:
                    System.out.println("Thank you for using CallRegister!");
                    exit = false;

            }




        } while (exit);




    }
}