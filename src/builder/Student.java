package builder;

public class Student {
    private String name;
    private int age;
    private String gender;
    private double psp;
    private int gradYear;

    public static class Builder {
        private String name;
        private int age;
        private String gender;
        private double psp;
        private int gradYear;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    private Student(Builder builder) {
        this.name = builder.name;

        if (builder.age > 18) {
            this.age = builder.age;
        }
        this.gender = builder.gender;
        this.psp = builder.psp;
        this.gradYear = builder.gradYear;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", psp=" + psp +
                ", gradYear=" + gradYear +
                '}';
    }
}
