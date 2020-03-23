import java.util.Stack;

public class stack_2 {
    public static void main(String[] args) {
        static int fibonacci(int n)
        {
            return (n<=2 ? 1 : fibonacci(n-1) + fibonacci(n-2));
        }
        public static void main(String[] args)
        {
            for (int n=1; n<=16; n++)
                System.out.print(fibonacci(n)+", ");
            System.out.println("...");
        }
    }

    private static void fibonacci(int i) {

    }

}
}
