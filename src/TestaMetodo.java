
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoFlavio = new Conta();
		contaDoFlavio.saldo = 100;
		contaDoFlavio.deposita(50);
		System.out.println(contaDoFlavio.saldo);
		
		boolean conseguiuRetirar = contaDoFlavio.saca(20);
		System.out.println(contaDoFlavio.saldo);
		System.out.println(conseguiuRetirar);
	}
}
