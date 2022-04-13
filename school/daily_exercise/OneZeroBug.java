public class OneZeroBug {
    private static int solve(int[] w,int[] v,int index,int capacity) {
        if(index <0 || capacity <=0){
            return 0;
        }
        int res = solve(w,v,index-1,capacity);
        if(w[index]<capacity){
            res = Math.max(res,w[index]+solve(w, v, index-1, capacity-w[index]));
        }
        return res;
    }    
    public static int knapSack(int[] w, int[] v, int C) {
        int size = w.length;
        return solve(w, v, size - 1, C);
    }
    public static void main(String[] args){
        int[] w = {2,1,3,2};
        int[] v = {12,10,20,15};
        System.out.println(knapSack(w,v,5));
    }

}
