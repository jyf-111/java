
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FindSisterPrime {
    public static Boolean isPrime(int n) {
        for(int k = 2 ; k<=Math.sqrt(n) ;k++){
            if(n%k==0){
                return false;
            }
        }
        return true;
    }    

    public void print(){

        try {
            FileOutputStream file = new FileOutputStream("javabook/Stream_/File.dat");
            DataOutputStream out = new DataOutputStream(file);
            for(int i = 11 ;i<100 ;i+=2){
                if(isPrime(i)&& isPrime(i+2)){
                    out.writeInt(i);
                    out.writeInt(i+2);
                }
            }
            out.close();
        } catch (IOException e) {
            
        }
    }

    public void read() {
        try {
            FileInputStream file = new FileInputStream("javabook/STream_/File.dat");
            DataInputStream in = new DataInputStream(file);
            try {
                while(true){
                    int n1 = in.readInt();
                    int n2 = in.readInt();
                    System.out.println(" "+n1+","+n2);
                }
            } catch (EOFException e) {
                in.close();
            }       
        } catch (Exception e) {
            
        }

    }
    public static void main(String[] args) {
        FindSisterPrime f = new FindSisterPrime();
        f.print();        
        f.read();
    }
}