public class Karyawan {
    protected int gaji = 2000000;
    private int tahunmasuk;
    private String nip, nama, alamat, jk, tgllahir;

    public void gajiTotal(){
        System.out.println("-");
    }

    public int getTahunmasuk() {
        return tahunmasuk;
    }

    public void setTahunmasuk(int tahunmasuk) {
        this.tahunmasuk = tahunmasuk;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getTgllahir() {
        return tgllahir;
    }

    public void setTgllahir(String tgllahir) {
        this.tgllahir = tgllahir;
    }
}
