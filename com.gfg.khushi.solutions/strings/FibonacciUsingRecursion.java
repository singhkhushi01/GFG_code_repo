class FibonacciUsingRecursion{
    public static void main(String args[]){
        int n=5;
        int ans=fibo(n);
        System.out.println(ans);
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
}