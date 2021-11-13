public class staticInnerClass {
    public static void main(String[] args) {
        var values = new double[20];
        for(int i=0 ;i<values.length;i++){
            values[i] = 100*Math.random();
        }
        // System.out.println(Arrays.toString(values));
        ArrayAlg.Pair<Double> p = ArrayAlg.minmax(values);
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());
    }    
}

class ArrayAlg{
    public static class Pair<T>{

        private T first;
        private T second;
    
        public T getFirst() {
            return first;
        }
        public void setFirst(T first) {
            this.first = first;
        }
        public T getSecond() {
            return second;
        }
        public void setSecond(T second) {
            this.second = second;
        }
        Pair(T f,T s){
            first = f;
            second = s;
        }
    }
    public static Pair<Double> minmax(double[] values){
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for(var i:values){
            if(i>max){
                max = i;
            }
            if(i<min){
                min = i;
            }
        }

        return new Pair<Double>(max,min);

    }
}