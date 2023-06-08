
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("saldo da primeira conta " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		segundaConta.saldo += 100;
		
		System.out.println("saldo da segunda conta " + segundaConta.saldo);
		System.out.println(primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("a mesma conta!");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
