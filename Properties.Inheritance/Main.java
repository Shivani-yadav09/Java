public class Main {
    public static void main(String[] args) {
        Box box1=new Box(4.7,4.5,9.9);
        Box box2=new Box(box1);
        System.out.println(box1.length+ " "+box1.height+ " "+box1.width);
    }
}
