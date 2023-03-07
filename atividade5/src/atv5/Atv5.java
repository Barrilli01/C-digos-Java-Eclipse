package atv5;

public class Atv5 {

	public static void main(String[] args) {
	
    Conta c1 = new Conta();
    Conta c2 = new Conta();
    
    c1.setNumero((int) 1);
    c1.setSaldo((double) 100);
    c1.setNome("Ana");
    
    c2.setNumero((int) 2);
    c2.setSaldo((int) 200);
    c2.setNome("José");
    
    c1.deposita((int) 50);
    c1.saca((int) 100);
    c1.transfere(c2 , 25);
    
    c2.transfere(c1 , 215);
    
    System.out.println(c1.toString());
    System.out.println(c2.toString());
}
}