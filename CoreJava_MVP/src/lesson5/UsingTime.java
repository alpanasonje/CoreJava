package lesson5;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalUnit;

public class UsingTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2000, 10, 20);
		System.out.println(date1);
		System.out.println(date2);
		Period p=date2.until(date1);
		System.out.println(p.getDays());
		System.out.println(p.getMonths());
		System.out.println(p.getYears());
	}

}
