package funcionario;

public class Pessoa {
	public int id;
	public String nome;   

	public Pessoa(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public void CalcSalarioVendedor(double Salario, int qtdeVendas) {
		
		double porcentagem = ((qtdeVendas * Salario) / 100);
		double ValorTotal = Salario + porcentagem;
		
		System.out.println("O Sal�rio do vendedor com o adicional de venda �: " + ValorTotal);
	}
	
	public void CalcSalarioDiretor(double Salario) {
		
		Salario = Salario + (Salario/10);
		
		System.out.println("O Sal�rio do diretor com o adicional de tempo de empresa �: " + Salario);
	}

}
