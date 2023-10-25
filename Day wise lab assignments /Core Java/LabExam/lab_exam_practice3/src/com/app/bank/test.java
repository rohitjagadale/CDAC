package com.app.bank;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-uuuu");
//		String date = "10-12-2018";
		LocalDate date = LocalDate.now();
		System.out.println(date);
		String text = date.format(formatter);
		System.out.println(text);
		LocalDate parsedDate = LocalDate.parse(text, formatter);
		System.out.println(parsedDate);

	}

}
