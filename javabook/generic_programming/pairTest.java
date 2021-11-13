import java.time.LocalDate;

public class pairTest {
    public static void main(String[] args) {
        LocalDate[] birthday = {
            LocalDate.of(1906,12,9),
            LocalDate.of(1815,12,10),
            LocalDate.of(1903,12,3),
            LocalDate.of(1910, 6, 22),
        };
        ArrayAlg.Pair<LocalDate> mm = ArrayAlg.<LocalDate>minmax(birthday);
        System.out.println(mm.getFirst());
        System.out.println(mm.getSecond());

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
    public static <T extends Comparable> Pair<T> minmax(T[] a){
        if(a==null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for(int i=1;i<a.length;i++){
            if(min.compareTo(a[i])>0){
                min = a[i];
            }
            if(max.compareTo(a[i])<0){
                max = a[i];
            }
        }
        return new Pair<>(min,max);
    }
}
