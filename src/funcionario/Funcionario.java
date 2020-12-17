package funcionario;

public class Funcionario {
	
	private int id;
    private String nome;
    private String setor;
    private String funcao;    
    private double salario;
    private boolean demitido;    
    
    public Funcionario(){};
    
    public Funcionario(int id, String nome, String setor, String funcao, double salario) {
    	this.id = id;
    	this.nome = nome;
    	this.setor = setor;
    	this.funcao = funcao;
    	this.salario = salario;
    	this.demitido = false;
    }    
    
    public void setId(int id) {
    	this.id = id;
    }
    public void setNome(String nome) {
    	this.nome = nome;
    }
    public void setSetor(String setor) {
    	this.setor = setor;
    }
    public void setFuncao(String funcao) {
    	this.funcao = funcao;
    }
    public void setSalario(double salario) {
    	this.salario = salario;
    }
    public void setDemitido(boolean demitido) {
    	this.demitido = demitido;
    }
    
    public int getId() { return this.id; }
    public String getNome() { return this.nome; }
    public String getSetor() { return this.setor; }
    public String getFuncao() { return this.funcao; }
    public double getSalario() { return this.salario; }
    public boolean getDemitidoAsBool() {
    	return this.demitido;
    }
    public String getDemitido() {
    	if(demitido) {
    		return "Demitido";
    	}
    	else
    		return "Contratado";
    }
    
    public String toString() {
    	return  id + ";  " + nome + "; " + setor + "; " + funcao +
    			"; "+ salario + "; "
    			+ getDemitidoAsBool();
    }
}
