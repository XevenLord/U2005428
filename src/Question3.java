import java.util.InputMismatchException;
import java.util.Scanner;

public class Question3 {

    public static void newArray(int [] list, int index){
        Scanner input = new Scanner (System.in);
        try{
            System.out.print("Enter an Integer: ");
            list[index] = input.nextInt();  //Asking for input and added the number into array
            newArray(list,++index);
        }catch(InputMismatchException f){   //invalid input will not be added but the array remains the contents
            System.out.println("Invalid input type");
            newArray(list,index);
        }catch(ArrayIndexOutOfBoundsException e){   //if the array is full, it will straightly print out the result
            System.out.println("The array of integers is");
            for(int j : list)
                System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int[] list = new int[5];
        newArray(list,0);
    }
}

