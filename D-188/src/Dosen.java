public class Dosen extends Karyawan{
    String nidn, jurusan;
    int sks;

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }


    @Override
    public void gajiTotal() {
        System.out.println("Total Gaji = " +((sks*100000)+gaji));
    }
    public void setSks(int sks){//overloading
        this.sks = sks;
    }
}
