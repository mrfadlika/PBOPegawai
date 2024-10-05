//author: Raffi Fadlika
//nim: 42623002

class Mahasiswa{
    String nama;
    int nim;
    String prodi;

    public Mahasiswa(String nama, int nim, String prodi){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    public String deskripsiMahasiswa(){
        return "Mahasiswa bernama " + this.nama+ " dengan NIM " +this.nim+ " sedang belajar di program studi " + this.prodi ;
    }
}

public class ProgramMahasiswa{
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Raffi Fadlika", 42623002, "Teknik Multimedia dan Jaringan");
        Mahasiswa mahasiswa2 = new Mahasiswa("Mayersi Putra", 42623004, "Teknik Multimedia dan Jaringan");

        System.out.println(mahasiswa1.deskripsiMahasiswa());
        System.out.println(mahasiswa2.deskripsiMahasiswa());
    }
}

//Success : Process finished with exit code 0