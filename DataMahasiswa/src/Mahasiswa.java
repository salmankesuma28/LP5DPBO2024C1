public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String asal;
    private String kbk;

    public Mahasiswa(String nim, String nama, String jenisKelamin, String asal, String kbk) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.asal =asal;
        this.kbk = kbk;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public void setAsal(String asal) {this.asal = asal;}
    public void setKbk(String kbk) {this.kbk = kbk;}

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {return this.jenisKelamin;}
    public String getAsal() {return  this.asal;};
    public String getKbk() {return this.kbk;}
}
