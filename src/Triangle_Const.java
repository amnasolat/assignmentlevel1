public class Triangle_Const {
    private int side1;
    private int side2;
    private int side3;
    public Triangle_Const(int side1,int side2,int side3){
        this.side1=side1; //parameterized constructor
        this.side2=side2;
        this.side3=side3;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public static void main(String[] args){
        Triangle_Const tri= new Triangle_Const(3,4,5); // invoke parameterized constructor


        int s=(tri.getSide1()+ tri.getSide2()+ tri.getSide3())/3;
        double area=Math.sqrt(s*(s-tri.getSide1())*(s- tri.getSide2())*(s- tri.getSide3()));
        System.out.println("area of triangle= "+area);
        int perimeter= tri.getSide1()+ tri.getSide2()+ tri.getSide3();
        System.out.println("perimeter of triangle= "+perimeter);
    }
}
