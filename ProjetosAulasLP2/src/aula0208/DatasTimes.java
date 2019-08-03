package aula0208;

import java.time.Duration;
import java.time.Instant;

public class DatasTimes {

	public static void main(String[]args) {
		
				
		Instant inicio = Instant.now();
		
		try {
			Thread.sleep(1000);// fazer o processador esperar
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Instant fim = Instant.now();
		
		Duration duracao = Duration.between(inicio, fim);
		System.out.println("Duração em nano segundos " + duracao.toNanos());
		System.out.println("Duração em minuto "  +  duracao.toMinutes());
		System.out.println("Duração em horas "  +  duracao.toHours());
		System.out.println("Duração em  milisegundo " +  duracao.toMillis());
		System.out.println("Duração em dias "  +  duracao.toDays());
		
	}
}
