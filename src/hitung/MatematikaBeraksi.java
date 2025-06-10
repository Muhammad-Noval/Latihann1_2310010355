package hitung;
public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika noval = new Matematika(5,5);
        
        System.out.println("Hasil Penjumlahan "+noval.setPenjumlahan());
        System.out.println("Hasil Pengurangan "+noval.setPengurangan());
        System.out.println("Hasil Perkalian "+noval.setPerkalian());
        System.out.println("Hasil Pembagian "+noval.setPembagian());
    }
}
