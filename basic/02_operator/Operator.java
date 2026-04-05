/*
Expression = kode yang menghasilkan nilai
Contoh: 3 + 4 hasilnya 7

Jenis expression:
1. Assignment  menyimpan nilai  x = 7
2. Evaluation  menghitung nilai  3 + 4

Operator = simbol untuk melakukan operasi

Contoh operator Java:

Assignment
= += -= *= /= %=

Arithmetic
+ - * / %

Comparison
== != > < >= <=

Logical
&& || !

Bitwise
& | ^ ~ << >> >>>

Unary
++ --

Ternary
(kondisi) ? nilai1 : nilai2

Relational
instanceof

Special
new, this

Operator precedence
Contoh:
1 + 2 * 3 = 7
Gunakan () untuk mengubah urutan

Jenis operator:
Binary  a + b
Unary  x++
Ternary  kondisi ? a : b

Intinya:
Expression menghasilkan nilai
Operator membantu membuat expression
*/

public class Operator{

    public static void main(String[] args) {

        // Expression
        int hasil = 3 + 4;
        // di java harus disimpan hasilnya 

        int x = 7;

        // Arithmetic
        int a = 5;
        int b = 2;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println((double) a / b);
        System.out.println(a % b);

        // Comparison
        System.out.println(5 == 5);
        System.out.println(5 != 3);
        System.out.println(5 > 3);

        // Logical
        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(!true);

        // Unary
        x++;
        System.out.println(x);

        // Ternary
        int umur = 20;
        String status = umur >= 18 ? "dewasa" : "anak";
        System.out.println(status);

        // Assignment
        int angka = 10;
        angka += 5;
        angka -= 3;
        angka *= 2;
        angka /= 4;

        System.out.println(angka);

        // Bitwise
        System.out.println(5 & 3);
        System.out.println(5 | 3);

        // Relational
        String text = "hello";
        System.out.println(text instanceof String);

        // Special operator
        Object obj = new Object();
    }
}