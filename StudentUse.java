public class StudentUse {
    public static void main(String[] args) {
        Student s1= new Student("Himanshu");
        Student s2= new Student("Rinkey");
        Student s3 = new Student("Himanshi");


        s1.printStudent();
        s2.printStudent();
        s3.printStudent();

        Student s4=new Student("Shivaya");
        s4.printStudent();
        System.out.println("Total Students = "+Student.getNumStudent());
    }
}
