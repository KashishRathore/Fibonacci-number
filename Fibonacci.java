public class Project_7_PS {
    static void multiplication(int n){
        for(int i=1 ; i<=10 ; i++){
            System.out.printf("%d * %d = %d \n", n , i , n*i);
        }
    }

    static void Pattern(int n){
        for(int i= 0 ; i < n ; i++){
            for(int j = 0 ; j < i+1 ; j++){
                System.out.println("*");
            }
         System.out.println(" ");
        }
    }

    static int Sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n + Sum(n-1);
        }
    }

    static void Pattern_Reverse(int n){
        for(int i = n ; i >= 1; i--){
            for(int j = 1 ; j <= i ; j++){
                System.out.println(" * ");
            }
            System.out.println(" ");
        }
    }


    static int fib(int n){
        /*if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        */

        if( n==1 || n==2){
            return n-1;
        }

        else{
            return fib(n-1) + fib(n-2);
        }
    }
