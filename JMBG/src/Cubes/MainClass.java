package Cubes;


import java.time.Year;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int currentYear = Year.now().getValue();
		boolean badInput = true;


			do {
				String jmbg;
				
				String dd;
				String mm;
				String ggg;
				String rr;
				String bbb;
				String k;
				
				System.out.println("Unesite Vas JMBG: ");
				jmbg = scanner.nextLine();
				System.out.println("Vas jmbg je: " + jmbg);
				System.out.println(" ");
				
				dd = jmbg.substring(0, 2);
				int ddInt = Integer.parseInt(dd);
				
				mm = jmbg.substring(2, 4);
				int mmInt = Integer.parseInt(mm);
				
				ggg = jmbg.substring(4, 7);
				int gggInt = Integer.parseInt(ggg);
				
				rr = jmbg.substring(7, 9);
				int rrInt = Integer.parseInt(rr);

				bbb = jmbg.substring(9, 12);
				int bbbInt = Integer.parseInt(bbb);

				k = jmbg.substring(12, 13);
				int kInt = Integer.parseInt(k);
				
				//OUTPUT DAYS
				if( (mmInt == 02 && (ddInt > 28 || ddInt < 1)) && (mmInt == 02 && gggInt % 100 != 0 && gggInt % 4 == 0 && (ddInt > 29 || ddInt < 1)) ) {
					System.out.println("Uneli ste lose prva dva broja");
				} else if((mmInt == 04 || mmInt == 06 || mmInt == 9 || mmInt == 11) && (ddInt > 30 || ddInt < 1)){
					System.out.println("Uneli ste lose prva dva broja");
				} else if((mmInt == 01 || mmInt == 03 || mmInt == 05 || mmInt == 07 || mmInt == 8 || mmInt == 10 || mmInt == 12) && (ddInt > 31 || ddInt < 1) ){
					System.out.println("Uneli ste lose prva dva broja");
				} else {
					System.out.println("Dan rodjenja je: " + dd);
					badInput = false;
				}
				
				//OUTPUT MONTHS
				if(mmInt == 01 && mmInt <= 12) {
					mm = "Januar";
					System.out.println("Mesec rodjenja je: " + mm);
				} else if(mmInt == 02 && mmInt <= 12) {
					mm = "Februar";
					System.out.println("Mesec rodjenja je: " + mm);
				} else if(mmInt == 03 && mmInt <= 12) {
					mm = "Mart";
					System.out.println("Mesec rodjenja je: " + mm);
				} else if(mmInt == 04 && mmInt <= 12) {
					mm = "April";
					System.out.println("Mesec rodjenja je: " + mm);
				} else if(mmInt == 05 && mmInt <= 12) {
					mm = "Maj";
					System.out.println("Mesec rodjenja je: " + mm);
				} else if(mmInt == 06 && mmInt <= 12) {
					mm = "Jun";
					System.out.println("Mesec rodjenja je: " + mm);
				} else if(mmInt == 07 && mmInt <= 12) {
					mm = "Jul";
					System.out.println("Mesec rodjenja je: " + mm);
				} else if(mmInt == 8 && mmInt <= 12) {
					mm = "Avgust";
					System.out.println("Mesec rodjenja je: " + mm);
				} else if(mmInt == 9 && mmInt <= 12) {
					mm = "Septembar";
					System.out.println("Mesec rodjenja je: " + mm);
				} else if(mmInt == 10 && mmInt <= 12) {
					mm = "Oktobar";
					System.out.println("Mesec rodjenja je: " + mm);
				} else if(mmInt == 11 && mmInt <= 12) {
					mm = "Novembar";
					System.out.println("Mesec rodjenja je: " + mm);
				} else if(mmInt == 12 && mmInt <= 12) {
					mm = "Decembar";
					System.out.println("Mesec rodjenja je: " + mm);
				} else {
					System.out.println("Uneli ste lose 3. i 4. broj.");
				}
				
				//OUTPUT YEAR
				if(gggInt > 900) {
					gggInt = 1000 + gggInt;
					System.out.println("Godina rodjenja je: " + gggInt);
				} else if((2000 + gggInt) > currentYear) {
					gggInt = 0;
					System.out.println("Uneli ste pogresno 5, 6, ili 7.");
				} else if(gggInt < 100){
					gggInt = 2000 + gggInt;
					System.out.println("Godina rodjenja je: " + gggInt);
				}
				
				//OUTPUT POLITICAL REGIONS
				if(rrInt > 9 && rrInt < 20) {
					System.out.println("Politicka regija: Bosna i Hercegovina");
				} else if(rrInt > 19 && rrInt < 30) {
					System.out.println("Politicka regija: Crna Gora");
				} else if(rrInt > 29 && rrInt < 40) {
					System.out.println("Politicka regija: Hrvatska");
				} else if(rrInt > 39 && rrInt < 50) {
					System.out.println("Politicka regija: Makedonija");
				} else if(rrInt == 50) {
					System.out.println("Politicka regija: Slovenija");
				} else if(rrInt > 50 && rrInt < 70) {
					System.out.println("Pogresno ste uneli brojeve 8 ili 9");
				} else if(rrInt > 69 && rrInt < 80) {
					System.out.println("Politicka regija: Centralna Srbija");
				} else if(rrInt > 79 && rrInt < 90) {
					System.out.println("Politicka regija: Autonomna Pokrajina Vojvodina");
				} else if(rrInt > 89 && rrInt < 99) {
					System.out.println("Politicka regija: Autonomna Pokrajina Kosovo i Metohija");
				} else {
					System.out.println("Stranci bez drzavljanstva bivse SFRJ ili njenih naslednica.");
				}
				
				//OUTPUT GENDER
				if(bbbInt > 0 && bbbInt < 500) {
					System.out.println("Pol: Muski");
				} else {
					System.out.println("Pol: Zenski");
				}
				
				//OUTPUT L NUMBER
				// L = 11 – (( 7*(A+E) + 6*(B+Ž) + 5*(V+Z) + 4*(G+I) + 3*(D+J) + 2*(Đ+K) ) % 11) kInt

				
				
				
				
			}while(badInput = true);
				

		
			
	}

}
//else if((mmInt == 02 && gggInt % 100 != 0 && gggInt % 4 == 0) && (ddInt > 29 || ddInt < 1)) {
//System.out.println("Prestupna godina je. Februar ima 29 dana");
//}
