import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataNilai x = new DataNilai();

        // buat objek Scanner untuk input data yang dibutuhkan
        Scanner inputNIM = new Scanner(System.in);
        Scanner inputNama = new Scanner(System.in);
        Scanner inputNilai = new Scanner(System.in);
        Scanner jmlMahasiswa = new Scanner(System.in);

        System.out.print("Berapa Jumlah Mahasiswa Anda : ");
        int jumlahMhs = jmlMahasiswa.nextInt();

        // buat looping untuk menginput data (sesuai jumlah data mahasiswa yang diinput)
        int i = 1;
        while (i > 0 && i <= jumlahMhs) {
            System.out.println("Data ke-"+i);
            System.out.println("----------------------------");
            System.out.print("Masukkan NIM : ");
            long nimMhs = inputNIM.nextLong();

            System.out.print("Masukkan Nama Mahasiswa : ");
            String namaMhs = inputNama.nextLine();

            System.out.print("Masukkan Nilai Mahasiswa : ");
            int nilaiMhs = inputNilai.nextInt();

            // cek grade
            if(nilaiMhs <= 100 && nilaiMhs >= 80) {
                String gradeMhs = "A";
                String statusKl = "Lulus";
                x.tambahData(new Mahasiswa(nimMhs,namaMhs,nilaiMhs,gradeMhs,statusKl));
            } else if(nilaiMhs <= 79 && nilaiMhs >= 70) {
                String gradeMhs = "B";
                String statusKl = "Lulus";
                x.tambahData(new Mahasiswa(nimMhs,namaMhs,nilaiMhs,gradeMhs,statusKl));
            } else if(nilaiMhs <= 69 && nilaiMhs >= 60) {
                String gradeMhs = "C";
                String statusKl = "Lulus";
                x.tambahData(new Mahasiswa(nimMhs,namaMhs,nilaiMhs,gradeMhs,statusKl));
            } else if(nilaiMhs <= 59 && nilaiMhs >= 50) {
                String gradeMhs = "D";
                String statusKl = "Tidak Lulus";
                x.tambahData(new Mahasiswa(nimMhs,namaMhs,nilaiMhs,gradeMhs,statusKl));
            } else if(nilaiMhs < 50 && nilaiMhs >= 0) {
                String gradeMhs = "E";
                String statusKl = "Tidak Lulus";
                x.tambahData(new Mahasiswa(nimMhs,namaMhs,nilaiMhs,gradeMhs,statusKl));
            } else {
                System.out.println("Input nilai anda salah!");
            }

            // tambah space agar tidak mepet antar inputan
            System.out.println("----------------------------\n");
            i++;
        }
        inputNIM.close();
        inputNama.close();
        inputNilai.close();
        jmlMahasiswa.close();

        // tampilkan data
        x.tampilData();
        x.hitungLulus("Lulus");
        x.cekLulus("Lulus");
        x.hitungLulus("Tidak Lulus");
        x.cekLulus("Tidak Lulus");
        x.hitungGrade("A");
        x.cekGrade("A");
        x.hitungGrade("B");
        x.cekGrade("B");
        x.hitungGrade("C");
        x.cekGrade("C");
        x.hitungGrade("D");
        x.cekGrade("D");
        x.hitungGrade("E");
        x.cekGrade("E");
        x.hitungRataRata(jumlahMhs);
        
    }
}
