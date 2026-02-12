package latihanInheritance;
public class App {
    public static void main(String[] args) {
        bujurSangkar bujur = new bujurSangkar("Bujur Sangkar", 10);
        bujur.info();
        System.out.println ("\nLuas : " + bujur.luas());
        System.out.println();

        lingkaran l = new lingkaran ("lingkaran", 14);
        l.info();
        System.out.println ("\nLuas : " + l.luas());
    }
    
}