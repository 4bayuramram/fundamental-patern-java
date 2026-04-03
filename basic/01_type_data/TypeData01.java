/*
 * =====================================
 * FILE: BelajarTipeDataJava.java
 * =====================================
 * Ini adalah program Java sederhana untuk PEMULA.
 * Tujuan: memahami struktur dasar + tipe data.
 */

// "public class" adalah pembungkus utama program Java
// Nama class HARUS sama dengan nama file
public class TypeData01 {

    // "main" adalah titik awal program dijalankan
    // Semua kode di dalam {} akan dieksekusi saat program dijalankan
    public static void main(String[] args) {

        /*
         * =====================================
         * 1. APA ITU PROGRAM JAVA?
         * =====================================
         * Program Java = kumpulan instruksi
         * yang dijalankan dari method main()
         */

        /*
         * =====================================
         * 2. TIPE DATA (VARIABEL)
         * =====================================
         * Variabel = tempat menyimpan data
         * Format: tipeData nama = nilai;
         */

        byte b = 10;        // angka kecil
        short s = 1000;     // angka sedang
        int i = 150000;     // PALING SERING dipakai
        long l = 10000000000L; // angka sangat besar (pakai L)

        float f = 10.5f;   // desimal (harus pakai f)
        double d = 20.99;  // desimal lebih akurat

        char c = 'A';      // 1 karakter (pakai petik satu)
        boolean bool = true; // hanya true / false

        /*
         * =====================================
         * 3. OPERASI DASAR
         * =====================================
         */

        // Aritmatika (matematika)
        int sum = 5 + 10;     // tambah
        int mod = 10 % 3;     // sisa bagi

        // Logika
        boolean logic = (5 > 3) && (2 < 4);

        // Perbandingan
        boolean isEqual = (5 == 5);

        /*
         * =====================================
         * 4. OUTPUT (MENAMPILKAN KE LAYAR)
         * =====================================
         * System.out.println = perintah print ke console
         */

        System.out.println("=== TIPE DATA ===");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        System.out.println("\n=== OPERASI ===");
        System.out.println("sum (5+10): " + sum);
        System.out.println("mod (10%3): " + mod);
        System.out.println("logic: " + logic);
        System.out.println("isEqual: " + isEqual);

        /*
         * =====================================
         * 5. RINGKASAN
         * =====================================
         * - class = wadah program
         * - main() = mulai program
         * - variabel = menyimpan data
         * - println = menampilkan hasil
         */

        /*
        javac basic/01_type_data/TypeData01.java
        java -cp basic/01_type_data TypeData01
        */  
    }
}