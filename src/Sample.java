public class Sample {
    Sample(int a)
    {
        System.out.println("My first constructor");
    }
    Sample(int a, double b)
    {
        System.out.println("My second constructor");
    }
    Sample(int a, double b, char c)
    {
        System.out.println("My third constructor");
    }
    public static void main(String[] args)
    {
        new Sample(10);
        new Sample(15, 1.01);
        new Sample(12, 0.05, 'a');
    }
}
