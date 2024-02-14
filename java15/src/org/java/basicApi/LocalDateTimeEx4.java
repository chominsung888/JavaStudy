package org.java.basicApi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeEx4 {
	public static void main(String[] args) {
		System.out.println("LocalDateTime");

		LocalDateTime startDateTime = LocalDateTime.now();
		LocalDateTime endDateTime = LocalDateTime.of(2024, 4, 1, 23, 59, 59);
		System.out.println("기준날짜:" + startDateTime);
		System.out.println("비교날짜:" + endDateTime);

		System.out.println("========Duration");
		Duration duration = Duration.between(startDateTime, endDateTime);
		System.out.println("초:" + duration.getSeconds());
		System.out.println("나노초:" + duration.getNano());
		System.out.println("===========Period"); // 년 ,월 ,일
		LocalDate startDate = LocalDate.of(2024, 5, 10);
		LocalDate endDate = LocalDate.of(2025, 6, 12);
		Period period = Period.between(startDate, endDate);
		System.out.println("Years:" + period.getYears()); // 년*365
		System.out.println("Months:" + period.getMonths()); // 년*365
		System.out.println("Days:" + period.getDays()); // 일*1
		System.out.println("===========ChronoUnuit"); // 객체 생성 없이 사용가능
		long months = ChronoUnit.MONTHS.between(startDate, endDate);
		long weeks = ChronoUnit.WEEKS.between(startDate, endDate);
		long days = ChronoUnit.DAYS.between(startDate, endDate);
		long hours = ChronoUnit.HOURS.between(startDate, endDate);
		long minutes = ChronoUnit.MINUTES.between(startDate, endDate);
		long seconds = ChronoUnit.SECONDS.between(startDate, endDate);
		System.out.println("Months:" + months);
		System.out.println("Months:" + weeks);
		System.out.println("Months:" + days);
		System.out.println("Months:" + hours);
		System.out.println("Months:" + minutes);
		System.out.println("Months:" + seconds);

	}
}
