class Count {
    public static void countarabian (String part1, String part2, String zadacha) throws Exception{
        String[] Arabian1 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
        int a = 0;
        int b = 0;
        int result = 0;
        for (int i = 0; i < Arabian1.length; i++) {
            String c = Arabian1[i];
            if (c.equals(part1)) {
                a = i;
            }
            if (c.equals(part2)) {
                b = i;
            }
        }

        if (zadacha.contains("-")) {
            result = a - b;
        }
        if (zadacha.contains("+")) {
            result = a + b;
        }
        if (zadacha.contains("*")) {
            result = a * b;
        }
        if (zadacha.contains("/")) {
            result = a / b;
        }
        if (a == 0 || b == 0) {
            throw new Exception("Вы ввели неверное значение");

        } else System.out.println(result);
    }
    public static void countroman(String part1, String part2, String zadacha) throws Exception{
        int a = 0;
        int b = 0;
        int result = 0;
        String[] Romanian1 = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" };
        String[] RomanianFull = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C" };
        for (int i = 0; i < Romanian1.length; i++) {
            String c = Romanian1[i];
            if (c.equals(part1)) {
                a = i;
            }
            if (c.equals(part2)) {
                b = i;
            }
        }
        if (zadacha.contains("-")) {
            result = a - b;
        }
        if (zadacha.contains("+")) {
            result = a + b;
        }
        if (zadacha.contains("*")) {
            result = a * b;
        }
        if (zadacha.contains("/")) {
            result = a / b;
        }
        if (a == 0 || b == 0) {
            throw new Exception("Вы ввели неверное значение");

        } else if (result<=0) {
            throw new Exception("Вы ввели неверное значение");
        }else System.out.println(RomanianFull[result]);
    }
}