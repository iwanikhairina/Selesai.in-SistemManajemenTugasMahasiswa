public class Tugas {
    private String judul;
    private String deskripsi;
    private String deadline;
    private String kategori;
    private String pemberiTugas;

    public Tugas(String judul, String deskripsi, String deadline, String kategori, String pemberiTugas) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.deadline = deadline;
        this.kategori = kategori;
        this.pemberiTugas = pemberiTugas;
    }

    // Getter
    public String getJudul() { return judul; }
    public String getDeskripsi() { return deskripsi; }
    public String getDeadline() { return deadline; }
    public String getKategori() { return kategori; }
    public String getPemberiTugas() { return pemberiTugas; }

    // Setter (jika perlu)
}
