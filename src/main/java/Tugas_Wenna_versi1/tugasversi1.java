package Tugas_Wenna_versi1;

import java.util.ArrayList;
import java.util.Scanner;
public class tugasversi1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int bil, starts, ends; //membuat variabel bil, starts, ends, dan count (count untuk tracking bilangan ke-berapa)

        ArrayList<Integer> ganjil = new ArrayList<Integer>(); //membuat arraylist untuk menyimpan data hasil filter bilangan ganjil prima ke dalam variabel ganjil
        ArrayList<Integer> genap = new ArrayList<Integer>(); //membuat arraylist untuk menyimpan data hasil filter bilangan genap prima ke dalam variabel genap

        System.out.println("Menampilkan Deret Bilangan Prima");
        System.out.print("Masukkan rentang awal : "); // melakukan input rentang awal dari bilangan
        starts=input.nextInt();
        System.out.print("Masukkan rentang akhir : "); // melakukan input rentang akhir dari bilangan
        ends=input.nextInt();
        System.out.println("----------------------------------------------");

        System.out.print("Bilangan Prima antara " + starts + " - " + ends + " adalah "); // Print kalimat diluar perulangan bilangan prima
        // perulangan for dari nilai awal pada variabel pertama dan akan berhenti pada variabel akhir
        for (int i=starts; i<=ends; i++){
            bil=0;
            // inisialisasi nilai awal variabel w=1, dgn kondisi jika nilai w<=i maka iterasi akan dijalankan, dan jika nilai dari w >= i maka iterasi akan dihentikan dan dilanjutkan ke proses selanjutnya
            for (int w=1;w<=i;w++){
                // setiap nilai i jika dilakukan operasi modulus pada variabel w menghasilkan sisa pembagian 0, maka pada variabel bil nilainya akan ditambahkan 1.
                if ( i % w == 0 ){
                    bil+=1;
                }
            }
            // apabila nilai bil = 2 maka system akan mencetak nilai i dalam setiap iterasi yang dilakukan.
            if ( bil == 2 ){
                System.out.print(i+" ");

                bil++;
                //melakukan operasi pengambilan bilangan ganjil genap
                if ( i % 2 == 0 ) { //jika i mod 2 sama dengan 0 maka bilangan masuk ke kategori genap, selain itu akan masuk ke kategori ganjil
                    genap.add(i); //hasil akan disimpan pada variabel arraylist yang dibuat
                } else {
                    ganjil.add(i); //hasil akan disimpan pada variabel arraylist yang dibuat
                }
            }
        }
        System.out.println();
        // menampilkan hasil filter bilangan prima ganjil
        System.out.print("Bilangan prima yang ganjil antara "+starts+" - "+ends+" adalah "+ganjil);
        System.out.println();
        // menampilkan hasil filter bilangan prima genap
        System.out.print("Bilangan prima yang genap antara "+starts+" - "+ends+" adalah "+genap);
        System.out.println();

        System.out.println();
        System.out.print("Bilangan prima yang ganjil antara "+starts+" - "+ends+" ada "+ganjil.size()+" bilangan"); // menampilkan jumlah bilangan yang ada di dalam var arraylist ganjil
        System.out.println();
        System.out.print("Bilangan prima yang genap antara "+starts+" - "+ends+" ada "+genap.size()+" bilangan");
    }
}
