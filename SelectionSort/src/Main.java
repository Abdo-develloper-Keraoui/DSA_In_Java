/***
 *
 *This program is designated for generating random lists of people and
 * to showcase the implementation of selection sort (to sort from
 * oldest to youngest) in java and using it to sort the previously
 * generated list of people.
 * I hope you found this helpful
 ***/

import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hi there, give the size of your People Array: ");
        int arraySize = Integer.parseInt(scanner.nextLine());
        //Initialisation
        SelectionSort sortingPeople = new SelectionSort(arraySize);

        //filling the list and printing it
        sortingPeople.fillList();
        System.out.println("People before sorting: ");
        sortingPeople.printArray();

        //finding the oldest for verification
        Person oldest = sortingPeople.findOldest(sortingPeople.getPeople(),arraySize);
        System.out.println("The oldest of them all is: \n" + oldest) ;

        //Applying the selection sort algorithm
        sortingPeople.selectionSort();

        //printing the list after sorting
        System.out.println("People after sorting: ");
        sortingPeople.printArray();

    }

}