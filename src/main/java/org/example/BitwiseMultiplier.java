package org.example;

public class BitwiseMultiplier {

    /**
     * Реализуйте алгоритм умножения двух натуральных чисел в бинарном формате.
     * Разрешается использовать только логические (битовые) операции. Ошибки можно
     * игнорировать. Произведение выведите в поток стандартного вывода методом
     * {@link java.io.PrintStream#print(long)} объекта {@link java.lang.System#out}.
     *
     * @param args массив с множителями в текстовом представлении.
     */
    public static void main(String[] args) {
        long p = Long.parseLong(args[0]);
        long q = Long.parseLong(args[1]);

        System.out.println(multiply(p, q));
        System.out.println(sum(p, q));
    }

    static long multiply(long a, long b) {
        long res = 0;
        long absA = Math.abs(a), absB = Math.abs(b);
        boolean neg = Math.min(a, b) < 0 && Math.max(a, b) >= 0;

        while (absB > 0) {
            if ((absB & 1) == 1) res = sum(res, absA);
            absB >>= 1;
            absA <<= 1;
        }

        if (neg) {
            res = sum(~(res), 1);
        }

        return res;
    }

    /**
     * Реализуйте вспомогательную функцию для сложения двух натуральных чисел в
     * бинарном формате. Разрешается использовать только логические (битовые)
     * операции.
     *
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return {@code a + b}
     */
    static long sum(long a, long b) {
        long carry;
        while (b != 0) {
            carry = a & b;
            a ^= b;
            b = carry << 1;
        }
        return a;
    }
}
