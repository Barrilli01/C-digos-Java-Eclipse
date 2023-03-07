package atividade4;

public class atv4 {

	public static void main(String[] args) {

		        Pessoa p1 = new Pessoa();
                Pessoa p2 = new Pessoa();
		        
		        p1.setNome("Francisco");
		        p1.setIdade((int) 42);
		        p1.setAltura((float) 1.72);
		        p1.setPeso((float) 95.0);
		        
		        p2.setNome("Patrícia");
		        p2.setIdade((int) 23);
		        p2.setAltura((float) 1.50);
		        p2.setPeso((float) 55.0);
		        
		        p1.IMC(p1.getPeso(), p1.getAltura(), p1.getNome());
		        p2.IMC(p2.getPeso(), p2.getAltura(), p2.getNome());
		    }    
		
	}