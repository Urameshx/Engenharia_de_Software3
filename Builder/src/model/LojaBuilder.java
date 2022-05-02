package model;

import java.util.ArrayList;
import java.util.List;

public class LojaBuilder {

    private Loja loja;
    private List<Calçados> calçados = new ArrayList<Calçados>();
    private List<Camisetas> camisetas = new ArrayList<Camisetas>();
    private List<JogosEletronicos> jogoseletr = 
    		new ArrayList<JogosEletronicos>();
    private List<EquipaArmaze> equipaarmaze = new ArrayList<EquipaArmaze>();
    
    public LojaBuilder() {
        this.loja = new Loja();      
    }
    
    public static LojaBuilder builder() {
        return new LojaBuilder();
    }
    
    public LojaBuilder addNome(String nome, String cidade) {
        this.loja.setNome(nome);
        this.loja.setCidade(cidade);
        return this;
    }  

    public LojaBuilder addCalçados(int tamanho, String cor, String marca, double
    		valor, TipoTenis tipo) {
        Calçados cal = new Calçados();
        cal.setCor(cor);
        cal.setMarca(marca);
        cal.setTamanho(tamanho);
        cal.setTipo(tipo);
        cal.setValor(valor);
        return this;
    }
    
    public LojaBuilder addCamisetas(String cor, String marca, double
    		valor, TipoTamanho tipo) {
        Camisetas cam= new Camisetas();
        cam.setCor(cor);
        cam.setMarca(marca);
        cam.setTipo(tipo);
        cam.setValor(valor);
        return this;
    }
    
    public LojaBuilder addJogosEletronicos(String nome, double valor, TipoVideogame tipo) {
        JogosEletronicos jogos = new JogosEletronicos();
        jogos.setNome(nome);
        jogos.setTipo(tipo);
        jogos.setValor(valor);
        return this;
    }
    
    public LojaBuilder addEquipaArmaze(String capacidade, String fabricante, 
    		double valor, TipoArmaze tipo) {
        EquipaArmaze equip = new EquipaArmaze();
        equip.setCapacidade(capacidade);
        equip.setFabricante(fabricante);
        equip.setTipo(tipo);
        equip.setValor(valor);
        return this;
    }
    
    public Loja get() {
    	this.loja.setCalçados(this.calçados);
        this.loja.setCamisetas(this.camisetas);
        this.loja.setEquipaarmaze(this.equipaarmaze);
        this.loja.setJogoseletr(this.jogoseletr);
        return this.loja;
    }
}
