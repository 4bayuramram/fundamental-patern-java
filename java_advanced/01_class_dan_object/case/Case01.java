/*
====================================================================
FILE: Case01.java
MATERI: Object & Class (Case Web Developer)
====================================================================

File ini berisi jawaban dari 5 soal latihan:

SETIAP SOAL MEMILIKI:
✔ Penjelasan konsep
✔ Penjelasan syntax
✔ Pola cara berpikir
✔ Contoh output terminal

TUJUAN:
- Membantu pemula memahami OOP dari kasus nyata web developer
- Tidak hanya kode, tapi juga cara berpikir

====================================================================
*/

import java.util.Scanner;

/*
====================================================================
SOAL 1: USER REGISTRATION
====================================================================

KONSEP:
User dalam web biasanya punya data akun

PENJELASAN:
- Class = blueprint user
- Object = user nyata

POLA:
1. Buat class
2. Tambahkan atribut
3. Buat object
4. Isi data
5. Tampilkan

====================================================================
*/
class User {
    String username;
    String email;
}

/*
====================================================================
SOAL 2: LOGIN SYSTEM
====================================================================

KONSEP:
Login memerlukan validasi username & password

PENJELASAN:
- if digunakan untuk logika kondisi
- Scanner untuk input user

====================================================================
*/
class Login {
    String username;
    String password;

    void cekLogin() {
        if (username.equals("admin") && password.equals("123")) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }
    }
}

/*
====================================================================
SOAL 3: PRODUCT DATA
====================================================================

KONSEP:
E-commerce menampilkan produk

====================================================================
*/
class Product {
    String namaProduk;
    int harga;

    void tampilkanProduk() {
        System.out.println("Produk: " + namaProduk);
        System.out.println("Harga : " + harga);
    }
}

/*
====================================================================
SOAL 4: CART TOTAL
====================================================================

KONSEP:
Keranjang belanja menghitung total harga

====================================================================
*/
class Cart {
    String namaProduk;
    int harga;
    int jumlah;

    int hitungTotal() {
        return harga * jumlah;
    }
}

/*
====================================================================
SOAL 5: MEMBER STATUS
====================================================================

KONSEP:
Sistem membership berdasarkan total belanja

====================================================================
*/
class Member {
    String nama;
    int totalBelanja;

    void cekStatus() {
        if (totalBelanja >= 1000000) {
            System.out.println("Member Premium");
        } else {
            System.out.println("Member Biasa");
        }
    }
}

/*
====================================================================
CLASS UTAMA
====================================================================
*/
public class Case01 {

    public static void main(String[] args) {

        System.out.println("=== CASE STUDY JAVA OOP ===\n");

        /*
        ============================================================
        SOAL 1: USER REGISTRATION
        ============================================================
        */
        System.out.println("SOAL 1 - USER REGISTRATION");

        User user = new User();
        user.username = "john_doe";
        user.email = "john@email.com";

        System.out.println("Username: " + user.username);
        System.out.println("Email   : " + user.email);

        /*
        OUTPUT:
        Username: john_doe
        Email   : john@email.com
        */

        /*
        ============================================================
        SOAL 2: LOGIN SYSTEM
        ============================================================
        */
        System.out.println("\nSOAL 2 - LOGIN");

        Scanner scanner = new Scanner(System.in);

        Login login = new Login();

        System.out.print("Username: ");
        login.username = scanner.nextLine();

        System.out.print("Password: ");
        login.password = scanner.nextLine();

        login.cekLogin();

        /*
        CONTOH OUTPUT:
        Username: admin
        Password: 123
        Login berhasil
        */

        /*
        ============================================================
        SOAL 3: PRODUCT DATA
        ============================================================
        */
        System.out.println("\nSOAL 3 - PRODUCT");

        Product p1 = new Product();
        p1.namaProduk = "Laptop";
        p1.harga = 8000000;

        Product p2 = new Product();
        p2.namaProduk = "Mouse";
        p2.harga = 150000;

        p1.tampilkanProduk();
        p2.tampilkanProduk();

        /*
        OUTPUT:
        Produk: Laptop
        Harga : 8000000
        Produk: Mouse
        Harga : 150000
        */

        /*
        ============================================================
        SOAL 4: CART TOTAL
        ============================================================
        */
        System.out.println("\nSOAL 4 - CART");

        Cart cart = new Cart();
        cart.namaProduk = "Keyboard";
        cart.harga = 300000;
        cart.jumlah = 2;

        int total = cart.hitungTotal();

        System.out.println("Produk : " + cart.namaProduk);
        System.out.println("Total  : " + total);

        /*
        OUTPUT:
        Produk : Keyboard
        Total  : 600000
        */

        /*
        ============================================================
        SOAL 5: MEMBER STATUS
        ============================================================
        */
        System.out.println("\nSOAL 5 - MEMBER");

        Member member = new Member();

        System.out.print("Nama: ");
        member.nama = scanner.nextLine();

        System.out.print("Total Belanja: ");
        member.totalBelanja = scanner.nextInt();

        member.cekStatus();

        /*
        CONTOH OUTPUT:
        Nama: Andi
        Total Belanja: 1500000
        Member Premium
        */

        scanner.close();

        /*
        ============================================================
        KESIMPULAN
        ============================================================

        Dari case ini kita belajar:

        1. Class digunakan sebagai blueprint data sistem web
        2. Object digunakan untuk membuat data nyata (user, produk)
        3. Method digunakan untuk logika bisnis (login, total, status)
        4. Scanner digunakan untuk input user
        5. if digunakan untuk validasi sistem

        POLA WEB DEVELOPER:
        - Data → Class
        - User/Produk → Object
        - Proses → Method
        - Validasi → if/else

        Jika kamu paham file ini:
        → kamu sudah masuk ke dasar cara kerja backend web 👍

        ============================================================
        */
    }
}