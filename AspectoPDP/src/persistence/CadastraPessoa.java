package persistence;

public class CadastraPessoa {
	
	public static void main(String[] args)
	{
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Teste");
		System.out.println(pessoa.getNome());
		pessoa.salvar();
	}

}
