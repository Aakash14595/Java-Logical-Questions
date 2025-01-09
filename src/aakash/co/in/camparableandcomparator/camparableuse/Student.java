package aakash.co.in.camparableandcomparator.camparableuse;

// Class implements Comparable
class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Define natural ordering based on age
    @Override
    public int compareTo(Student other) {
        return this.age - other.age; // Ascending order
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

