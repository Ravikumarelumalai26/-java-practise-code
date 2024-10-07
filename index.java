public class index {
    public static void main(String[] args) {
        mymethod();
        grade(70);
        math(9, 90);
        math(20.0f, 69.09);
        int num = 234;
        float num2 = 456f;
        double num4 = 456.909087;
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num4);
        int num6 = 234;

        float num7 = (float) (num6);
        System.out.println(num7);
        float you = 789.098f;
        int num8 = (int) (you);
        System.out.println(num8);
        int n = 12;
        int g = 56;
        System.out.println(" sum is:" + n + g);

    }

    public static void mymethod() {
        System.out.println("i love you");
        System.out.println("i love world ");
        System.out.println("i love u");
        System.out.println("i love code");

    }

    public static void grade(int mark) {

        if (mark >= 90) {
            System.out.println("your grade is :" + "A");

        } else if (mark >= 80) {
            System.out.println("your grade is :" + "b");
        } else if (mark >= 60) {
            System.out.println("your grade is :" + "c");
        } else {
            System.out.println("your grade is :" + "fail");
        }

    }

    public static void math(int num, double num2) {
        hi = num + num2;

    }

    public static void math(int num, int num5) {
        hello = num + num5;

    }

    public static void math(double num, int num6) {
        double bye = num + num6;

    }

    public static void math(float num, double num7) {
        double oii = num + num7;
        int name = 2;
        switch (name) {
            case 1:
                System.out.println("hi");
                break;
            case 2:
                System.out.println("hello");
                break;
            case 3:
                System.out.println("hi");
                break;
            case 4:
                System.out.println("hi");
                break;

        }
        int words = 9;
        switch (words) {
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
            case 4:
                System.out.println("four");
            case 5:
                System.out.println("five");
            case 9:
                System.out.println(" not found");

        }

    }

}
