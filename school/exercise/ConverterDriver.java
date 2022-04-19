
class Converter {
    private Integer value;    
    Converter(){}
    Converter(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toBase(int base){
        int num = value.intValue();
        Integer x = Integer.valueOf(2);

        StringBuilder s = new StringBuilder();
        s.append((num%base));
        num/=base;

        while(num!=0){
            x = Integer.valueOf(num%base);
            s.append('_'+x.toString());
            num/=base;
        }
        return s.reverse().toString();
    }

    public String toBin() {

        return toBase(2);
        
    }

    public String toOct() {
        return toBase(8);
        
    }
    
    public String toHex() {
        return toBase(16);
    }
}
    
public class ConverterDriver {
    public static void main(String[] args) {
        Converter c = new Converter();
        c.setValue(17);
        System.out.println(c.toHex());
    }
}
