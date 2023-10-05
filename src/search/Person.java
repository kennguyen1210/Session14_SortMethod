package search;

public class Person implements Comparable<Person>{
    int age;

    @Override
    public int compareTo(Person o) {
        return this.age - o.getAge();
    }

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person : " +this.age + " ";
    }
}
