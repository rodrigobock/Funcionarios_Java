package funcionario;

public class Diretor extends Pessoa{

	public Diretor(int id, String nome) {
		super(id, nome);
	}
	
	public static void main(String[] args) {
		
		Diretor Rodrigo = new Diretor(1, "Rodrigo");
		Rodrigo.CalcSalarioDiretor(3000);
		
	}
}
