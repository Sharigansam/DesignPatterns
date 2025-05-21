package Prototype;

public class Student  implements  Prototype<Student>{
    private String name;
    private int age;
    private double psp;
    private String batchName;
    private double avgBatch;
    private int count = 1;

    public Student() {}

    public Student(Student s) {

        this.name = s.name;
        this.age = s.age;
        this.psp = s.psp;
        this.batchName = s.batchName;
        this.avgBatch = s.avgBatch;
        this.count = s.count;
}

    public Student copy(){

        return new Student(this);
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {
        count++;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public double getAvgBatch() {
        return avgBatch;
    }

    public void setAvgBatch(double avgBatch) {
        this.avgBatch = avgBatch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                ", batchName='" + batchName + '\'' +
                ", avgBatch=" + avgBatch +
                ", count=" + count +
                '}';
    }
}
