import java.util.Random;
import java.util.*;
class compare{
    public void Guess(){
        int n = 1;
        Random rand = new Random();
        int r = rand.nextInt(100);
        int a;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Guess the number: ");
            a = sc.nextInt();
            if(n>=10){
                System.out.println("!***Game Over***!");
                break;
            }
            if(a>r){
                System.out.println("Lower number please!");
            }
            else if(r>a){
                System.out.println("Higher number please!");
            }
            else{
                System.out.println("You Guessed in "+ n +" attemts");
            }
            n++;
        }while(r!=a);
    }
}
public class GuessGame {

    public static void main(String[] args){
        compare sc = new compare();
        sc.Guess();
    }
}
