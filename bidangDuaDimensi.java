package latihanInheritance;
public abstract class bidangDuaDimensi {

    protected String nama;

    public bidangDuaDimensi(String nama){
    this.nama = nama;
    }

    public void info() {
        System.out.print("Nama : " + nama);
    }

    public abstract double luas();
}
