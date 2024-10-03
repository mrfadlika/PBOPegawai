// Kelas Pegawai
public class Pegawai {
    private int id;
    private String nama;
    private String jenisKelamin;
    private String jabatan;
    private double gaji;

    public Pegawai(int id, String nama, String jenisKelamin, String jabatan, double gaji) {
        this.id = id;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public String getDetails() {
        return "ID: " + id + "\nNama: " + nama + "\nJenis Kelamin: " + jenisKelamin +
                "\nJabatan: " + jabatan + "\nGaji: Rp" + gaji;
    }

    public double hitungGaji() {
        return this.gaji;
    }

    public void updateJabatan(String jabatanBaru) {
        this.jabatan = jabatanBaru;
        System.out.println("\nJabatan diperbarui menjadi: " + jabatanBaru);
    }

    public void updateGaji(double gajiBaru) {
        this.gaji = gajiBaru;
        System.out.println("Gaji diperbarui menjadi: Rp" + gajiBaru);
    }

    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai(101, "Andi", "Laki-laki", "Manajer", 5000000);

        System.out.println(pegawai1.getDetails());

        pegawai1.updateJabatan("Direktur");
        pegawai1.updateGaji(7500000);

        System.out.println("\nSetelah diperbarui:");
        System.out.println(pegawai1.getDetails());
    }
}
