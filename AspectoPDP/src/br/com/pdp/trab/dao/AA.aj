package br.com.pdp.trab.dao;

import java.util.regex.Pattern;

public aspect AA {
	pointcut setIdAluno() : set (* Aluno.idAluno);
	pointcut setNome() : set (* Aluno.nome);
	pointcut setMatricula() : set (* Aluno.matricula);
	pointcut setTelefone() : set (* Aluno.fone);
	pointcut getIdAluno() : get (* Aluno.idAluno);
	pointcut getNome() : get (* Aluno.nome);
	pointcut getMatricula() : get (* Aluno.matricula);
	pointcut getTelefone() : get (* Aluno.fone);
	pointcut inserir() : call (* AlunoDAO.inserir(..));
	pointcut apagar() : call (* AlunoDAO.apagar(..));
	pointcut buscar() : call (* AlunoDAO.buscar(..));
	pointcut buscarTodos() : call (* AlunoDAO.buscarTodos(..));
	pointcut alterar() : call (* AlunoDAO.alterar(..));

	after (Aluno a) : setMatricula() && target(a)
	{
		if(a.getMatricula().equals("")) {
			System.out.println("Valor para matricula não adequado");
		}
		else {
			System.out.println("Valor adequado");
		}
	}
	
	after (Aluno a) : setNome() && target(a)
	{
		if(a.getNome().equals("") || Pattern.compile("[0-9]").matcher(a.getNome()).find()) {
			System.out.println("Valor para matricula não adequado");
		}
		else {
			System.out.println("Valor adequado");
		}
	}
	
}
