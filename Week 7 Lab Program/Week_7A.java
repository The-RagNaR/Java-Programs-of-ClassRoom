// Java program to implement interface using lambda expression
interface A1
{
    public void show(String S);
}


public class Week_7A {

    public static void main(String[] args) {
        A1 obj = (S) -> System.out.println(S+ " Yes Papa");
        obj.show("Jonny Jonny");
    }
}