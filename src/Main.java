import java.util.Scanner;

class Segitiga {
    private double alas;
    private double tinggi;
    private double sisiA;
    private double sisiB;
        
    public Segitiga() {
        this.alas = 0;
        this.tinggi = 0;
        this.sisiA = 0;
        this.sisiB = 0;
  
    }
    public double getLuas() {
        return 0.5 * alas * tinggi;
    }
    public double getKeliling() {
        return sisiA + sisiB + alas;
    }
    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public void setSisi(double sisiA, double sisiB) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
    }
}

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Segitiga segitiga = new Segitiga();        
            System.out.print("Masukan alas: ");
            double alas = input.nextDouble();
            segitiga.setAlas(alas);
            System.out.print("Masukan tinggi: ");
            double tinggi = input.nextDouble();
            segitiga.setTinggi(tinggi);
            
            System.out.print("Masukan sisi A: ");
            double sisiA = input.nextDouble();
            System.out.print("Masukan sisi B: ");
            double sisiB = input.nextDouble();
            segitiga.setSisi(sisiA, sisiB);
            
            double luas = segitiga.getLuas();
            double keliling = segitiga.getKeliling();
            System.out.println("Luas segitiga: " + luas);
            System.out.println("Keliling segitiga: " + keliling);
        }
    }
}