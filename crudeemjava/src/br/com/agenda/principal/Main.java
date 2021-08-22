package br.com.agenda.principal;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {

		ContatoDAO contatoDao = new ContatoDAO();

		Contato contato = new Contato();

		contato.setNome("João Cabral de Melo Neto");

		contato.setIdade(26);

		contato.setDataCadastro(new Date());

		//contatoDAO.save(contato);

		// Atualizar o contato adicionando um nome de casamento a mais
		Contato contato2 = new Contato();
		
		contato2.setNome("Fernandinho Beira Mar Casou De novo");
		
		contato2.setIdade(55);
		
		contato2.setDataCadastro(new Date());
		
		contato2.setId(1); // Esse ID referece ao registro que quero atualizar no banco
		
		contatoDao.update(contato2);
		
		
		//Deletar o contato pelo seu número de ID
        contatoDao.deleteById(4);		
		
		
		
        // Selecionar os dados do Banco
		for (Contato c : contatoDao.getContatos()) {

			System.out.println("Contatos : " + c.getId() + " " + " " + c.getNome() + " " + " " + c.getIdade() + " "
					+ c.getDataCadastro());
		}
	}

}
