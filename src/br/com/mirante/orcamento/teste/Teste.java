package br.com.mirante.orcamento.teste;

public class Teste {

	public static void main(String[] args) {
		System.out.println(converteNumeroParaDiaDaSemana(1));
		
		
	}
	
	public static String converteNumeroParaDiaDaSemana(int diaDaSemana) {
		if(diaDaSemana == 1) {
			return "Domingo";
		}
		if(diaDaSemana == 2) {
			return "Segunda";
		}
		if(diaDaSemana == 3) {
			return "Terça";
		}
		if(diaDaSemana == 4) {
			return "Quarta-feira";
		}
		if(diaDaSemana == 5) {
			return "Quinta-feira";
		}
		if(diaDaSemana == 6) {
			return "Sexta-feira";
		}
		if(diaDaSemana == 7) {
			return "Sábado";
		} else {
			throw new RuntimeException();
		}
	}
}

