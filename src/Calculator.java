import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner sca = new Scanner(System.in);
        System.out.println("Калькулятор умеет работать как с арабскими, так и с римскими числами.");
        System.out.println("Калькулятор принимает на вход числа от 1 до 10 включительно, не более.");
        System.out.println("Калькулятор умеет работать только с арабскими или римскими цифрами одновременно");
        System.out.println("Данные передаются в одну строку");
        System.out.println("Введите данные:");
        String zadacha = sca.nextLine();
        zadacha = zadacha.replaceAll("\\s", "");
        String part1;
        String part2;
        String Arabian = ("12345678910");
        String Romanian = ("IIIVIIIX");
        if (zadacha.contains("-")) {
            String[] parts = zadacha.split("-");
            part1 = parts[0];
            part2 = parts[1];
        } else if (zadacha.contains("+")) {
            String[] parts = zadacha.split("[+]");
            part1 = parts[0];
            part2 = parts[1];
        } else if (zadacha.contains("*")) {
            String[] parts = zadacha.split("[*]");
            part1 = parts[0];
            part2 = parts[1];
        } else if (zadacha.contains("/")) {
            String[] parts = zadacha.split("[/]");
            part1 = parts[0];
            part2 = parts[1];
        } else {
            throw new Exception("Введено неверное значение");
        }


        if (Arabian.contains(part1) && Arabian.contains(part2)) {
            Count.countarabian(part1, part2, zadacha);
        }else if (Romanian.contains(part1) && Romanian.contains(part2)) {
            Count.countroman(part1, part2, zadacha);
        }else throw new Exception("Введено неверное значение");
    }
}