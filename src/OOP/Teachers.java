package OOP;

public class Teachers {
    String name;
    int age;
    float salary;
    String department;
    static long total_teachers;

    public Teachers( String name, int age,float salary,String department){
    this.name = name;
    this.age = age;
    this.salary = salary;
    this.department = department;
    Teachers.total_teachers += 1;
    } 

    static {
        System.out.println("the Total no of Teachers will be display if you wish");
    }
}
