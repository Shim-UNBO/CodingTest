public class Main {
    public static void main(String[] args) {
        for (int num = 1000; num <= 9999; num++) {
            if (isSingihanNumber(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isSingihanNumber(int num) {
        int sum10 = digitSum(Integer.toString(num, 10));
        int sum12 = digitSum(Integer.toString(num, 12));
        int sum16 = digitSum(Integer.toString(num, 16));

        return sum10 == sum12 && sum10 == sum16;
    }

    public static int digitSum(String number) {
        int sum = 0;
        for (char ch : number.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += ch - '0';
            } else {
                sum += ch - 'a' + 10;
            }
        }
        return sum;
    }
}
