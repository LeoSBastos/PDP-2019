package persistence;

public aspect Persistence{
	pointcut save() : call (* Pessoa.salvar(..));
	pointcut setNome() : set (* Pessoa.nome);
	pointcut getNome() : get (* Pessoa.nome);
	after (Pessoa p) : save() && target(p)
	{
		System.out.println("insert into pessoa values ('','"+p.getNome()+"')");
	}
	
	after (Pessoa p) : setNome() && target(p)
	{
		if(p.getNome().equals(""))
		{
			System.out.println ("Valor para nome dever diferente de vazio");
		}else
		{
			System.out.println ("Valor adequado");
		}
	}

	before() : getNome() 
	{
			System.out.print ("O atributo nome possui o seguinte valor : ");
	}
}