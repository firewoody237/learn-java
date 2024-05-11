package basic.class1;

import basic.class1.domain.Student;

public class UseClass {

    public static void main(String[] args) {
        classUnitUse();

        classArrayUse();

        classArrayUseWithFor();
    }

    private static void classUnitUse() {
        // 클래스를 사용해 실제 메모리에 만든 것이 객체 혹은 인스턴스이다.
        // new를 통해 메모리상에 공간이 확보되고, 이를 접근할 수 있는 참조값을 변수에 저장한다.
        Student student1 = new Student("student1", 15, 90);
        Student student2 = new Student("student2", 18, 95);

        // 객체를 참조하면, 변수에는 실제 주소가 저장되어 있고 그 주소를 따라가서 해당 객체의 요소를 접근한다.
        System.out.println(student1);
        System.out.println(student2);
    }

    private static void classArrayUse() {
        Student[] students = new Student[2];

        // students는 배열의 위치를 참조한다.
        // students의 각 요소는, 각 요소의 위치를 참조한다.
        // 자바에서의 `=`는 그 안에 들어있는 값의 복사를 뜻한다(값이 주소던 값이던 신경쓰지 않음).
        Student student1 = new Student("student1", 15, 90);
        Student student2 = new Student("student2", 18, 95);
        students[0] = student1;
        students[1] = student2;

        System.out.println(students[0]);
        System.out.println(students[1]);
    }

    private static void classArrayUseWithFor() {
        // for 활용
        Student student1 = new Student("student1", 15, 90);
        Student student2 = new Student("student2", 18, 95);
        Student[] students = new Student[]{student1, student2};

        // iter 키워드로 빠르게 생성 가능
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
