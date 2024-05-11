package basic.class1;

public class WhyClassNeeds {

    public static void main(String[] args) {

        // 아래와 같은 코드의 경우, 학생을 추가하려면 많은 코드가 필요 해 진다.
        String student1Name = "Student1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "Student2";
        int student2Age = 18;
        int student2Grade = 95;

        System.out.println("Name : " + student1Name + " Age : " + student1Age + " Grade : " + student1Grade);
        System.out.println("Name : " + student2Name + " Age : " + student2Age + " Grade : " + student2Grade);

        // 그렇기에 1차적으로 배열을 사용해 코드를 줄인다.
        // 하지만 한 명의 데이터가 여러 배열에 쪼개 나누어져 있다.
        // 배열에 관리 위치가 모두 다르기 때문에 수정에 대한 누락이 발생할 수 있다.
        // 사람이 관리하기 좋은 방식이 아니다. 정보가 집합되지 않는다.
        String[] studentNames = {"Student1", "Student2"};
        int[] studentAges = {15, 18};
        int[] studentGrades = {90, 95};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Name : " + studentNames[i] + " Age : " + studentAges[i] + " Grade : " + studentGrades[i]);
        }
    }
}
