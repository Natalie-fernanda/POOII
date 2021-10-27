import java.time.LocalDate; 
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.text.ParseException;

class Main{
	public static void main (String [] args) throws ParseException {

		try {
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			Scanner s= new Scanner(System.in);
			String dI= s.nextLine();
			s.close();
			Scanner s2= new Scanner(System.in);
			String dF= s2.nextLine();
			s2.close();

			LocalDate data1 = LocalDate.parse(dI, formato); 
			LocalDate data2 = LocalDate.parse(dF, formato); 

			Long range = java.time.temporal.ChronoUnit.DAYS.between(data1, data2);

			if(range<0) {
				int aux = range.intValue();
				int res = aux * (-1);
				System.out.println(res);
			}else {
				System.out.println(range);			
			}



		}catch(DateTimeParseException ex) {
			System.out.println("Entrada invalida: "+ ex.getParsedString());
		}




	}

}
