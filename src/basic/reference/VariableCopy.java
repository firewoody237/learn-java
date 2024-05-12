package basic.reference;

import basic.reference.domain.Data;

public class VariableCopy {

    public static void main(String[] args) {
        primitiveCopy();

        referenceCopy();

        primitiveMethodParameter();

        referenceMethodParameter();
    }

    private static void primitiveCopy() {
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 30;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void referenceCopy() {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA = " + dataA);
        System.out.println("dataB = " + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        dataA.value = 20;
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        dataB.value = 30;
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
    }

    private static void primitiveMethodParameter() {
        int a = 10;
        System.out.println("a = " + a);
        changePrimitive(a);
        // 복사한 값을 전달하기 때문에, 그대로 10이 출력된다.
        System.out.println("a = " + a);
    }

    private static void changePrimitive(int a) {
        a = 20;
    }

    private static void referenceMethodParameter() {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("dataA.value = " + dataA.value);
        changeReference(dataA);
        // 복사한 값을 전달하기 때문에, 그대로 10이 출력된다.
        System.out.println("dataA.value = " + dataA.value);
    }

    private static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
