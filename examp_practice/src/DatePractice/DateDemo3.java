package DatePractice;

import java.time.LocalDate;

public class DateDemo3 {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		System.out.println(ld.getYear());
		System.out.println(ld.isBefore(LocalDate.parse("2017-10-05")));
		
		LocalDate d = LocalDate.of(1995, 9, 9);// don't use zero before number
		System.out.println(d);
		
		LocalDate d1 = LocalDate.parse("2015-05-05");
		System.out.println(d1);

		LocalDate d2 = LocalDate.ofYearDay(2005, 86);
		System.out.println(d2);

	}

}
