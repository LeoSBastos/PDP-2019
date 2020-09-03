package br.com.pdp.trab.main;

import br.com.pdp.trab.dao.Aluno;
import br.com.pdp.trab.dao.AlunoDAO;

public class BuscarAluno{
	
	public static void main(String[] args)
	{
		 Aluno aluno = new Aluno();
		 AlunoDAO dao = new AlunoDAO();
		
		 aluno = dao.buscar(8);

         System.out.println(aluno.getNome());
         System.out.println(aluno.getMatricula());
	}
}