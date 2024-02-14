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
		System.out.println("���س�¥:" + startDateTime);
		System.out.println("�񱳳�¥:" + endDateTime);

		System.out.println("========Duration");
		Duration duration = Duration.between(startDateTime, endDateTime);
		System.out.println("��:" + duration.getSeconds());
		System.out.println("������:" + duration.getNano());
		System.out.println("===========Period"); // �� ,�� ,��
		LocalDate startDate = LocalDate.of(2024, 5, 10);
		LocalDate endDate = LocalDate.of(2025, 6, 12);
		Period period = Period.between(startDate, endDate);
		System.out.println("Years:" + period.getYears()); // ��*365
		System.out.println("Months:" + period.getMonths()); // ��*365
		System.out.println("Days:" + period.getDays()); // ��*1
		System.out.println("===========ChronoUnuit"); // ��ü ���� ���� ��밡��
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
