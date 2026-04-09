/*
File: Method01.java
Materi Java: Methods (Metode Lengkap)

/*
Penjelasan dasar tentang method di Java

Method adalah blok kode untuk melakukan tugas tertentu.
Method membantu membuat program lebih modular, mudah dibaca, dan mudah dirawat.

Setiap method memiliki:
1. Tipe kembalian (return type) — void jika tidak mengembalikan nilai
2. Nama method
3. Parameter (opsional)
4. Badan method (kode di dalam kurung kurawal)
5. Access modifier (public, private, protected, default)
*/

/*
File ini menjelaskan:
1. Method tanpa return (void)
2. Method dengan return value
3. Method dengan parameter
4. Method Overloading
5. Static Method
6. Access Modifier
7. Rekursif
8. Parameter variabel (varargs)
9. Aturan penamaan method
*/

/*
jalankan file :
compile :javac -encoding UTF-8 basic/08_method/Method01.java
run : java -cp basic/08_method Method01 
*/


public class Method01 {

    // 1. Method tanpa return (void)
    void greet() {
        System.out.println("Hello, welcome!");
    }

    // 2. Method dengan return value
    int add(int x, int y) {
        return x + y;
    }

    // 3. Method Overloading
    int add(int x, int y, int z) {
        return x + y + z;
    }

    double add(double a, double b) { // Overloading tipe data berbeda
        return a + b;
    }

    // 4. Static Method
    static void staticGreet() {
        System.out.println("Hello from static method!");
    }

    // 5. Private Method
    private void secretMessage() {
        System.out.println("This is a private message.");
    }

    // 6. Method Rekursif (menghitung faktorial)
    int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // 7. Method dengan parameter variabel (varargs)
    int sumAll(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // 8. Method dengan access modifier berbeda
    public void publicMethod() {
        System.out.println("This is public method.");
    }

    protected void protectedMethod() {
        System.out.println("This is protected method.");
    }

    void defaultMethod() {
        System.out.println("This is default method (package-private).");
    }

    /*
    Method utama program Java
    */
    public static void main(String[] args) {

        // Membuat object dari class Method01
        Method01 example = new Method01();

        // Memanggil method tanpa return
        example.greet();

        // Memanggil method dengan return value
        int result = example.add(10, 20);
        System.out.println("Sum 2 numbers: " + result);

        // Memanggil method overloading
        int result3 = example.add(5, 10, 15);
        System.out.println("Sum 3 numbers: " + result3);

        double resultDouble = example.add(2.5, 3.5);
        System.out.println("Sum double numbers: " + resultDouble);

        // Memanggil static method
        Method01.staticGreet();

        // Memanggil private method dari dalam class
        example.secretMessage();

        // Memanggil method rekursif
        int fact = example.factorial(5);
        System.out.println("Factorial of 5: " + fact);

        // Memanggil method dengan varargs
        int sumVarargs = example.sumAll(1, 2, 3, 4, 5);
        System.out.println("Sum of all numbers: " + sumVarargs);

        // Memanggil method dengan access modifier berbeda
        example.publicMethod();
        example.protectedMethod();
        example.defaultMethod();
    }
}

/*
Aturan Penamaan Method di Java

1. Case Sensitive
greet berbeda dengan Greet

2. Harus diawali huruf
Contoh benar:
calculateSum
printMessage

3. Gunakan camelCase jika lebih dari satu kata
Contoh:
calculateTotal
printUserMessage

4. Tidak boleh menggunakan keyword Java
Contoh salah:
void class() {...}

5. Method biasanya menggunakan kata kerja
Contoh:
sendData()
calculateInterest()
displayResult()
*/