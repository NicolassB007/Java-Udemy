public class Person {
    private String name;
    private int age;

    public Person(int age) {
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    // Setter
    public void setAge(int age) {
        age = Math.abs(age);
        if ((age >= 0) && (age <= 120)) {
            this.age = age;
        }
    }

    public String getName() {
        return this.name;
    }

    // Getter
    public int getAge() {
        return age;
    }
}
