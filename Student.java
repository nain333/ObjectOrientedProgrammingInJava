public class Student {

    private int rollNumber;
    private String name;
     double cgpa ;
    final static double conversionFactor=0.95;
   private static int numStudent;

    public void setName(String name) {

            this.name = name;

    }
    public void setRollNumber(int  rollNumber){
         this.rollNumber=rollNumber;
    }
    public int getRollNumber(){
        return this.rollNumber;
    }

    public String getName() {
        return this.name;
    }
    public static int getNumStudent(){
        return numStudent;
    }
    public Student(String name){
        setName(name);
        setRollNumber(numStudent+1);
        numStudent++;

    }
    public void printStudent(){
        System.out.print("Name: "+this.name+" Roll Number: "+this.rollNumber);
        System.out.println();
    }

}
