// Implement Fibonacci series using simple 
// and recursive nature and compare with time.

public class P2 {

    static int rec_count = 0;
    static int iter_count = 0;

    static int nth_fib(int n){
        rec_count ++ ;
        if(n<=1)            
            return n;
        
        return nth_fib(n-1) + nth_fib(n-2);
    }

    static void fib_recursion(int n){
        int i = 1;
        while(i++ < n){
            System.out.print(nth_fib(i)+ " ");
        }
    }

    static void fibseries_iterative(int n){
        int a = 0,b =1;
        while(n-- != 0){

            iter_count ++ ;
            int temp = b;
            b = a + b;
            a = temp;
            System.out.print(a + " ");
        }
        
    }

    public static void main(String[] args) {

        fib_recursion(10);
        System.out.println("Steps in recursive: "+ rec_count);
        
        fibseries_iterative(10);
        System.out.println("Steps in iterative: "+ iter_count);
                
    }
}
