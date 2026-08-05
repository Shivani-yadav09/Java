public class Main{
    public static void main(String[] args) {
        Human kunal=new Human(21,"Kunal",120000,false);
        Human rahul=new Human(22,"rahul",20000,true);
        Human shivani=new Human(21,"Shivani",20000,true);

        System.out.println(kunal.name);
        System.out.println(rahul.age);
        // System.out.println(kunal.population);
        // System.out.println(rahul.population);
        // System.out.println(shivani.population);
        //Use the below method(i.e convention method)
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

        //greeting();
        
 
    }
    static void fun(){
        Main obj=new Main();
        obj.greeting();
    }
    static void greeting(){
        System.out.println("Hello Shivani!");
    }
}