import java.util.Scanner;

public class Average {
    private int num1;
    private int num2;
    private int num3;
    private int avg;
    public Average(int num1,int num2, int num3){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    public int Calculate_avg(){
         avg=((getNum1()+getNum2()+getNum3())/3);
        return avg;
    }
    public void display(){
        System.out.println("The average of 3 given numbers: "+getAvg());
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("please Enter Number1: ");
        int num1= myObj.nextInt();
        System.out.println("please Enter Number2: ");
        int num2= myObj.nextInt();
        System.out.println("please Enter Number3: ");
        int num3= myObj.nextInt();
        Average obj=new Average(num1,num2,num3);
        obj.Calculate_avg();
        obj.display();

    }
}
