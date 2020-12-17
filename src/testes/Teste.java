package testes;

import funcionario.Funcionario;
import core.*;

public class Teste {

    public static void main(String[] args) throws Exception {

    	Metodos_Funcionario service = new Metodos_Funcionario();
        
        // popular o cadastro de funcionarios
        Funcionario p1 = new Funcionario(1, "BlaBla", "Bla", "Blabla bla", 1200.00);
        Funcionario p2 = new Funcionario(1, "BleBle", "Ble", "Blable ble", 1500.00);
        Funcionario p3 = new Funcionario(1, "BloBlo", "Blo", "Bloblo blo", 2000.00);
        service.Create(p1);
        service.Create(p2);
        service.Create(p3);
        
        // listar funcionarios
        System.out.print("-----------------\n Funcionarios no cadastro: ");
        System.out.println(service.GetQuantity());
        for (Funcionario pe : service.GetAll()){
            System.out.println(pe);
        }
        
        // alterar os dados de um Funcuonario
        System.out.println("-----------------\n alterando nome de p3: ");
        p3.setNome("Funcionario Alterado 1");
        p3.setFuncao("Autor Desconhecido");
        service.Update(p3);
        System.out.println("novos dados: " + p3);
                
        // teste de busca
        Funcionario p = service.GetById(2);
        System.out.println("-----------------\n buscando Funcionario n2: " + p);
        
        // excluir
        service.DeleteById(2);;
        System.out.print("-----------------\n Funcionarios no cadastro apos exclusao de um Funcionario: \n");
        System.out.println(service.GetAll());
        
        //mudar setor
        service.MudarSetor(1, "NovoSetor");
        Funcionario pe = service.GetById(1);
        System.out.println("-----------------\n"+pe+"\n-----------------\n");
        
        //Reajuste salario (inflacao em porcentagem = 4,31% no ano de 2019)
        service.ReajustarSalario(4.31);
        System.out.println(service.GetAll());
        
      //Utilizando o arquivo de texto para armazenar dados
        ManipuladorArquivos.criaArquivo("funcionario.txt");
        Funcionario erick = new Funcionario(0001, "Erick Baron", "Setor 1", "Analista Dev", 3000.00);
        ManipuladorArquivos.gravaFuncionario("funcionario.txt", erick);
    	
    	Funcionario arquivoLido = ManipuladorArquivos.lerFuncionario("funcionario.txt");
    	System.out.println("\n----------------- Teste gravação em arquivo ----------");
    	System.out.println(arquivoLido);
    	System.out.println("-----------------\n");
    }
}