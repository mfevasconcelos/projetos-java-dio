package candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		selecaoCandidatos();
	}
	
	static void ligar(String[] candidatosSelecionados) {
		for(String candidato : candidatosSelecionados) {
			entrandoEmContato(candidato);
		}
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando) {
				tentativasRealizadas++;
			}
			else {
				System.out.println("Contato realizado com sucesso!");
			}
		} while(continuarTentando && tentativasRealizadas < 3);
		
		if(atendeu) {
			System.out.println("Conseguimos contato com " + candidato + " na "
					+ tentativasRealizadas + " tentativa.");
		} else {
			System.out.println("Não conseguimos contato com " + candidato + ". Número máximo de " 
		+  tentativasRealizadas + " tentativas realizada(s).");
		}
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	static void imprimirSelecionados(String[] candidatosSelecionados) {
		System.out.println("Imprimindo a lista de candidatos selecionados:");
		for(String candidato : candidatosSelecionados) {
			System.out.println(candidato);
		}
		System.out.println();
	}
	
 	static void selecaoCandidatos() {
		String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
		int selecionados = 0;
		String[] candidatosSelecionados = new String[5];
		int candidatoAtual=0;
		double salarioBase = 2000.0;
		while(selecionados < 5 &&  candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato +" solicitou este valor de salário: " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato +" foi selecionado para a vaga");
				System.out.println();
				candidatosSelecionados[selecionados] = candidato;
				selecionados++;
			} else {
				System.out.println("O candidato " + candidato +" não foi selecionado para a vaga");
				System.out.println();
			}
			candidatoAtual++;
		}
		imprimirSelecionados(candidatosSelecionados);
		ligar(candidatosSelecionados);
	}

	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		} else if(salarioBase==salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta");
		} else {
			System.out.println("Aguardando demais candidatos");
		}
	}
}
