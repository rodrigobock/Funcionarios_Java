package core;

import java.util.ArrayList;

import funcionario.Funcionario;

public class Metodos_Funcionario {

    static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public ArrayList<Funcionario> GetAll() { return funcionarios; }
    
    public int GetQuantity() { return funcionarios.size(); }
    
    public void Create(Funcionario novo) { 
        int maiorId = 0;
        for (Funcionario p : funcionarios) { 
            if (p.getId() > maiorId) { 
                maiorId = p.getId(); 
            }
        }
        novo.setId(maiorId + 1);
        funcionarios.add(novo); 
    }
    
    public void DeleteById(int id) throws Exception {
    	Funcionario p = GetById(id);
    	funcionarios.remove(p);
    }
    
    public Funcionario GetById(int id_procurado) throws Exception { 
        for (Funcionario pe : funcionarios) {
            if (pe.getId() == id_procurado) {
                return pe;
            }
        }
        throw new Exception("Nao encontrado");
    } 

    public void Update(Funcionario p) {
        int ondeMudar = -1;
        for (int i = 0; i < GetQuantity(); i++) {
            if (funcionarios.get(i).getId() == p.getId()) {
                ondeMudar = i;
                break;
            }
        }
        if (ondeMudar >= 0) {
        	funcionarios.set(ondeMudar, p);
        }
    }
    
    public void MudarSetor(int id, String setor) {
    	Funcionario p = funcionarios.get(id);
    	p.setSetor(setor);
    }
    
    public void ReajustarSalario(double inflacao) {
    	for (Funcionario p : funcionarios) {
			p.setSalario(p.getSalario() + (p.getSalario() * (inflacao / 100)));
		};
    }
}

