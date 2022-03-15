public class Rectangle {
    private int length;
    private int breadth;
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;

    }

    public void setLength(int length) {
        this.length = length;

    }

    public int getArea(){
        int area=getLength()*getBreadth();

        return area;

    }
    public void display(){
        System.out.println("area= "+getArea());
    }
    public static void main(String[] args){

        Rectangle obj = new Rectangle(4,5);
        obj.setBreadth(8);
        int num=obj.getBreadth();
        obj.setLength(5);
        int num2=obj.getLength();

        Rectangle obj1 = new Rectangle(num2,num);


           obj.display();
           obj1.display();




    }
}
