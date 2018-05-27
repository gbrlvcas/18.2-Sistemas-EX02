package codigo;

import java.util.ArrayList;

public class Cadastro {
	
	//Atributos
	private String usuario;
	private String senha;
	private String grupo;
	
	//Métodos mágicos
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	//ArrayList
	public static ArrayList<Cadastro> dados = new ArrayList<>();

}
