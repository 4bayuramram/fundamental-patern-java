/*
Materi Java: Control Flow (if, switch)
jalankan file : 
compile : javac basic/05_control_flow/ControlFLow.java
run : java -cp basic/05_control_flow ControlFLow

Dokumentasi Resmi:
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html

Control Flow digunakan untuk menentukan alur eksekusi program
berdasarkan kondisi tertentu.

Dua control flow yang paling sering digunakan:
1. if, else if, else
2. switch

===============================================================
                 BAGIAN 1 - IF STATEMENT
===============================================================

1. IF Statement
Menjalankan kode hanya jika kondisi bernilai true.

Contoh:
if (x > 10) {
    System.out.println("x lebih besar dari 10");
}

2. IF-ELSE Statement
Menjalankan kode alternatif ketika kondisi tidak terpenuhi.

Contoh:
if (x > 10) {
    System.out.println("x besar");
} else {
    System.out.println("x kecil atau sama dengan 10");
}

3. ELSE-IF Statement
Untuk banyak kondisi secara berurutan.

Contoh:
if (nilai >= 90) {
    grade = 'A';
} else if (nilai >= 80) {
    grade = 'B';
} else if (nilai >= 70) {
    grade = 'C';
} else {
    grade = 'D';
}

Aturan penting IF:
- Kondisi harus boolean.
- Gunakan {} untuk keamanan dan keterbacaan.
- Operator logika:
  && (AND)
  || (OR)
  ! (NOT)

===============================================================
                 BAGIAN 2 - SWITCH STATEMENT
===============================================================

switch digunakan untuk memilih satu blok kode
berdasarkan nilai dari sebuah variabel.

switch dapat digunakan pada tipe:
- int
- byte
- short
- char
- enum
- String (sejak Java 7)

Sintaks dasar:
switch (expression) {
    case value1:
        // kode
        break;
    case value2:
        // kode
        break;
    default:
        // jika tidak ada yang cocok
}

Penjelasan:
- expression = nilai yang diuji
- case = nilai yang dibandingkan
- break = menghentikan eksekusi agar tidak jatuh ke case berikutnya
- default = jika tidak ada case yang cocok

Contoh:
String day = "Monday";

switch (day) {
    case "Monday":
        System.out.println("Start of week");
        break;
    case "Friday":
        System.out.println("Almost weekend");
        break;
    default:
        System.out.println("Regular day");
}

===============================================================
           SWITCH FALL-THROUGH (tanpa break)
===============================================================

Jika tidak ada break, eksekusi dilanjutkan ke case berikutnya.

Contoh:
int num = 1;

switch (num) {
    case 1:
        System.out.println("One");
    case 2:
        System.out.println("Two");
    default:
        System.out.println("Other");
}

Output:
One
Two
Other

===============================================================
       SWITCH EXPRESSION (Java 14+ / Final sejak Java 17)
===============================================================

Catatan:
Switch expression modern tidak digunakan dalam file ini
agar kompatibel dengan semua versi Java (Java 8 sampai Java 21).

Contoh switch expression (hanya informasi, tidak dipakai di program):
int day = 3;

String type = switch (day) {
    case 1, 7 -> "Weekend";
    case 2, 3, 4, 5, 6 -> "Weekday";
    default -> "Invalid";
};

===============================================================
                        PROGRAM UTAMA
===============================================================
*/

public class ControlFLow {

    public static void main(String[] args) {

        /*
        Contoh IF Statement
        */
        int score = 85;

        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 80) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C atau bawah");
        }


        /*
        Contoh SWITCH Statement (String)
        */
        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("You have full access");
                break;
            case "user":
                System.out.println("You have limited access");
                break;
            default:
                System.out.println("Unknown role");
        }


        /*
        Contoh SWITCH FALL-THROUGH
        */
        int num = 1;

        switch (num) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            default:
                System.out.println("Other");
        }


        /*
        SWITCH versi kompatibel (tanpa switch expression)
        */
        int day = 1;
        String message;

        switch (day) {
            case 1:
            case 7:
                message = "Weekend";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                message = "Weekday";
                break;
            default:
                message = "Invalid day";
        }

        System.out.println(message);
    }
}


/*
===============================================================
                  RINGKASAN CONTROL FLOW
===============================================================

1. IF / ELSE IF / ELSE
- Untuk kondisi boolean.
- Cocok untuk logika yang kompleks.

2. SWITCH
- Untuk pemilihan berdasarkan nilai tunggal.
- Cocok jika memiliki banyak pilihan case.

3. FALL-THROUGH
- Terjadi jika tidak ada break.

4. SWITCH EXPRESSION (INFORMASI)
- Lebih modern dan singkat.
- Hanya tersedia mulai Java 14/17.
- Tidak dipakai dalam file ini agar kompatibel.

Control Flow adalah dasar dari semua pengambilan keputusan
di dalam pemrograman Java.
*/