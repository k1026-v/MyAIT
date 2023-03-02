import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    public static ArrayList<Integer> main(String[] args) {
        System.out.println("Перевод из 10-й системы счисленния в 2-ю");
        boolean keyExit = true;
        while (keyExit) {
            Scanner sc = new Scanner(System.in); // инициализация сканера


            System.out.println("Введите положительное целое число: "); // приглашение пользователю
            int num = 0; // переменная для десятичного числа
            boolean wrong_input = false; // переменная для ошибочного ввода
            int division = 1; // результат от целочисленного деления
            int rest = 0; // остаток от целочисленного деления

            // Проверка что дают результаты применения целочисленного деления

            // int a = 111;
            // int b = 2;
            // int с = a / b;
            // int d = a % b;
            // System.out.println("111 / 2 = " + с);
            // System.out.println("111 % 2 = " + d);

            ArrayList<Integer> binary_num = new ArrayList<>(); // массив для накопления цифр двоичного числа

            // ввод числа для перевода в двоичную систему
            try {
                num = sc.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Нельзя вводить символы!");
                wrong_input = true;
            }

            System.out.println(num); // вывод введенного числа

            int i = 0; // счетчик количества цифр

            // цикл перевода числа в двоичную систему
            /*while (num > 0) {
                rest = num % 2; // остаток от деления на 2 - это первая цифра
                // System.out.println(rest);
                binary_num.add(i, String.valueOf(rest)); // записали цифру в масив
                num = num / 2; // получили частное от деления числа на 2
                // System.out.println(num);
                i++; // увеличили счетчик символов цифр на 1
            }*/

            binary_num=returnArray(num);


            System.out.println("Размер массива: " + binary_num.size());
            System.out.println("Массив полученных цифр: " + binary_num);

            // вывод полученного двоичного числа
            System.out.println("Двоичное число : ");
            /*for (int j = binary_num.size() - 1; j >= 0; j--) { // цикл идет от конца массива к его началу
                System.out.print(binary_num.get(j));
            }*/
            PrintBinaryNumber(binary_num);
            System.out.println();
            System.out.println("Хотите продолжить? y/n");
            Scanner scan = new Scanner(System.in);
            char ch = scan.next().toLowerCase().charAt(0);
            if (ch == 'n') break;
            else continue;
        }
        return null;
    }


    public static ArrayList<Integer> returnArray(int num) {
        ArrayList<Integer> retArray = new ArrayList<>();
        int rest;
        int i = 0;
        // цикл перевода числа в двоичную систему
        while (num > 0) {
            rest = num % 2; // остаток от деления на 2 - это первая цифра
            // System.out.println(rest);
            retArray.set(i, rest); // записали цифру в масив
            num = num / 2; // получили частное от деления числа на 2
            // System.out.println(num);
            i++; // увеличили счетчик символов цифр на 1
        }
        return retArray;
    }

    public static void PrintBinaryNumber(ArrayList<Integer> arrayList) {
        for (int j = arrayList.size() - 1; j >= 0; j--) {
            System.out.print(arrayList.get(j));
        }
    }
}

    /* static void While(boolean b) {
        While(true)

            Scanner scanner = new Scanner(System.in);
            System.out.println("Хотите продолжть? Введите y");
            char ch = scanner.next().toLowerCase().charAt(0);
            if (ch == 'y') {
                break;
            } else continue;
        }*/





