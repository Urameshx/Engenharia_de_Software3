package model;

public class FuncionarioTempoIntegral extends Funcionario {

	private int bancoHoras;

	public int getBancoHoras() {
		return bancoHoras;
	}

	public void setBancoHoras(int bancoHoras) {
		this.bancoHoras = bancoHoras;
	}

	@Override
	public String toString() {
		return "FuncionarioTemporalIntegral [bancoHoras=" + bancoHoras +
				", Id=" + getId() + ", Nome=" + getNome() + 
				", Salario=" + getSalario() + "]";
	}
	
}
