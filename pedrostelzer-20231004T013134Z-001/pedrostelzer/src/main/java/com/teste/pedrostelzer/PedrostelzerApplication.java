package com.teste.pedrostelzer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PedrostelzerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PedrostelzerApplication.class, args);
	}
	DadosDAO dadosDAO = new DadosDAO();


	Projeto projeto = new Projeto();
	projeto.setNome("Projeto 1");
	projeto.setDataCriacao(new Date());
	dadosDAO.criarProjeto(projeto);

	Funcionario funcionario = new Funcionario();
	funcionario.setNome("pedro stelzer");
	funcionario.setCpf("21312312312");
	funcionario.setEmail("pedrostelzer@email.com");
	funcionario.setSalario(3000.00);
	dadosDAO.criarFuncionario(funcionario);

	List<Projeto> projetos = dadosDAO.lerProjetos();
	List<Funcionario> funcionarios = dadosDAO.lerFuncionarios();

	System.out.println("Pojetos: ");
	for (Projeto p : projetos){
		System.out.println("Nome "+ p.getNome + ", Data de Criação " + p.getDataCriacao);
	}
	System.out.println("funcionarios: ");
	for (Funcionarios f : funcionarios){
		System.out.println("Nome: " + f.getNome() + ", CPF: " + f.getCpf() + ", Email: " + f.getEmail() + ", Salário: " + f.getSalario());
	} 
	projeto.setNome("NovoNomeProjeto");
	dadosDAO.atualizarProjeto(projeto);

	funcionario.setNome("NovoNomeFuncionario");
	dadosDAO.atualizarFuncionario(funcionario);

	dadosDAO.deletarProjeto(projeto.getNome());
	dadosDAO.deletarFuncionario(funcionario.getCpf());
}