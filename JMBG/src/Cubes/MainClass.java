package Cubes;

import java.time.Year;
import java.util.Scanner;
import java.util.Date; 

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int currentYear = Year.now().getValue();
		Date d = new Date();
		int currentMonth = (d.getMonth()+1);
		byte option = 0;
			do {
				String jmbg;
				
				String dd;
				String mm;
				String ggg;
				String rr;
				String bbb;
				String k;
				
				System.out.println("Unesite Vas JMBG: ");
				jmbg = scanner.next();
				
					System.out.println("Vas jmbg je: " + jmbg);
					System.out.println("");
					
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
				
				int l = 0;
				
				String l1;
				String l2;
				String l3;
				String l4;
				String l5;
				String l6;
				String l7;
				String l8;
				String l9;
				String l10;
				String l11;
				String l12;
				String l13;
				
				l1 = jmbg.substring(0,1);
				int l1Int = Integer.parseInt(l1);
				l2 = jmbg.substring(1,2);
				int l2Int = Integer.parseInt(l2);
				l3 = jmbg.substring(2,3);
				int l3Int = Integer.parseInt(l3);
				l4 = jmbg.substring(3,4);
				int l4Int = Integer.parseInt(l4);
				l5 = jmbg.substring(4,5);
				int l5Int = Integer.parseInt(l5);
				l6 = jmbg.substring(5,6);
				int l6Int = Integer.parseInt(l6);
				l7 = jmbg.substring(6,7);
				int l7Int = Integer.parseInt(l7);
				l8 = jmbg.substring(7,8);
				int l8Int = Integer.parseInt(l8);
				l9 = jmbg.substring(8,9);
				int l9Int = Integer.parseInt(l9);
				l10 = jmbg.substring(9,10);
				int l10Int = Integer.parseInt(l10);
				l11 = jmbg.substring(10,11);
				int l11Int = Integer.parseInt(l11);
				l12 = jmbg.substring(11,12);
				int l12Int = Integer.parseInt(l12);
				l13 = jmbg.substring(12,13);
				int l13Int = Integer.parseInt(l13);
				
				//OUTPUT DAYS
				if( (gggInt % 100 != 0 && gggInt % 4 == 0) && mmInt == 02 && (ddInt > 29 || ddInt < 1) ) {
					System.out.println("Uneli ste lose prva dva broja");
				} else if((gggInt % 100 != 0 && gggInt % 4 != 0) && (mmInt == 02) && (ddInt > 28 || ddInt < 1) ) {
					System.out.println("Uneli ste lose prva dva broja");
				} else if((mmInt == 04 || mmInt == 06 || mmInt == 9 || mmInt == 11) && (ddInt > 30 || ddInt < 1)){
					System.out.println("Uneli ste lose prva dva broja");
				} else if((mmInt == 01 || mmInt == 03 || mmInt == 05 || mmInt == 07 || mmInt == 8 || mmInt == 10 || mmInt == 12) && (ddInt > 31 || ddInt < 1) ){
					System.out.println("Uneli ste lose prva dva broja");
				} else {
					System.out.println("Dan rodjenja je: " + dd);
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
				//                         currentMonth
				//OUTPUT YEAR
				if(gggInt > 900) {
					gggInt = 1000 + gggInt;
					System.out.println("Godina rodjenja je: " + gggInt);
				} else if( (2000 + gggInt) > currentYear || mmInt > currentMonth) {
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
				l = 11 - (( 7*(l1Int+l7Int) + 6*(l2Int+l8Int) + 5*(l3Int+l9Int) + 4*(l4Int+l10Int) + 3*(l5Int+l11Int) + 2*(l6Int+l12Int) ) % 11);
				
				if( l == kInt && (l > 1 && l < 10)) {
					l = kInt;
				} else if(l >= 10 && l != kInt) {
					l = 0;
				}else if(l != kInt){
					System.out.println("Kontrolni broj se ne poklapa. Lose ste uneli JMBG");
				}
				
				System.out.println("Kontrolni broj je: " + l);
				System.out.println("");
				System.out.print("Ukoliko zelite opet da validirate JMBG, pritisnite (1). Ako ne, pritisnite bilo koji drugi broj! ");
				option = scanner.nextByte();
			}while(option == 1);		
			
			scanner.close();
	}
}
// 1512993857412