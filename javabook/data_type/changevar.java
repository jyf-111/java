public class changevar {
    public int aver(int... a){
        int large = 0;
        for(int i:a){
            if(i>large){
                large = i;
            }
        }
        return large;
    }

    public static void main(String[] args) {
        System.out.println(new changevar().aver(new int[]{1,2,3,4,5}));
    }
}
