class Student {
   private String name;
   private int roll_no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getRoll_num(){
        return roll_no;
    }
    public void setRoll_no(int roll_no){
        this.roll_no=roll_no;
    }

}
class test {
    public static void main(String[] args) {
        Student st = new Student();
        Student st1= new Student();
        st.setName("john");
        st.setRoll_no(2);
        st1.setName("Sam");
        st1.setRoll_no(3);
        System.out.println("Student1 Name= "+st.getName());
       System.out.println("Student1  Roll Num= "+st.getRoll_num());
       System.out.println("Student2 Name= "+st1.getName());
       System.out.println("Student2 Roll Num= "+st1.getRoll_num());

    }
}
