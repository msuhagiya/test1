public class LearningJava
{
    static int a = 15;
    static int b = 10;
    public static void addition()
    {
        System.out.println(a+b);
    }
    public static void subtraction()
    {
        System.out.println(a-b);
    }

    public static void multiplication()
    {
        System.out.println(a*b);

    }

    public static void division()
    {
        int b = LearningJava.b;
        System.out.println(a/b);

    }

    public static void main(String[] args)
    {
        addition();
        subtraction();
        multiplication();
        division();


    }
}
