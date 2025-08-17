public interface Transferencia {
	
	void transferir(double valor, Transferencia contaDestino);

    void depositar(double valor);
}
