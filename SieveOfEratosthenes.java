import java.util.*;
public class SieveOfEratosthenes {
    static void sieveOfEratosthenes(int input){
        boolean[] prime=new boolean[input+1];
        for(int i=0;i<=input;i++){
            prime[i]=true;
        }
        for(int number=2;number*number<=input;number++){
            if(prime[number]==true){
                for(int i=number*number;i<=input;i=i+number){
                    prime[i]=false;
                }
            }
        }
        for(int iterator=2;iterator<=input;iterator++){
            if(prime[iterator]==true){
                System.out.println(iterator);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the range to which we need to find prime");
        int inputNumber=input.nextInt();
        sieveOfEratosthenes(inputNumber);

    }
}
