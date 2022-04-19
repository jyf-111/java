public class HannoDriver {
    public static void main(String[] args) {
        Hanno h = new Hanno();
        h.solve(5, 'A', 'B', 'C');
    } 
}

/**
 * Hanno
 */
class Hanno {
    public void solve(int n,char A,char B,char C) {
        if(n==1){
            move(A, C);
            return;
        }
        solve(n-1, A, C, B);
        move(A, C);
        solve(n-1, B, A, C);
    }

    private void move(char A,char B) {
        System.out.println(A+"->"+B);
    }
}