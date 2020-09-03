package br.com.pdp.trab.main;

import br.com.pdp.trab.dao.Aluno;
import br.com.pdp.trab.dao.AlunoDAO;

public class ApagarAluno{
	
	public static void main(String[] args)
	{
		 Aluno aluno = new Aluno();
		 aluno.setIdAluno(8);
		 
		 
		 AlunoDAO dao = new AlunoDAO();
		
		 dao.apagar(aluno);
	}
}