package dataHora.exemplo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d1 = LocalDate.now();
		LocalDateTime d2 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d4 = LocalDate.parse("2024-07-05");
		LocalDateTime d5 = LocalDateTime.parse("2024-07-05T01:20:10");
		Instant d6 = Instant.parse("2024-07-05T02:10:07Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate d8 = LocalDate.parse("05/07/2024",fmt1);
		LocalDateTime d9 = LocalDateTime.parse("05/07/2024 01:30",fmt2);
		LocalDate d10 = LocalDate.of(2024, 7, 5);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d03);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		System.out.println(d07.toString());
		System.out.println(d8);
		System.out.println("d9 "+d9);
		System.out.println("d10 "+d10);
		

	}

}
