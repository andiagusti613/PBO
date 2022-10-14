public class Mahasiswa {
    // atribut
    long nimMahasiswa;
    String namaMahasiswa;
    int nilaiMahasiswa;
    String gradeNilai;
    String statusMhs;

    // konstruktor
    Mahasiswa(long nim, String nama, int nilai, String grade, String status) {
        this.nimMahasiswa = nim;
        this.namaMahasiswa = nama;
        this.nilaiMahasiswa = nilai;
        this.gradeNilai = grade;
        this.statusMhs = status;
    }

    // method untuk menampilkan data mahasiswa
    void cetak() {
        System.out.println("NIM\t: "+this.nimMahasiswa);
        System.out.println("NAMA\t: "+this.namaMahasiswa);
        System.out.println("NILAI\t: "+this.nilaiMahasiswa);
        System.out.println("GRADE\t: "+this.gradeNilai);
        System.out.println("------------------------------");
    }

    // method untuk menampilkan nama-nama yang lulus atau tidak lulus
    void cetakLulus() {
        System.out.print(this.namaMahasiswa);
        System.out.print(", ");
    }

    // method untuk menampilkan nama-nama sesuai grade nilai
    void cetakGrade() {
        System.out.print(this.namaMahasiswa);
        System.out.print(", ");
    }

    // method untuk menghitung rata-rata
    double ambilNilai(){
        double sum = this.nilaiMahasiswa;
        return sum;
    }

    // method untuk mengambil status
    String ambilStatus(){
        String stat = this.statusMhs;
        return stat;
    }

    // method untuk mengambil grade
    String ambilGrade(){
        String stat = this.gradeNilai;
        return stat;
    }
}