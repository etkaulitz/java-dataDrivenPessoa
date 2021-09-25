package dataDrivenPessoa;

public class DataDrivenPessoa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Joao");
		p1.setEndereco("Rua A");
		p1.setTelefone("33221144");
		p1.setIdade(20);
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Maria");
		p2.setEndereco("Rua B");
		p2.setTelefone("35558899");
		p2.setIdade(30);
		
		//imprimirPessoa(p1);
		//imprimirPessoa(p2);
		
		CadastraPessoa cadastro = new CadastraPessoa();
		
		cadastro.addPessoa(p1);
		cadastro.imprimirPessoa();
		
		cadastro.addPessoa(p2);
		cadastro.imprimirPessoa();
		
	}

}