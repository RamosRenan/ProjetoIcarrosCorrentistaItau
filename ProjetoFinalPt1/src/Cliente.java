import lombok.Data;

@Data
public class Cliente {
	
	private String ag;
	private String nome;
	private String email;
	private String telefone;
	private String conta;
	private String saldo;
	
	@Override
	public String toString() {		
		String obj = (this.ag + "," + this.conta + "," + this.email + "," + this.nome + "," + this.saldo + "," + this.telefone);
		return obj;		
	}
	
	public String getAg() {
		return ag;
	}
	public void setAg(String ag) {
		this.ag = ag;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getSaldo() {
		return saldo;
	}
	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}
	
}