package cobapercabangan2;

import java.util.Scanner;

public class CobaPercabangan2 {
    public static void main(String[] args) {
        String identittas = "Islanty Seni Utami / X RPL 4 / 21";
        String identitas = null;
        System.out.println("Identitas : "+ identitas);
        
        System.out.print("\nSaran Resep dari Bahan Milik Anda\n");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bahan Pertama: ");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.println("Masukkan no pilihan Anda :");
        int bahan1 = scanner.nextInt();
        if(bahan1 == 1 || bahan1 == 1)
        {
            System.out.println("Bahan Kedua: ");
            if(bahan1 == 1) {
                System.out.println("1. Susu");
                System.out.println("2. Minyak Goreng");
                System.out.println("3. Tidak ada");
            }else{
                System.out.println("1. Minyak Goreng");
                System.out.println("2. Roti");
                System.out.println("3. Tidak ada");
            }
            System.out.print("Masukkan no pilihan Anda :");
            int bahan2 = scanner.nextInt();
            
            
        }else
            System.out.println("Mohon Maaf,Pilihan tidak ditemukan, "+ "tidak dapat memberikan saran resep");
        int bahan2 = scanner.nextInt();
        if(bahan2 >= 1 && bahan2 <= 3)
        {
            if(bahan1==1)
                switch(bahan2)
                {
                    case 1: System.out.println("Anda dapat maembuat milk shake banana"); break;
                    case 2: System.out.println("Anda dapat membuat pisang goreng"); break;
                    case 3: System.out.println("Anda dapat membuat pisang rebus");
                }
            else
                switch(bahan2)
                {
                    case 1: System.out.println("Anda dapat membuat telur mata sapi"); break;
                    case 2: System.out.println("Anda dapat membuat sandwich telur"); break;
                    case 3: System.out.println("Anda dapat membuat telur rebus"); break;
                }
        }else
            System.out.println("Mohon Maaf, Pilihan tidak ditemukan,"+ "tidak dapat memberikan saran resep");
                   
         
    }
    
}
