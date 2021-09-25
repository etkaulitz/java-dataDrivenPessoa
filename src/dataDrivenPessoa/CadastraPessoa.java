package dataDrivenPessoa;

import java.awt.List;
import java.util.ArrayList;

public class CadastraPessoa {

	ArrayList<Pessoa> pessoas = new ArrayList<>();
	
	public void addPessoa(Pessoa p) {
		pessoas.add(p);
	}
	
	public void imprimirPessoa() {
		for(int i =0; i < pessoas.size(); i++) {
		System.out.println(pessoas.get(i).getNome() + "\n");
		}
	}
}

