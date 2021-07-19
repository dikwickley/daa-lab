// Implement Factorial program using Iterative 
// and recursive nature and compare with time.

public class P1 {

    static int rec_count = 0;
    static int iter_count = 0;


    static int factorial_recursion(int n){
        
        rec_count++;
        
        if(n<=1)
            return n;
            
        return n*factorial_recursion(n-1);
    }

    static int factorial_iterative(int n){
        int f = 1;
        while(n!= 0){
            iter_count++;
            f *= n;
            n--;
        }
        return f;
    }

    public static void main(String[] args) {

        System.out.println(factorial_recursion(10));
        System.out.println("Steps in recursive: "+ rec_count);
        System.out.println(factorial_iterative(10));
        System.out.println("Steps in iterative: "+ iter_count);
                
    }
}