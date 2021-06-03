import java.util.Scanner;

public class Question1 {
    //First condition is begin and end with asterisks
    //Second is the inputs are integers
    //Like html tags form nested
    //Empty content inside stars is allowed
    //If not achieving conditions above, return “Please put the digits between two stars”.
    public static boolean flag = false; //Used for determining user enter the right input and break if correct input

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(!flag){
            // ask for input
            System.out.print("Enter your codes with bounded with two stars : ");
            String str = s.nextLine();
            System.out.println(check(str,0,0));
        }
    }

    public static String check(String str, int index, int even){
        if(str.equals("")){
            return str + " ---> Please put the digits between two stars";
        }
        if(index==str.length()){
            // true if all the character inside the *
            if(even%2==0){
                // if * is in even number then true
                flag = true;
                return str + " ---> correct";
            }else
                // if * is in odd number then true
                return str + " ---> Please put the digits between two stars";
        }
        if(index==0&&str.charAt(index)!='*'){
            // if the first character is not equal to *
            return str + " ---> Please put the digits between two stars";
        }else if(index==str.length()-1&&str.charAt(index)!='*'){
            // if the last character is not equal to *
            return str + " ---> Please put the digits between two stars";
        }else{
            // check next character is *
            if(str.charAt(index)=='*'){
                return check(str,index+1,even+1);
            }
            else{
                char a = str.charAt(index);
                if(Character.isDigit(a)){   //make sure the input is integer form
                    return check(str,index+1,even);
                }else{
                    return str + " ---> Please put the digits between two stars";
                }
            }
        }
    }
}
