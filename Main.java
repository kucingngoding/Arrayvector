package com.binus;
import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		 Scanner input = new Scanner(System.in);
		 ArrayList<String> coba = new ArrayList<>(); 
		 Matakuliah matkul = new Matakuliah();
		 int pilih;
		 
		 while (true){
		 	System.out.println(" ");
			 System.out.println("Pendataan dan Perhitungan IPS (Indeks Prestasi Semester)");
			 System.out.println("1. Pendataan Matakuliah");
			 System.out.println("2. Perhitungan IPS");
			 System.out.println("3. Update Grade");
			 System.out.println("4. Keluar");
			 System.out.print("Masukan Pilihan Anda : ");
			 pilih = input.nextInt();

			 switch(pilih) {
			 	case 1:
			 		matkul.dataMatkul();
			 		break;
			 	case 2:
			 		matkul.showMatkul();
			 		break;
			 	case 3:
			 		matkul.Updategrade();
			 		break;
			 	case 4:
			 		System.exit(0);
			 		break;
			 		// KELUAR (PROGRAM BERHENTI)
			 	default:
			 		System.out.println("Pilihan Anda Tidak Terdaftar!");
			 }	
		 }
		 
	}
}