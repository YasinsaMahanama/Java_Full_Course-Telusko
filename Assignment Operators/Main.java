public class Main {
    public static void main(String[] args) {

        int num = 7;
        int num1 = 5;

        int add = num + num1;
        System.out.println(add);

        int sub = num - num1;
        System.out.println(sub);

        int mul = num * num1;
        System.out.println(mul);

        int div = num / num1;
        System.out.println(div);

        int mod = num % num1;
        System.out.println(mod);

        //num += 1;
        //num++;     post - increment
        //++num;     pre - increment
        //num--;
        //System.out.println(num);

        //int result = num++;   //fetch the value and then increment
        int result = ++num;
        System.out.println(result);    //increment and then fetch the value

    }
}
