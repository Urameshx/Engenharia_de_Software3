package controller;

import java.sql.SQLException;
import java.util.List;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Corretor;
import persistence.CorretorDAO;


public class CorretorController implements ICorretorController{

	private TextField tfidCorretor;
	private TextField tfNomeCorretor ;
	private TextField tfRegiaoCorretor;
	private TextArea taListaCorretor;
	
	
	public CorretorController(TextField tfidCorretor, TextField tfNomeCorretor,TextField
			tfRegiaoCorretor, TextArea taListaCorretor) {
		this.tfidCorretor= tfidCorretor;
		this.tfNomeCorretor = tfNomeCorretor;
		this.taListaCorretor = taListaCorretor;
		this.tfRegiaoCorretor = tfRegiaoCorretor;
		
	
	}
	
	@Override
	public void inserirCorretor(Corretor c) throws ClassNotFoundException, SQLException {
		CorretorDAO cDAO = new CorretorDAO(); 
		cDAO.insereCorretor(c);
		limpaCamposCorretor();
		buscarCorretores();
	}

	@Override
	public void atualizarCorretor(Corretor c) throws ClassNotFoundException, SQLException {
		CorretorDAO cDAO = new CorretorDAO(); 
		cDAO.atualizaCorretor(c);
		limpaCamposCorretor();
		buscarCorretores();
	}

	@Override
	public void excluirCorretor(Corretor c) throws ClassNotFoundException, SQLException {
		CorretorDAO cDAO = new CorretorDAO(); 
		cDAO.excluiCorretor(c);
		limpaCamposCorretor();
		buscarCorretores();
	}

	@Override
	public void buscarCorretor(Corretor c) throws ClassNotFoundException, SQLException {
		limpaCamposCorretor();
		
		CorretorDAO cDAO = new CorretorDAO(); 
		cDAO.buscarCorretor(c);
		
		tfidCorretor.setText(c.getCreci());
		tfNomeCorretor.setText(c.getNome());
		tfRegiaoCorretor.setText(c.getRegiao());
	}

	@Override
	public void buscarCorretores() throws ClassNotFoundException, SQLException {
		limpaCamposCorretor();
		taListaCorretor.setText("");
		
		CorretorDAO cDAO = new CorretorDAO();
		List<Corretor> listaCorretores = cDAO.buscarCorretores();
		 
		StringBuffer buffer = new StringBuffer("Creci\t\t\t\tNome\t\t\tRegiao\n");
		for (Corretor c : listaCorretores) {
			buffer.append(c.getCreci()+"\t\t\t\t\t"+c.getNome()+"\t\t\t\t"+c.getRegiao()+"\n");
		}
		
		taListaCorretor.setText(buffer.toString());
	}
	
	private void limpaCamposCorretor() {
		tfidCorretor.setText("");
		tfNomeCorretor.setText("");
		tfRegiaoCorretor.setText("");
	}

}
