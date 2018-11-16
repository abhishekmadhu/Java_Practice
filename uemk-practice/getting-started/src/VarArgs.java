class A {
    static int max(int...varargs){
        int maximum = Integer.MIN_VALUE;
        for (int arg: varargs){
            if (arg>maximum){
                maximum = arg;
            }
        }
        return maximum;
    }
}

public class VarArgs{
    public static void main(String... varargs){
        System.out.println("Trying functions with variable arguments");
        A a = new A();
        System.out.println(a.max(1,2,3,4,5,6,7,23,23,234,45,32,234,2331,11,23,12,34));
    }
}