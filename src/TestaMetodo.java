
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoFlavio = new Conta();
		contaDoFlavio.saldo = 100;
		contaDoFlavio.deposita(50);
		System.out.println(contaDoFlavio.saldo);

		boolean conseguiuRetirar = contaDoFlavio.saca(20);
		System.out.println(contaDoFlavio.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDeMarcela = new Conta();
		contaDeMarcela.deposita(1000);

		boolean sucessoTranferencia = contaDeMarcela.transfere(300, contaDoFlavio);

		if (sucessoTranferencia) {
			System.out.println("Transferência feita com sucesso!");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDeMarcela.saldo);
		System.out.println(contaDoFlavio.saldo);
	}
}
