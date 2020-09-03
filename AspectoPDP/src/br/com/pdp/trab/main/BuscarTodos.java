package br.com.pdp.trab.main;

import java.util.List;

import br.com.pdp.trab.dao.Aluno;
import br.com.pdp.trab.dao.AlunoDAO;

import java.util.ArrayList;
public class BuscarTodos{
	
	public static void main(String[] args)
	{
		 List<Aluno> alunos = new ArrayList<Aluno>();
		 AlunoDAO dao = new AlunoDAO();
		
		 alunos = dao.buscarTodos();
		 
		 for(Aluno aluno : alunos)
		 {
		 System.out.print(aluno.getIdAluno());
		 System.out.print(" - ");	
         System.out.print(aluno.getNome());
         System.out.print(" - ");         
         System.out.println(aluno.getMatricula());
		 }
	}
}