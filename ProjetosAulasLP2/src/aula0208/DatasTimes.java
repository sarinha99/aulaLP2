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
		System.out.println("Dura��o em nano segundos " + duracao.toNanos());
		System.out.println("Dura��o em minuto "  +  duracao.toMinutes());
		System.out.println("Dura��o em horas "  +  duracao.toHours());
		System.out.println("Dura��o em  milisegundo " +  duracao.toMillis());
		System.out.println("Dura��o em dias "  +  duracao.toDays());
		
	}
}
