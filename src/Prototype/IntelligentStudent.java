package Prototype;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent() {}

    public IntelligentStudent(IntelligentStudent i) {
        super(i);
        this.iq = i.iq;
    }



    public IntelligentStudent copy(){
        return new IntelligentStudent(this);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

}
