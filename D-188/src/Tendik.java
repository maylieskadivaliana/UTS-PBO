public class Tendik extends Karyawan{
int gajilembur, jamlembur, totallembur;
//overloading
public void lembur(int a){
    this.gajilembur=a;
}
public void lembur (int a, int b){
    this.gajilembur = a;
    this.jamlembur = b;
    totallembur =  a*b;
}

    @Override
    public void gajiTotal() {
        System.out.println("Total Gaji = " + (gaji+totallembur));
    }
}