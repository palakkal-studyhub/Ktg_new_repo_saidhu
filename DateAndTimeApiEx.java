package com.ktg.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAndTimeApiEx {

	public static void main(String[] args) {
		// Date,time,calendar,.....java.util -->muttable
		// joda.org-->joda-api

		// java.time

		LocalDate date = LocalDate.now();// Immutable

		System.out.println(date);
		date.plusDays(2);
		System.out.println(date);

		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonthValue());

		LocalTime time = LocalTime.now();
		System.out.println(time);

		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getNano());

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		LocalDate ldate = LocalDate.now();// systemdate
		LocalDate bDate = LocalDate.of(1993, 11, 10);
		Period p = Period.between(bDate, date);
		System.out.printf("ur age %d years,%d months,%d days", p.getYears(), p.getMonths(), p.getDays());
		System.out.println();
		ZoneId zone = ZoneId.of("America/New_York");
		ZonedDateTime zt = ZonedDateTime.now(zone);
		System.out.println(zt);// Asia/Calcutta

	}

}
