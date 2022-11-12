import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("10 / 2 = " + 10/2);
        try {
            System.out.println("10 / 10 = " + 10/10);
            System.out.println("10 / 0 = " + 10/0);
            System.out.println("10 / 1 = " + 10/1);
            //не проверяемое исключение
        }catch (ArithmeticException ae){
            System.out.println("Ошибка. " + ae.getMessage());
        }finally {
            System.out.println("блок finally");
        }
        System.out.println("10 / 5 = " + 10/5);

        Integer[] numbers = new Integer[10];
        System.out.println(Arrays.toString(numbers));
        numbers[9] = 124;
        System.out.println(Arrays.toString(numbers));
        try {
            numbers[10] = 235;
            //не проверяемое исключение
        }catch (ArrayIndexOutOfBoundsException aioe){
            System.out.println("ошибка " + aioe.getMessage());
        }
        System.out.println(Arrays.toString(numbers));

//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            System.out.println("catch");
//        }
        System.out.println("Продолжение кода");

        System.out.println(getAreaRectangle(2,3));
        try {
            System.out.println(getAreaRectangle(2,-3));
        }catch (IllegalArgumentException ie){
            System.out.println(ie.getMessage());
        }
        System.out.println(getAreaRectangle(2,4));

        User user = new User();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите имя для авторизации");
            String name = scanner.next();
            try {
                user.setName(name);
                System.out.println("Успешно. Ваше имя " + user.getName());
            } catch (IllegalNameException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Введите возраст для авторизации");
            Integer age = scanner.nextInt();
            try {
                user.setAge(age);
                System.out.println("Успешно. Ваш возраст " + user.getAge());
            }catch (IllegalAgeException ie){
                System.out.println(ie.getMessage());
            }
        }
    }

    public static Integer getAreaRectangle(Integer a, Integer b){
        if (a <= 0 || b <= 0 ){
            throw new IllegalArgumentException("Ошибка. Значения a и b " +
                    "не должно быть отрицательным. Вы задали " +
                    "a = " + a + " b = " + b);
        }
        return a * b;
    }
}