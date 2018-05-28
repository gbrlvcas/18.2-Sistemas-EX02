package interfaceGrafica;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.JTextArea;

public class Principal_Administrador extends JFrame {

	private JPanel principalAdministrador;
	private JTextField txtNovoUsuario;
	private JPasswordField txtNovaSenha;
	private JPasswordField txtConfirmaSenha;
	private JTextField txtNomeUsuario;
	private JTextField txtResultadoCadastro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal_Administrador frame = new Principal_Administrador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal_Administrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 403);
		principalAdministrador = new JPanel();
		principalAdministrador.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(principalAdministrador);
		principalAdministrador.setLayout(null);
		
		JPanel pnlCadastro = new JPanel();
		pnlCadastro.setVisible(false);
		pnlCadastro.setBounds(15, 75, 664, 272);
		principalAdministrador.add(pnlCadastro);
		pnlCadastro.setLayout(null);
		
		JLabel lblCadastroInfo = new JLabel("Menu de cadastro de usuarios");
		lblCadastroInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroInfo.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblCadastroInfo.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblCadastroInfo.setOpaque(true);
		lblCadastroInfo.setForeground(Color.WHITE);
		lblCadastroInfo.setBackground(Color.GRAY);
		lblCadastroInfo.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblCadastroInfo.setBounds(0, 0, 664, 25);
		pnlCadastro.add(lblCadastroInfo);
		
		JLabel lblNovoUsuario = new JLabel("Novo usuario");
		lblNovoUsuario.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNovoUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblNovoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNovoUsuario.setBounds(15, 41, 145, 25);
		pnlCadastro.add(lblNovoUsuario);
		
		txtNovoUsuario = new JTextField();
		txtNovoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNovoUsuario.setBounds(15, 76, 146, 26);
		pnlCadastro.add(txtNovoUsuario);
		txtNovoUsuario.setColumns(10);
		
		JLabel lblNovaSena = new JLabel("Senha");
		lblNovaSena.setHorizontalAlignment(SwingConstants.CENTER);
		lblNovaSena.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNovaSena.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNovaSena.setBounds(15, 118, 145, 25);
		pnlCadastro.add(lblNovaSena);
		
		txtNovaSenha = new JPasswordField();
		txtNovaSenha.setBounds(15, 153, 145, 26);
		pnlCadastro.add(txtNovaSenha);
		
		JLabel lblConfirmaSenha = new JLabel("Confirma senha");
		lblConfirmaSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirmaSenha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblConfirmaSenha.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblConfirmaSenha.setBounds(14, 195, 145, 25);
		pnlCadastro.add(lblConfirmaSenha);
		
		txtConfirmaSenha = new JPasswordField();
		txtConfirmaSenha.setBounds(15, 230, 145, 26);
		pnlCadastro.add(txtConfirmaSenha);
		
		JLabel lblNomeUsuario = new JLabel("Nome funcionario");
		lblNomeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNomeUsuario.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNomeUsuario.setBounds(192, 41, 145, 25);
		pnlCadastro.add(lblNomeUsuario);
		
		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNomeUsuario.setColumns(10);
		txtNomeUsuario.setBounds(192, 76, 146, 26);
		pnlCadastro.add(txtNomeUsuario);
		
		JLabel lblNivelAcesso = new JLabel("Nivel de acesso");
		lblNivelAcesso.setHorizontalAlignment(SwingConstants.CENTER);
		lblNivelAcesso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNivelAcesso.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNivelAcesso.setBounds(192, 118, 145, 25);
		pnlCadastro.add(lblNivelAcesso);
		
		JComboBox comboNivelAcesso = new JComboBox();
		comboNivelAcesso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboNivelAcesso.setBounds(192, 154, 145, 26);
		pnlCadastro.add(comboNivelAcesso);
		//Adicionando itens ao Combobox
		comboNivelAcesso.addItem("");
		comboNivelAcesso.addItem("Administrador");
		comboNivelAcesso.addItem("Repositor");
		
		JButton btnCadastrarUsuario = new JButton("Cadastrar");
		btnCadastrarUsuario.setBorder(new LineBorder(Color.DARK_GRAY, 2, true));
		btnCadastrarUsuario.setForeground(Color.WHITE);
		btnCadastrarUsuario.setBackground(SystemColor.windowBorder);
		btnCadastrarUsuario.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCadastrarUsuario.addActionListener(new ActionListener() {
			
			//Função do botão cadastrar
			public void actionPerformed(ActionEvent arg0) {
				
				//Variaveis
				String novoUsuario = txtNovoUsuario.getText().toString();
				String novaSenha = new String (txtNovaSenha.getPassword());
				String confirmaSenha = new String (txtConfirmaSenha.getPassword());
				String nomeFuncionario = txtNomeUsuario.getText().toString();
				String nivelAcesso = comboNivelAcesso.getSelectedItem().toString();
				
			}
			
		});
		btnCadastrarUsuario.setBounds(191, 194, 146, 62);
		pnlCadastro.add(btnCadastrarUsuario);
		
		JButton btnNovoCadastro = new JButton("Novo Cadastro");
		btnNovoCadastro.setVisible(false);
		btnNovoCadastro.setForeground(Color.WHITE);
		btnNovoCadastro.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNovoCadastro.setBorder(new LineBorder(Color.DARK_GRAY, 2, true));
		btnNovoCadastro.setBackground(SystemColor.windowBorder);
		btnNovoCadastro.setBounds(191, 194, 146, 62);
		pnlCadastro.add(btnNovoCadastro);
		
		txtResultadoCadastro = new JTextField();
		txtResultadoCadastro.setBorder(new LineBorder(Color.DARK_GRAY));
		txtResultadoCadastro.setEditable(false);
		txtResultadoCadastro.setBounds(365, 41, 284, 174);
		pnlCadastro.add(txtResultadoCadastro);
		txtResultadoCadastro.setColumns(10);
		
		JButton btnSairCadastro = new JButton("Sair");
		btnSairCadastro.addActionListener(new ActionListener() {
			
			//Função do botão Sair [Cadastrar]
			public void actionPerformed(ActionEvent e) {
				pnlCadastro.setVisible(false);
	
			}
		});
		
		btnSairCadastro.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		btnSairCadastro.setForeground(Color.WHITE);
		btnSairCadastro.setBackground(Color.GRAY);
		btnSairCadastro.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSairCadastro.setBounds(448, 222, 115, 43);
		pnlCadastro.add(btnSairCadastro);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			
			//Função do botão cadastrar
			public void actionPerformed(ActionEvent e) {
				
				pnlCadastro.setVisible(true);
				
				
			}
		});
		
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setBackground(Color.DARK_GRAY);
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCadastrar.setBounds(15, 16, 132, 43);
		principalAdministrador.add(btnCadastrar);
		
		JLabel Background = new JLabel("");
		Background.setForeground(Color.WHITE);
		Background.setFont(new Font("Tahoma", Font.BOLD, 18));
		Background.setIcon(new ImageIcon(getClass().getResource("/Sistema.gif")));
		Background.setBounds(-50, -50, 1100, 582);
		principalAdministrador.add(Background);
	}
}
