package br.com.pdp.trab.main;

import br.com.pdp.trab.dao.Aluno;
import br.com.pdp.trab.dao.AlunoDAO;

public class AlterarAluno
{
	public static void main(String[] args)
	{
		AlunoDAO dao = new AlunoDAO();
		Aluno aluno = new Aluno();
		
		aluno = dao.buscar(2);
		System.out.println(aluno.getNome());
		//aluno.setIdAluno(5);
		aluno.setNome("Joao de Alencar de Souza");
		aluno.setMatricula("ABC");
		
		dao.alterar(aluno);
		System.out.println(aluno.getNome());
	}
}