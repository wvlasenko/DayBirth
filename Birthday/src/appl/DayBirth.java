package appl;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DayBirth {

	public static void main(String[] args) {
		LocalDate currDate = LocalDate.now();
		LocalDate myBirthDate = LocalDate.of(1981, 04, 30);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		String txt = myBirthDate.format(formatter);
		System.out.println("My birth date =" + txt);
		Long amount = myBirthDate.until(currDate, ChronoUnit.DAYS);
		System.out.println("I have " + amount + "day old");
		amount = myBirthDate.until(currDate, ChronoUnit.MONTHS);
		System.out.println("I have " + amount + "monts old");
		amount = myBirthDate.until(currDate, ChronoUnit.YEARS);
		System.out.println("I have " + amount + "years old");
		DayOfWeek dof = myBirthDate.getDayOfWeek();
		Locale locale = new Locale("en");
		System.out.println("I was born on " + dof.getDisplayName(TextStyle.FULL, locale));

	}

}
