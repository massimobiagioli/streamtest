package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		//testCollection();
		//testCollection2();
		//testLambda();
		testStream();
	}
	
	private static void testCollection() {
		List<String> items = new ArrayList<String>();
		items.add("pippo");
		items.add("pluto");
		items.add("paperino");
		items.add("anna");
		items.add("marcello");
		
		items
			.stream()
			.filter(s -> s.startsWith("p"))
			.map(s -> s.toUpperCase())
			.sorted()
			.forEach(System.out::println);					
	}
	
	private static void testCollection2() {
		List<Dipendente> items = new ArrayList<Dipendente>();
		items.add(new Dipendente("mario", "rossi"));
		items.add(new Dipendente("anna", "verdi"));
		items.add(new Dipendente("bruno", "neri"));
		
		items
			.stream()
			.filter(dipendente -> dipendente.getCognome().length() > 4)
			.map(dipendente -> {
				dipendente.setNome(dipendente.getNome().toUpperCase());
				dipendente.setCognome(dipendente.getCognome().toUpperCase());
				return dipendente;
			})
			.forEach(System.out::println);
						
	}
	
	public static void testLambda() {
		Dipendente d = new Dipendente("mario", "rossi");
		d.fn(dip -> dip.setNome("pietro"));
		System.out.println(d);
	}
	
	public static void testStream() {
		Stream<Dipendente> sd = Stream.of(
				new Dipendente("mario", "rossi"),
				new Dipendente("bruno", "bianchi"));
		sd
			.filter(dip -> dip.getCognome().length() > 5)
			.forEach(System.out::println);
	}
}
