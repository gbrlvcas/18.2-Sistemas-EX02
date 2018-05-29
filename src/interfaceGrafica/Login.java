package interfaceGrafica;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import codigo.Acao;
import javax.swing.JInternalFrame;

public class Login extends JFrame {
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	private JPanel telaLogin;



	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		telaLogin = new JPanel();
		telaLogin.setName("Mercado\r\n");
		telaLogin.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(telaLogin);
		setLocationRelativeTo(null);
		telaLogin.setLayout(null);
		
		
//Painel [Caso cliente erro os dados de login] =====================================================================================================
		
		JPanel cxErro = new JPanel();
		cxErro.setVisible(false);
		cxErro.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cxErro.setBounds(91, 73, 245, 97);
		telaLogin.add(cxErro);
		cxErro.setLayout(null);
		
		JLabel lblErro = new JLabel("Usuario ou senha incorreto");
		lblErro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblErro.setBounds(15, 16, 215, 20);
		cxErro.add(lblErro);
		
		JButton btnErro = new JButton("Entendi");
		btnErro.addActionListener(new ActionListener() {
			
			//Ação do botão
			public void actionPerformed(ActionEvent arg0) {
				cxErro.setVisible(false);
				txtLogin.setText("");
				txtSenha.setText("");
			}
		});
		btnErro.setBorder(new LineBorder(Color.GRAY, 1, true));
		btnErro.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnErro.setBounds(72, 52, 101, 29);
		cxErro.add(btnErro);
		
		
		
//Painel de login ==================================================================================================================================
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblLogin.setOpaque(true);
		lblLogin.setBackground(Color.WHITE);
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Calibri", Font.BOLD, 18));
		lblLogin.setBounds(141, 38, 146, 26);
		telaLogin.add(lblLogin);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(141, 73, 146, 26);
		telaLogin.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblSenha.setBackground(Color.WHITE);
		lblSenha.setOpaque(true);
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setFont(new Font("Calibri", Font.BOLD, 18));
		lblSenha.setBounds(141, 115, 146, 26);
		telaLogin.add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(141, 147, 146, 26);
		telaLogin.add(txtSenha);
		
		
//Botão para Logar =================================================================================================================================
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Instanciando [Classe: Acao]
				Acao acao = new Acao();
				
				//Capturando os dados digitados
				String login = txtLogin.getText().toString();
				String senha = new String (txtSenha.getPassword());
				
				//Condicional e Instanciando [Método: validaLogin / Classe: Acao]
				if(acao.validaLogin(login, senha) == 0){
					Principal_Administrador PADM = new Principal_Administrador();
					PADM.setVisible(true);
					dispose();
					
				}else if(acao.validaLogin(login, senha) == 2) {
					cxErro.setVisible(true);
		}
				
			}
		});
		
		btnEntrar.setBorder(new LineBorder(new Color(128, 128, 128), 2, true));
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEntrar.setBounds(157, 189, 115, 29);
		telaLogin.add(btnEntrar);
		
//Background ======================================================================================================================================
		
		JLabel Background = new JLabel("");
		Background.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		Background.setIcon(new ImageIcon(getClass().getResource("/Login.gif")));
		Background.setBounds(0, 0, 428, 244);
		telaLogin.add(Background);
	}
}
