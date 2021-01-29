package funcionario;

public class Vendedor extends Pessoa{

	public Vendedor(int id, String nome) {
		super(id, nome);
	}
	
	public static void main(String[] args) {
		Vendedor Rodrigo = new Vendedor(1, "Rodrigo");
		Rodrigo.CalcSalarioVendedor(1300, 30);
	}

}
