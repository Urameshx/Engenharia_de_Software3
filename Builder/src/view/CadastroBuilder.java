package view;

import model.Loja;
import model.LojaBuilder;
import model.TipoArmaze;
import model.TipoTamanho;
import model.TipoTenis;
import model.TipoVideogame;

public class CadastroBuilder {

	public static void main(String[] args) {
        Loja loja = LojaBuilder.builder()
                .addNome("Maxim", "Sao Paulo")
                .addCal�ados(40, "preto","nike", 700, TipoTenis.tenis)
                .addCal�ados(44, "branco","adidas", 650, TipoTenis.tenis)
                .addCal�ados(36, "preto","renner", 650, TipoTenis.social)
                .addCamisetas("branca", "nike", 100, TipoTamanho.G)
                .addJogosEletronicos("Elden Ring", 200,
                		TipoVideogame.Playstation)
                .addEquipaArmaze("1TB", "XPG", 250, TipoArmaze.NVMe)
                .get();

        System.out.println(loja.toString());
	}

}
