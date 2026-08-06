public class Box {
    double length;
    double height;
    double width;

    Box() {
        this.length=-1;
        this.height=-1;
        this.width=-1;  

    }
    Box(double side){
        this.length=side;
        this.height=side;
        this.width=side;

    }
    Box(double length,double height,double width){
        this.length=length;
        this.width=width;
        this.height=height;

    }

    
}
