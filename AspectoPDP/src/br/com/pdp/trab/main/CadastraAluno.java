package br.com.pdp.trab.main;

import br.com.pdp.trab.dao.Aluno;
import br.com.pdp.trab.dao.AlunoDAO;
import br.com.pdp.trab.dao.Telefone;

public class CadastraAluno{
	
	public static void main(String[] args)
	{
		 Aluno aluno = new Aluno();
		Telefone fone = new Telefone();
		 
		 aluno.setNome("Luiz Carlos Silva");
		 aluno.setMatricula("AC102012");
		 
		 fone.setIdTelefone(2);
		 
		 aluno.setTelefone(fone);		 
		 AlunoDAO dao = new AlunoDAO();
		 
		if(dao.inserir(aluno))
			System.out.println("Gravou");
			else
			System.out.println("N�o Gravou");	 
	}
}