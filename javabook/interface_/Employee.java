
import java.util.ArrayList;
import java.util.Arrays;

public class Employee implements Comparable<Employee>, Cloneable{
    private String name;
    private double salary;

    public Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary*byPercent/100;
        salary+=raise;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary, o.salary);
    }

    @Override
    public Employee clone() throws CloneNotSupportedException{
        Employee tmp = (Employee)super.clone();
        tmp.name = String.copyValueOf(name.toCharArray());
        return tmp;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("jyf", 15);
        Employee e2 = new Employee("hi~hi", 12);
        Employee e3 = new Employee("xx", 20);
        var l = new ArrayList<Employee>(5);
        l.add(e1);
        l.add(e2);
        l.add(e3);
        Employee[] a = (Employee[])l.toArray(new Employee[l.size()]);
        Arrays.sort(a);
        // System.out.println(Arrays.toString(a));
        for(int i=0;i<l.size();i++){
            System.out.println(a[i].salary);
        }
    }
}
