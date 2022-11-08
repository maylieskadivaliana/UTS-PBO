public class Main {
    public static void main(String[] args) {
    //penggunaan class Karyawan dengan inheritance Dosen dan Tendik
        Dosen x = new Dosen();
        x.setNip("Karyawan01");
        x.setNama("Maylieska");
        x.setNidn("Dosen01");
        x.setJurusan("Informatika");
        x.setJk("Perempuan");
        x.setAlamat("JawaTimur");
        x.setTahunmasuk(2026);
        x.setTgllahir("20-05-2002");
        x.setSks(6);
        System.out.println("NIP               = " +x.getNip());
        System.out.println("NIDN              = " +x.getNidn());
        System.out.println("NAMA              = " +x.getNama());
        System.out.println("JURUSAN           = " +x.getJurusan());
        System.out.println("JENIS KELAMIN     = " +x.getJk());
        System.out.println("ALAMAT            = " +x.getAlamat());
        System.out.println("TTL               = " +x.getTgllahir());
        x.gajiTotal();

        Tendik y = new Tendik();
        y.setNip("Karyawan02");
        y.setNama("Adnan");
        y.setJk("Laki-Laki");
        y.setAlamat("Makassar");
        y.setTahunmasuk(2026);
        y.setTgllahir("20-03-2003");
        System.out.println("NIP               = " +y.getNip());
        System.out.println("NAMA              = " +y.getNama());
        System.out.println("JENIS KELAMIN     = " +y.getJk());
        System.out.println("ALAMAT            = " +y.getAlamat());
        System.out.println("TTL               = " +y.getTgllahir());
        y.lembur(20);
        y.lembur(20,50000);
        y.gajiTotal();
    }
}