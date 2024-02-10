class calculate{
    public int add(int a, int b){
        int addition = a + b;
        return addition;
    }
}

public class oops {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        calculate calc = new calculate();
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}
