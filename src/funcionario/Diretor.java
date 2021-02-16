package funcionario;

import funcionario.Interfaces.IPessoa;

public class Diretor extends Pessoa implements IPessoa {

	public Diretor(int id, String nome) {
		super(id, nome);
	}
	
	public static void main(String[] args) {

		Diretor Erick = new Diretor(1, "Erick");
		Erick.CalcSalarioDiretor(3500);
	}

	public void CalcSalario(double Salario) {

		Salario = Salario + (Salario/10);

		System.out.println("O Sal�rio do diretor com o adicional de tempo de empresa �: " + Salario);
	}
}
