public class Complex {
    private int num1;
    private int num2;
    private int sum;
    public Complex(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
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
    public int sum_complex(){
        sum=getNum1()+getNum2();
        return sum;
    }
    public static void main(String[] args){
        Complex obj=new Complex(4,5);
    }
}
