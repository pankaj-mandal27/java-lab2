package Encapsulation;

class Student {

    private String name;
    private int rollNum;
    private double marks;

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }
    public int getRollNum(){
        return rollNum;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }
}
