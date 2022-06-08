package br.com.poo.sumula;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Jogador implements ActionListener  {

	private String numero;
	private Integer pontos;
	private Integer faltas;
	private String nome;
	private boolean expulso;
	JLabel labelNome = new JLabel();
	private JFrame criaJogador = new JFrame("Jogador");
	JButton confirma  = new JButton("Confirma");
	Formatador formatador = new Formatador();
	JFormattedTextField numText = new JFormattedTextField(formatador);
	JTextField nomeText = new JTextField(); 
	
	Jogador(String numero, String nome ){
		this.numero = numero;
		this.nome = nome;
		this.numText.addActionListener(this);
		this.confirma.addActionListener(this);
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getNumero() {
		return numero;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== this.numText) {
			Container container = criaJogador.getContentPane();
			container.setLayout(null);
			
			JLabel logo = new JLabel("Informe Sobre o Jogador : ");
			logo.setBounds(60,5,250,30);
			
			JLabel nomeLabel = new JLabel("Nome :");
			nomeLabel.setBounds(20,60,250,30);
			
			nomeText.setBounds(75, 60, 250, 30);

			confirma.setBounds(150,100,100,30);
			
			container.add(logo);
			container.add(nomeLabel); 
			container.add(numText);
			container.add(nomeText); 
			container.add(confirma);
			criaJogador.setVisible(true);
			
			criaJogador.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			criaJogador.setBounds(200, 100, 400, 200);
		}
		if (e.getSource()== confirma) {
			String nome = nomeText.getText();
			String numero = numText.getText();
			
			labelNome.setText(nome);
			
		}
		
	}
}


