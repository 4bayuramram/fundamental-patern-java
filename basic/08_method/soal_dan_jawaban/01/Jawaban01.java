/*
File: Jawaban01.java
Jawaban lengkap 10 soal Method Java untuk pemula

File ini memberikan:
- Jawaban kode lengkap untuk setiap soal
- Penjelasan sintaks setiap method dan cara menjawab
- Contoh output yang akan muncul di terminal
- Kesimpulan di akhir

Tujuan: Membantu pemula memahami konsep method di Java, penggunaan return, parameter, static, private, overloading, varargs, rekursif, dan access modifier.
*/

public class Jawaban01 {

    /*
    Soal 1:
    Membuat method greet yang menampilkan "Hello World!".
    Penjelasan:
    - void: tipe kembalian kosong karena tidak mengembalikan nilai
    - System.out.println(): untuk menampilkan teks di terminal
    - greet(): nama method, tanpa parameter
    */
    void greet() {
        System.out.println("Hello World!");
    }

    /*
    Soal 2:
    Membuat method add yang menerima 2 parameter int dan mengembalikan hasil penjumlahan.
    Penjelasan:
    - int: tipe kembalian method
    - (int a, int b): parameter input untuk method
    - return a + b: mengembalikan hasil penjumlahan
    */
    int add(int a, int b) {
        return a + b;
    }

    /*
    Soal 3:
    Method overloading add, menerima 3 parameter int
    Penjelasan:
    - Method overloading: membuat method dengan nama sama tapi parameter berbeda
    - return a + b + c: hasil penjumlahan tiga angka
    */
    int add(int a, int b, int c) {
        return a + b + c;
    }

    /*
    Soal 4:
    Static method staticGreet
    Penjelasan:
    - static: bisa dipanggil tanpa membuat object
    - void: tidak mengembalikan nilai
    - System.out.println(): menampilkan teks
    */
    static void staticGreet() {
        System.out.println("Hello from static method!");
    }

    /*
    Soal 5:
    Private method secretMessage
    Penjelasan:
    - private: hanya bisa diakses dalam class yang sama
    - void: tidak mengembalikan nilai
    */
    private void secretMessage() {
        System.out.println("This is a secret.");
    }

    /*
    Soal 6:
    Method rekursif factorial
    Penjelasan:
    - int factorial(int n): menerima satu parameter int
    - Rekursif: method memanggil dirinya sendiri
    - Base case n <= 1: berhenti rekursi dan mengembalikan 1
    - return n * factorial(n - 1): menghitung faktorial
    */
    int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    /*
    Soal 7:
    Method dengan parameter variabel (varargs)
    Penjelasan:
    - int... numbers: bisa menerima 0 atau lebih angka
    - for-each loop: menjumlahkan semua angka
    */
    int sumAll(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    /*
    Soal 8:
    Membuat object MethodExercise (di sini menggunakan class ini sendiri), memanggil greet, add, factorial
    Penjelasan:
    - Membuat object: new Jawaban01()
    - Memanggil method: object.method()
    - Menampilkan hasil: System.out.println()
    */

    /*
    Soal 9:
    Method dengan access modifier berbeda
    Penjelasan:
    - public: bisa diakses dari mana saja
    - protected: bisa diakses dari package yang sama dan subclass
    - default (tanpa modifier): package-private
    */
    public void publicMethod() {
        System.out.println("Public method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void defaultMethod() {
        System.out.println("Default method (package-private)");
    }

    /*
    Soal 10:
    Program lengkap yang memanggil semua method di atas
    Penjelasan:
    - Semua method dipanggil dari main
    - Output sesuai dengan instruksi soal
    */
    public static void main(String[] args) {
        // Membuat object untuk method non-static
        Jawaban01 example = new Jawaban01();

        System.out.println("=== Soal 1 ===");
        example.greet();
        /* Output:
        Hello World!
        */

        System.out.println("\n=== Soal 2 ===");
        int sum2 = example.add(5, 10);
        System.out.println("5 + 10 = " + sum2);
        /* Output:
        5 + 10 = 15
        */

        System.out.println("\n=== Soal 3 ===");
        int sum3 = example.add(1, 2, 3);
        System.out.println("1 + 2 + 3 = " + sum3);
        /* Output:
        1 + 2 + 3 = 6
        */

        System.out.println("\n=== Soal 4 ===");
        staticGreet();
        /* Output:
        Hello from static method!
        */

        System.out.println("\n=== Soal 5 ===");
        example.secretMessage();
        /* Output:
        This is a secret.
        */

        System.out.println("\n=== Soal 6 ===");
        int fact5 = example.factorial(5);
        System.out.println("Factorial of 5 = " + fact5);
        /* Output:
        Factorial of 5 = 120
        */

        System.out.println("\n=== Soal 7 ===");
        int sumVar = example.sumAll(1, 2, 3, 4, 5);
        System.out.println("SumAll 1,2,3,4,5 = " + sumVar);
        /* Output:
        SumAll 1,2,3,4,5 = 15
        */

        System.out.println("\n=== Soal 9 ===");
        example.publicMethod();
        example.protectedMethod();
        example.defaultMethod();
        /* Output:
        Public method
        Protected method
        Default method (package-private)
        */

        System.out.println("\n=== Kesimpulan ===");
        /*
        Kesimpulan:
        - Semua 10 soal berhasil dijawab
        - Pemula belajar:
            1. Membuat method void dan return
            2. Menggunakan parameter biasa dan varargs
            3. Overloading method
            4. Static method
            5. Private, public, protected, default
            6. Rekursif (faktorial)
            7. Memanggil method dengan object dan static
        - Output sesuai yang diharapkan di terminal
        */
    }
}