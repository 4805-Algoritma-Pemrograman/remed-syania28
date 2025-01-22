import java.util.Scanner;
          public class Taksi{
               public static void main(String[] args){
                    
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Masukkan total kilometer: ");
                    int totalKm = scanner.nextInt();
                    System.out.print("Masukkan jumlah jam lembur: ");
                    int jumlahLembur = scanner.nextInt();

                    int totalBiaya = 0;
                    if (jumlahLembur <= 3){
                         totalBiaya= 20000;
                    }else{
                         totalBiaya= 20000 + (totalKm - 3) * 10000;
                    }

                    System.out.println("Total km: " + totalKm);
                    System.out.println("Honor taksi: " + totalBiaya);               
    }
}
