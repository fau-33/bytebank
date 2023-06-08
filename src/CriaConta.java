
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.agencia = 146;
		System.out.println(" agencia " + primeiraConta.agencia);
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		
		
		System.out.println("A primeira conta tem " + primeiraConta.saldo);
		System.out.println("A segunda conta tem " + segundaConta.saldo);
		
		segundaConta.agencia = 146;
		System.out.println("agora a segunda conta está na agência " + segundaConta.agencia);
		
		if (primeiraConta == segundaConta) {
			System.out.println("a mesma conta");
		} else {
			System.out.println("contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		
		
	}
}
