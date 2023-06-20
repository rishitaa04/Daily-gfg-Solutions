class Solution{
    public static long factorial(int N){
        long f = 1;
        for(int i = 1 ; i <= N ; i++){
            f = f * i ;
        }
        return f;
    }
}
