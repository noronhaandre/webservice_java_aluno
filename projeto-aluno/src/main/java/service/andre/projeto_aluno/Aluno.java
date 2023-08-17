package service.andre.projeto_aluno;

public class Aluno {
	private int id;
	private String nome;
	private String email;
	private int ciclo;
	private String cidade;
	public Aluno(int id, String nome, String email, int ciclo, String cidade) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.ciclo = ciclo;
		this.cidade = cidade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getCiclo() {
		return ciclo;
	}
	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	

}
