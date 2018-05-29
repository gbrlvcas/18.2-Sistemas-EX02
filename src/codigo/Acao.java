package codigo;

import javax.swing.JOptionPane;

import interfaceGrafica.Login;
import interfaceGrafica.Principal_Administrador;

public class Acao {
	
	//Método
	public int validaLogin(String login, String senha) {
		
		//Variaveis
		int tipoLogin;
		
		
		
		//Validando
		if(login.equals("admin") && senha.equals("admin")) {
			tipoLogin = 0;
				
		}else{
			tipoLogin = 2;
		}
		
		//Retornar valor
		return tipoLogin;
		
		
	}
}
