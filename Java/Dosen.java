public class Dosen {
    private String nama;
    private String nip;

    public Dosen(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    public String getNama() { return nama; }
    public String getNip() { return nip; }

    public Tugas buatTugas(String judul, String deskripsi, String deadline, String kategori) {
        return new Tugas(judul, deskripsi, deadline, kategori, nama);
    }
}
