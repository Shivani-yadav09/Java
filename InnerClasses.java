
//the outer class (i.e InnerClasses) cannot be static
public class InnerClasses {
    //only inner classes can be static
    static class Test{
        String name;

        //This is a constructor(use ctrl + symbol and . )
        public Test(String name) {
            this.name = name;
        }
    } 

    public static void main(String[] args) {
        Test a =new Test("Shivani");
        Test b =new Test("Kunal");

        System.out.println(a.name);
        System.out.println(b.name);

        
    }

}
