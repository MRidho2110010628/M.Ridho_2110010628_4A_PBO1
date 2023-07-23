# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `PtMatsKudax` adalah contoh dari class.

```bash
public class PtMatsKudax {
    ...
}
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `NamaKaryawan`, `Glongan` dan `Pendidikan` adalah contoh atribut.

```bash
public static void main(String[] args) {
        System.out.println("Program Hitung Honor Karyawan");
        System.out.println("PT.MATS KUDAX");
        System.out.println(" ");
        String NamaKaryawan;
        String Golongan;
        String Pendidikan;
        int Jumlah;
        int
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mahasiswa` dan `MahasiswaDetail`.

```bash
public Mahasiswa(String nama, String npm) {
    this.nama = nama;
    this.npm = npm;
}

public MahasiswaDetail(String nama, String npm) {
    super(nama, npm);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNpm` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setNpm(String npm) {
    this.npm = npm;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNpm`, `getTahunMasuk`, `getFakultas`, `getProdi`, dan `getNoRegistrasi` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getNpm() {
    return npm;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `("Program Hitung Honor Karyawan")` dan `("PT.MATS KUDAX")` .

```bash
public static void main(String[] args) {
        System.out.println("Program Hitung Honor Karyawan");
        System.out.println("PT.MATS KUDAX");
        System.out.println(" ");
        String NamaKaryawan;
        String Golongan;
        String Pendidikan;
        int Jumlah;
        int
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MahasiswaDetail` mewarisi `Mahasiswa` dengan sintaks `extends`.

```bash
public class MahasiswaDetail extends Mahasiswa {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
public String displayInfo(String kelas) {
    return displayInfo() + "\nKelas: " + kelas;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if` dalam method `Golongan` dan seleksi `TunjanganJabatan`.

```bash
if ("A".equals(Golongan)){
            TunjanganJabatan=500000;
        }
         if ("B".equals(Golongan)){
            TunjanganJabatan=600000;
        }
         if ("C".equals(Golongan)){
 
              TunjanganJabatan=700000;
        }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `("Honor Lembur = "+HonorLembur)` untuk meminta input dan menampilkan data.

```bash
System.out.println("Honor Lembur = "+HonorLembur);
     HonorYangDiterima=HonorTetap+TunjanganPendidikan+TunjanganJabatan+HonorLembur;
     System.out.println("Honor Yang Diterima ="+HonorYangDiterima);
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);
        System.out.print("Masukan nama karyawan : ");
        NamaKaryawan = input.nextLine();
        System.out.print("Golongan : ");
        Golongan = input.nextLine();
        System.out.print("Pendidikan(SMU/D3/S1) : ");
        Pendidikan = input.nextLine();
        System.out.print("Jumlah Jam Kerja : ");
        Jumlah = input.nextInt();
        System.out.println("Karyawan yang bernama = "+NamaKaryawan);
        System.out.println("Honor yang diterima");
        System.out.println("Honor Tetap = "+HonorTetap);
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `HonorTetap=1000000,TunjanganJabatan=0,TunjanganPendidikan=0;` adalah contoh penggunaan array.

```bash
HonorTetap=1000000,TunjanganJabatan=0,TunjanganPendidikan=0;
        int HonorLembur=0,HonorYangDiterima=0;
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    -    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    -    |
|  5  | Mutator        |    -    |
|  6  | Accessor       |    -    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    -    |
|  9  | Polymorphism   |    -    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |    -    |
|     | **TOTAL**      | **50** |

## Pembuat

Nama: M. Ridho
NPM: 2110010628
