import java.util.ArrayList;

public class DataNilai {
    // membuat atribut untuk menyimpan data mahasiswa
    ArrayList<Mahasiswa> dataMahasiswa = new ArrayList<Mahasiswa>();

    // menambah data mahasiswa
    void tambahData(Mahasiswa data) {
        this.dataMahasiswa.add(data);
    }

    // tampilkan nama mahasiswa yang lulus
    void cekLulus(String status){
        boolean ditemukan = false;
        int index = -1;
        for(int i=0; i<this.dataMahasiswa.size(); i++){
            if (this.dataMahasiswa.get(i).statusMhs == status){
                index = i;
                ditemukan = true;
                if(ditemukan == true) {
                    this.dataMahasiswa.get(index).cetakLulus();
                }
            }
        }
         
    }

    // tampilkan nama mahasiswa berdasarkan grade nilai
    void cekGrade(String grade){
        boolean ditemukan = false;
        int index = -1;
        for(int i=0; i<this.dataMahasiswa.size(); i++){
            if (this.dataMahasiswa.get(i).gradeNilai == grade){
                index = i;
                ditemukan = true;
                if(ditemukan == true) {
                    this.dataMahasiswa.get(index).cetakGrade();
                }
            }
        }
         
    }

    // hitung rata-rata
    void hitungRataRata(int mhs){
        double sum = 0;
        int index = -1;
        for(int i=0; i<this.dataMahasiswa.size(); i++){
            index = i;
            sum += this.dataMahasiswa.get(index).ambilNilai();
        }
        System.out.printf("\nNilai rata-rata : %.2f %n", sum/mhs);
    }

    // hitung jumlah yang lulus
    void hitungLulus(String status){
        ArrayList<String> Statt = new ArrayList<String>();
        System.out.print("\nMahasiswa yang "+status+" : ");
        int index = -1;
        for(int i=0; i<this.dataMahasiswa.size(); i++){
            if (this.dataMahasiswa.get(i).statusMhs == status){
                index = 1;
                String sum = this.dataMahasiswa.get(index).ambilStatus();
                Statt.add(sum);
            }}
        if(Statt.size() != 0){
            System.out.print(Statt.size()+" orang yaitu ");
        } else {
            System.out.print(Statt.size()+" orang");
        }

    }

    // hitung jumlah mhs berdasarkan grade nilai
    void hitungGrade(String grade){
        ArrayList<String> Statt = new ArrayList<String>();
        System.out.print("\nMahasiswa yang mendapatkan nilai "+grade+" : ");
        int index = -1;
        for(int i=0; i<this.dataMahasiswa.size(); i++){
            if (this.dataMahasiswa.get(i).gradeNilai == grade){
                index = 1;
                String sum = this.dataMahasiswa.get(index).ambilGrade();
                Statt.add(sum);
            }}
        
        if(Statt.size() != 0){
            System.out.print(Statt.size()+" orang yaitu ");
        } else {
            System.out.print(Statt.size()+" orang");
        }
        
    }

    // menampilkan data mahasiswa
    void tampilData() {
        System.out.println("==============================");
        System.out.println("        DATA MAHASISWA        ");
        System.out.println("==============================");
        for (Mahasiswa item: this.dataMahasiswa) {
            item.cetak();
        }
        System.out.println("Jumlah Mahasiswa : "+this.dataMahasiswa.size());
    }
}
