public class BinarySearch {
    public int binary_search(int[] a,int x) {
        int start = 0,end = a.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(a[mid]==x) return mid;
            else if(a[mid]<x){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }    
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
        int result = new BinarySearch().binary_search(a, 3);
        System.out.println(result);
    }
}
