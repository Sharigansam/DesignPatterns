package builder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //1
//        Builder builder = new Builder();
//        builder.setName("Sam");
//        builder.setAge(23);
//        builder.setGender("Female");
//
//        Student student = builder.getBuilder();
//        System.out.println(student.getName());


        //2.
       // Builder b = Student.build();

        //3.

        Student student = Student.builder()
                .setName("Sam")
                .setAge(26)
                .setGender("Female")
                .setPsp(85.0)
                .setGradYear(2022)
                .build();

        System.out.println(student);
    }
}