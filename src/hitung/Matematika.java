package hitung;

public class Matematika {
    //membuat variable
    private double bil1,bil2;
    
    //membuat constructor
    public Matematika(double bil1, double bil2){
        this.bil1=bil1;
        this.bil2=bil2;
    }
    
    //membuat method motator setPenjumlahan
    public double setPenjumlahan(){
        return bil1+bil2;
    }
    
    //membuat method motator setPengurangan
    public double setPengurangan(){
        return bil1-bil2;
    }
    
    //membuat method motator setPerkalian
    public double setPerkalian(){
        return bil1*bil2;
    }
    
    //membuat method motator setPembagian
    public double setPembagian(){
        return bil1/bil2;
    }
}


