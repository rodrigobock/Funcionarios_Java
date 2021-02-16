package funcionario;

import funcionario.Interfaces.IPessoa;

public class Vendedor extends Pessoa implements IPessoa {

	public Vendedor(int id, String nome) {
		super(id, nome);
	}
	
	public static void main(String[] args) {
		Vendedor Rodrigo = new Vendedor(1, "Rodrigo");
		Rodrigo.CalcSalarioVendedor(1300, 30);
	}

	public void CalcSalario(double Salario) {

		Salario = Salario + (Salario/10);

		System.out.println("O Sal�rio do diretor com o adicional de tempo de empresa �: " + Salario);
	}

}
