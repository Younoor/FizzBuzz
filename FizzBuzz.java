import java.util.*;
public class FizzBuzz {
    public static String FizzoBuzz(int val){
        String ret = "";
        if((val % 3 == 0) && (val % 5 ==0)){
            ret += "FizzBuzz" + "\n";
        }
        else if(val % 3 == 0){
            ret += "Fizz" + "\n";
        }
        else if(val % 5 ==0){
            ret += "Buzz" + "\n";
        }
        return ret;
    }
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        int i;

        for(i=0; i<=n; i++){
            System.out.print(FizzoBuzz(i));
        }
    }
}
