import java.lang.Math;
public class Triangle {
    private int side1=3;
     private int side2=4;
    private int side3=5;
    public Triangle() {

    }
    public int getSide1(){
        return side1;
    }
    public void setSide1(int side1){
        this.side1=side1;
    }
    public int getSide2(){
        return side2;
    }
    public void setSide2(int side2){
        this.side2=side2;
    }
    public int getSide3(){
        return side3;
    }
    public void setSide3(int side3){
        this.side3=side3;
    }


    public static void main(String[] args) {
        Triangle tri=new Triangle();
        Triangle tri1=new Triangle();
        int s=(tri.getSide1()+ tri.getSide2()+ tri.getSide3())/3;
        double area=Math.sqrt(s*(s-tri.getSide1())*(s- tri.getSide2())*(s- tri.getSide3()));
        System.out.println("area of triangle= "+area);
        int perimeter= tri1.getSide1()+ tri.getSide2()+ tri.getSide3();
        System.out.println("perimeter of triangle= "+perimeter);



    }
}

