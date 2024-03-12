class ClassA
{
    public static void print()
    {
        System.out.println("Hello World from ClassA");
    }
}

class ClassB extends ClassA
{
    @Override
    public static void print()
    {   
        System.out.println("Hello World from ClassB");
    }
}

public class Main
{
    int count = 0;
    public Main()
    {
        count++;
    }
    public static void main(String[] args)
    {
        ClassA classA = new ClassB();
        classA.print();
        Main main = new Main();
        Main main2 = new Main();
        System.out.println(main.count);
        System.out.println(main2.count);
    }
}