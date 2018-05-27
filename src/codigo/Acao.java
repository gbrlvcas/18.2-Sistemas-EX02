package codigo;

import javax.swing.JOptionPane;

import interfaceGrafica.Login;
import interfaceGrafica.Principal_Administrador;

public class Acao {
	
	//Método
	public int validaLogin(String login, String senha) {
		
		//Variaveis
		int tipoLogin;
		
		//Instanciando [Classes: Login & Principal_Administrador]
		Login l = new Login();
		Principal_Administrador PADM = new Principal_Administrador();
		
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
