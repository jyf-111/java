
public class mutex {
    int idx = 0;
    char []data = new char[10];
    
    public void push(char c) {
        //对象
        synchronized(this){
            data[idx] = c;
            idx++;
        }
    }
    //方法
    public synchronized char pop() {
        idx--;
        return data[idx];
    }
}
