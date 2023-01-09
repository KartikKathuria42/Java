public class MethodOverLoad {
    // Function with same name and different parameters
    public static int add(int a){
        return a;
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(add(5));
        System.out.println(add(5, 7));
        System.out.println(add(2,4,6));
    }
}
