// Java code asked in TCS NQT 2025
import java.util.Scanner;
class Main {
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static int sumOfPrime(int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int start=sc.nextInt();
        int end =sc.nextInt();
        int sum =sumOfPrime(start,end);
        System.out.println(sum);
        sc.close();
        
    }
}
