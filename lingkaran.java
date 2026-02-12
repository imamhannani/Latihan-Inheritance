package latihanInheritance;
public class lingkaran extends bidangDuaDimensi {
    private double jariJari; 

    public lingkaran (String nama, double jariJari) {
        super(nama);
        this.jariJari = jariJari;
    }

    public double luas() {
        return Math.PI * jariJari * jariJari;
    }
    
}