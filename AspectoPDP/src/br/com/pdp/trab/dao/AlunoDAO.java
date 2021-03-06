package br.com.pdp.trab.dao;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
public class AlunoDAO
{   
    Connection Conn;
    Statement Stmt;
    ResultSet RS; 
 	public AlunoDAO()
	{
	  try
      {
        Conn = DriverManager.getConnection("jdbc:mysql://172.17.0.2/pdp","root","admin");
        Stmt = Conn.createStatement();
      }catch(Exception E){ E.printStackTrace();  }  
	}
	
	public boolean inserir(Aluno aluno)
	{   int x = 1;
	
		String query = "insert into aluno values (0,'"+aluno.getNome()+"','"+aluno.getMatricula()+"',"+aluno.getTelefone().getIdTelefone()+")";
  //String query = "insert into aluno values (0,'"+aluno.getNome()+"','"+aluno.getMatricula()+"',1)";
		
		try {	
		x = Stmt.executeUpdate(query);
		
		}catch(Exception E){ E.printStackTrace();  }
		
		if(x == 0 ){ return false; } else { return true; }
				
	}
	
	public boolean apagar(Aluno aluno)				
	{
	    int x = 1;
	
		String query = "delete from aluno where codigo = "+aluno.getIdAluno();
		
		try {	
		x = Stmt.executeUpdate(query);
		
		}catch(Exception E){ E.printStackTrace();  }
		
		if(x == 0 ){ return true; } else { return false; }
	}
	
	public Aluno buscar(int idAluno) 
	{
		String query = "select * from aluno where codigo = "+idAluno;
		Aluno aluno = new Aluno();
		
		try {	
		RS = Stmt.executeQuery(query);
		//RS.next();
		if(RS.next())
		{
		aluno.setIdAluno(RS.getInt(1));
		aluno.setNome(RS.getString(2));
		aluno.setMatricula(RS.getString(3));
		Telefone fone = new Telefone();
		fone.setIdTelefone(RS.getInt(4));
		aluno.setTelefone(fone); 
		}
		}catch(Exception E){ E.printStackTrace();  }
		
		return aluno;
		
	}
	
	public List<Aluno> buscarTodos() 
	{
		String query = "select * from aluno";
		List<Aluno> alunos = new ArrayList<Aluno>();
		Aluno aluno;
		
		try {	
		RS = Stmt.executeQuery(query);
		while(RS.next())
		{
			aluno = new Aluno();		
		    aluno.setIdAluno(RS.getInt(1));
		    aluno.setNome(RS.getString(2));
		    aluno.setMatricula(RS.getString(3));
		    Telefone fone = new Telefone();
		    fone.setIdTelefone(RS.getInt(4));
		    aluno.setTelefone(fone); 
		    	
		    alunos.add(aluno);	
		}
		}catch(Exception E){ E.printStackTrace();  }
		
		return alunos;
		
	}
	
	public boolean alterar(Aluno aluno)
	{   int x = 1;
	
		String query = "UPDATE aluno SET nome = '"+aluno.getNome()+"', matricula = '"+aluno.getMatricula()+"', codfone = "+aluno.getTelefone().getIdTelefone()+" WHERE codigo = "+aluno.getIdAluno()+"";		
		try {	
		x = Stmt.executeUpdate(query);
		
		}catch(Exception E){ E.printStackTrace();  }
		
		if(x == 0 ){ return true; } else { return false; }
				
	}
	
}