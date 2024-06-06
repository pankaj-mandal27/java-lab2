package Encapsulation;

class Main {
    public static void main(String args [])
    {
        Student student = new Student();

        student.setName("Pankaj");
        student.setRollNum(22);
        student.setMarks(99.9);

        System.out.println("Name : "+student.getName());
        System.out.println("Roll : "+student.getRollNum());
        System.out.println("Marks: "+student.getMarks());

    }

}
