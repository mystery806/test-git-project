import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        Lambda tester = new Lambda();
//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//
//        // 使用 Lambda 表达式遍历列表
//        names.forEach(name -> System.out.println(name));    //Lambda正常遍历
//        names.forEach(System.out::println);                 //方法引用
//
//
//        Runnable runnable1 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello World!" + "run1");
//            }
//        };
//        runnable1.run();
//
//        Runnable runnable = () -> System.out.println("Hello world!" + "run2");
//        runnable.run();
//
//
//        // 使用 Lambda 表达式和 Stream API 进行并行计算
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        int sum = numbers.parallelStream().mapToInt(Integer::intValue).sum();
//        System.out.println("sum = " + sum);

        //同一操作的两种写法
        // 类型声明
        MathOperation addition = (int a ,int b) -> a + b;
        MathOperation addition1 = Integer::sum;

        // 不用类型声明
        MathOperation subtraction = (a,b) -> a - b;

        // 大括号中的返回语句
        MathOperation multiplication = (int a,int b) -> {return a * b;};

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        // 不用括号
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // 用括号
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");



    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }

}
