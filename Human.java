//package StaticExample;
//OOPS Concepts
public class Human{
    int age;
    String name;
    int salary;
    boolean married;
    //static are independent
    static long population;

    static viod message(){
        System.out.println("Hello World!");
        //cannot use this.age obj
        // System.out.println(this.age);
    }
    public Human(int age,String name,int salary,boolean marriage){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;  
       // Human.population+=1;
       this.population+=1;
    }
}