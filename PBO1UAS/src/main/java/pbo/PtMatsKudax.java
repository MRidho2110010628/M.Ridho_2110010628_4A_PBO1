//M. Ridho 2110010628
package pbo;
//IO Sederhana
import java.util.Scanner;
//Class
public class PtMatsKudax {

    //atribut dan encaptulation
    public static void main(String[] args) {
        System.out.println("Program Hitung Honor Karyawan");
        System.out.println("PT.MATS KUDAX");
        System.out.println(" ");
        String NamaKaryawan;
        String Golongan;
        String Pendidikan;
        int Jumlah;
        int
        //Array        
        HonorTetap=1000000,TunjanganJabatan=0,TunjanganPendidikan=0;
        int HonorLembur=0,HonorYangDiterima=0;
        //IO Sederhana
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
        //Seleksi
        if ("A".equals(Golongan)){
            TunjanganJabatan=500000;
        }
         if ("B".equals(Golongan)){
            TunjanganJabatan=600000;
        }
         if ("C".equals(Golongan)){
 
              TunjanganJabatan=700000;
        }
         //Perulangan
      System.out.println("Tunjangan Jabatan = "+TunjanganJabatan);
      //Seleksi
      if ("SMU".equals(Pendidikan)){
       TunjanganPendidikan=100000;
        }
      if ("D3".equals(Pendidikan)){
       TunjanganPendidikan=200000;
        }
      if ("S1".equals(Pendidikan)){
       TunjanganPendidikan=300000;
        }
      System.out.println("Tunjangan Pendidikan = "+TunjanganPendidikan);
      if (Jumlah>=8){
      HonorLembur=(Jumlah-8)*50000;
      }
      //Perulangan
     System.out.println("Honor Lembur = "+HonorLembur);
     HonorYangDiterima=HonorTetap+TunjanganPendidikan+TunjanganJabatan+HonorLembur;
     System.out.println("Honor Yang Diterima ="+HonorYangDiterima);
} 
    
}
