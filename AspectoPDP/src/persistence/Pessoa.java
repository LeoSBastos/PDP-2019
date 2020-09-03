package persistence;

public class Pessoa {
	
	
	private String nome;
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getNome()
	{
		return this.nome;
	}

	void salvar() 
	{
		// implementado no aspect
	}
}
