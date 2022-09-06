public class Hello
{
    public static void main(String[] args)
    {
        System.out.println("Hello world");
        String helloWorld[] = {"H","e","l","l","o"};
        for(int i = 0; i<helloWorld.length; i++) {
            String str = helloWorld[i];
            System.out.println(str);
        }
    }
}