package n1exercici7.handlers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LlistaInversa {

	public void order() {
		
		List<Object> llista = new ArrayList<>();
		llista.add("Casa");
		llista.add(5);
		llista.add("Finestra");
		llista.add("Porta");
		llista.add(7);
		
		Collections.sort(llista, (s1, s2) -> s2.toString().length() - s1.toString().length());
		llista.forEach(System.out :: println);
	}
}
