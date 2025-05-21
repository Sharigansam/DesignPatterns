package Prototype;

public class Client {
    public static void dummyPrototype(StudentRegistry registry) {

        Student st = new Student();
        st.setBatchName("May24");
        st.setAvgBatch(90);

        registry.registerStudent("May24", st);

        IntelligentStudent inst = new IntelligentStudent();
        inst.setBatchName("May25");
        inst.setAvgBatch(80);

        registry.registerStudent("May25", inst);

    }
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        dummyPrototype(registry);
        //new student added in the May24 batch
        Student st = registry.getStudent("May24").copy();
        st.setName("sam");
        st.setAge(26);
        st.setPsp(90);

        System.out.println(st);

      Student inst = registry.getStudent("May25").copy();
      inst.setName("abc");
      inst.setAge(26);
      inst.setPsp(90);

      System.out.println(inst);

      System.out.println("Debug");



    }
}
