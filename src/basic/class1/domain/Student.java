package basic.class1.domain;

// 타입은 데이터의 종류나 형태를 나타낸다.
// 학생을 나타내는 타입을 만든다고 보면 된다.
// 내가 만든 타입을 만드려는 설계도 자체가 클래스이다.
public class Student {
    String name;
    int age;
    int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Name : " + this.name + " Age : " + this.age + " Grade : " + this.grade;
    }
}
