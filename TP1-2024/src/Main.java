public class Main {
    public static int add(int a, int b) { return a+b;}

    public static int max(int a, int b)
    { return (a>b)?a:b; }

    public static int max(int a, int b, int c)
    { return max(max(a,b),c); }

    public static int gcd(int a, int b)
    {
        if (b==0) return a;
        else return gcd(b, a%b);
    }

    public static void main(String[] args) {
        // add method
        System.out.println(add(4,5));

        // max method
        System.out.println(max(4,5));

        // max method
        System.out.println(max(4,5, 7));
    }
}
