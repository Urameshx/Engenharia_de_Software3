package controller;

import java.sql.SQLException;
import java.util.List;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Imovel;
import persistence.ImovelDAO;

public class ImovelController implements IImovelController{

	private TextField tfidImovel;
	private TextField tfEnderecoImov;
	private TextField tfNmrQrts;
	private TextField tfNmrVagas;
	private TextArea taListaImoveis;
	
	
	public ImovelController(TextField tfidImovel, TextField tfEnderecoImov,TextField
			tfNmrQrts,TextField tfNmrVagas, TextArea taListaImoveis) {
		this.tfidImovel = tfidImovel;
		this.tfEnderecoImov = tfEnderecoImov;
		this.taListaImoveis = taListaImoveis;
		this.tfNmrQrts = tfNmrQrts;
		this.tfNmrVagas = tfNmrVagas;
	
	}
	
	@Override
	public void inserirImovel(Imovel i) throws ClassNotFoundException, SQLException {
		ImovelDAO iDAO = new ImovelDAO(); 
		iDAO.insereImovel(i);
		limpaCamposImovel();
		buscarImoveis();
	}

	@Override
	public void atualizarImovel(Imovel i) throws ClassNotFoundException, SQLException {
		ImovelDAO iDAO = new ImovelDAO(); 
		iDAO.atualizaImovel(i);
		limpaCamposImovel();
		buscarImoveis();
	}

	@Override
	public void excluirImovel(Imovel i) throws ClassNotFoundException, SQLException {
		ImovelDAO iDAO = new ImovelDAO(); 
		iDAO.excluiImovel(i);
		limpaCamposImovel();
		buscarImoveis();
	}

	@Override
	public void buscarImovel(Imovel i) throws ClassNotFoundException, SQLException {
		limpaCamposImovel();
		
		ImovelDAO iDAO = new ImovelDAO(); 
		iDAO.buscarImovel(i);
		
		tfidImovel.setText(String.valueOf(i.getCodigo()));
		tfEnderecoImov.setText(i.getEndereco());
		tfNmrQrts.setText(String.valueOf(i.getQuartos()));
		tfNmrVagas.setText(String.valueOf(i.getVagas()));
	}

	@Override
	public void buscarImoveis() throws ClassNotFoundException, SQLException {
		limpaCamposImovel();
		taListaImoveis.setText("");
		
		ImovelDAO iDAO = new ImovelDAO();
		List<Imovel> listaImoveis = iDAO.buscarImoveis();
		 
		StringBuffer buffer = new StringBuffer("Codigo\t\t\t\tEndereco\t\t\tQuartos\t\t\tVagas\n");
		for (Imovel i : listaImoveis) {
			buffer.append(i.getCodigo()+"\t\t\t\t\t"+i.getEndereco()+"\t\t\t\t"+i.getQuartos()+"\t\t\t\t"
					+i.getVagas()+"\n");
		}
		
		taListaImoveis.setText(buffer.toString());
	}
	
	private void limpaCamposImovel() {
		tfidImovel.setText("");
		tfEnderecoImov.setText("");
		tfNmrQrts.setText("");
		tfNmrVagas.setText("");
	}
	
}
