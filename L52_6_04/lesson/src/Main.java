public class Main {
    public static void main(String[] args){
     }
    //определить число Фибоначи по его индексу (n)

     public static long fib (int n){
    int current=0;
    int next=1;
         for (int i = 0; i < n; i++) {
             int newFib=current+next;
             current=next;
             next=newFib;
             
         } return current;
     }
    //определить число Фибоначи по его индексу (n)
    public static long fibArray (int n){

        long [] cache=new long[n+1];
        if (n<2){return n;};
        cache[0]=0;
        cache[1]=1;
        for (int i = 2; i < cache.length; i++) {
        cache[i]=cache[i-2]+cache[i-1];

        } return cache[n];
    }
}