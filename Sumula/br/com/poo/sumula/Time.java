package br.com.poo.sumula;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Time {

	 private String nome;
	 private boolean mandante;
	 private ArrayList<Jogador> jogadores  = new ArrayList();
	 JTextField time = new JTextField();
	 Jogador jogador1 = new Jogador("00" , "Jogador");
	 Jogador jogador2 = new Jogador("00" , "Jogador");
	 Jogador jogador3 = new Jogador("00" , "Jogador");
	 Jogador jogador4 = new Jogador("00" , "Jogador");
	 Jogador jogador5 = new Jogador("00", "Jogador");
	
	 Time(boolean mandante){
		 
		  this.mandante = mandante;
		 
		  if(this.mandante) {
			  
			  time.setText(this.nome);
			  time.setBounds(250,100,200,100);
			  time.setHorizontalAlignment(JTextField.CENTER);
			  time.setFont(new Font("Verdana",Font.PLAIN,35));
			  
			  jogador1.numText.setText(jogador1.getNumero().toString());
			  jogador1.numText.setBounds(155,200,90,100);
			  jogador1.numText.setHorizontalAlignment(JTextField.CENTER);
			  jogador1.numText.setFont(new Font("Verdana",Font.PLAIN,35));
			  
			  jogador1.labelNome.setText(jogador1.getNome());
			  jogador1.labelNome.setBounds(250,200,200,100);
			  jogador1.labelNome.setHorizontalAlignment(JTextField.CENTER);
			  jogador1.labelNome.setFont(new Font("Verdana",Font.PLAIN,35));
			  
			  jogador2.numText.setText(jogador2.getNumero().toString());
			  jogador2.numText.setBounds(155,300,90,100);
			  jogador2.numText.setHorizontalAlignment(JTextField.CENTER);
			  jogador2.numText.setFont(new Font("Verdana",Font.PLAIN,35));
			  
			  jogador2.labelNome.setText(jogador2.getNome());
			  jogador2.labelNome.setBounds(250,300,200,100);
			  jogador2.labelNome.setHorizontalAlignment(JTextField.CENTER);
			  jogador2.labelNome.setFont(new Font("Verdana",Font.PLAIN,35));
			  
			  jogador3.numText.setText(jogador3.getNumero().toString());
			  jogador3.numText.setBounds(155,400,90,100);
			  jogador3.numText.setHorizontalAlignment(JTextField.CENTER);
			  jogador3.numText.setFont(new Font("Verdana",Font.PLAIN,35));
			  
			  jogador3.labelNome.setText(jogador3.getNome());
			  jogador3.labelNome.setBounds(250,400,200,100);
			  jogador3.labelNome.setHorizontalAlignment(JTextField.CENTER);
			  jogador3.labelNome.setFont(new Font("Verdana",Font.PLAIN,35));
			  
			  jogador4.numText.setText(jogador4.getNumero().toString());
			  jogador4.numText.setBounds(155,500,90,100);
			  jogador4.numText.setHorizontalAlignment(JTextField.CENTER);
			  jogador4.numText.setFont(new Font("Verdana",Font.PLAIN,35));
			  
			  jogador4.labelNome.setText(jogador4.getNome());
			  jogador4.labelNome.setBounds(250,500,200,100);
			  jogador4.labelNome.setHorizontalAlignment(JTextField.CENTER);
			  jogador4.labelNome.setFont(new Font("Verdana",Font.PLAIN,35));
			  
			  jogador5.numText.setText(jogador5.getNumero().toString());
			  jogador5.numText.setBounds(155,600,90,100);
			  jogador5.numText.setHorizontalAlignment(JTextField.CENTER);
			  jogador5.numText.setFont(new Font("Verdana",Font.PLAIN,35));
			  
			  jogador5.labelNome.setText(jogador5.getNome());
			  jogador5.labelNome.setBounds(250,600,200,100);
			  jogador5.labelNome.setHorizontalAlignment(JTextField.CENTER);
			  jogador5.labelNome.setFont(new Font("Verdana",Font.PLAIN,35));
		  
	  		}
		  
		  else {
			  time.setText(this.nome);
			  time.setBounds(1500,100,200,100);
			  time.setHorizontalAlignment(JTextField.CENTER);
			  time.setFont(new Font("Verdana",Font.PLAIN,35));
			  
			  jogador1.numText.setText(jogador1.getNumero().toString());
			  jogador1.numText.setBounds(1705,200,90,100);
			  jogador1.numText.setHorizontalAlignment(JTextField.CENTER);
			  jogador1.numText.setFont(new Font("Verdana",Font.PLAIN,35));
			  
			  jogador1.labelNome.setText(jogador1.getNome());
			  jogador1.labelNome.setBounds(1500,200,200,100);
			  jogador1.labelNome.setHorizontalAlignment(JTextField.CENTER);
			  jogador1.labelNome.setFont(new Font("Verdana",Font.PLAIN,35));
			  
			  jogador2.numText.setText(jogador2.getNumero().toString());
			  jogador2.numText.setBounds(1705,300,90,100);
			  jogador2.numText.setHorizontalAlignment(JTextField.CENTER);
			  jogador2.numText.setFont(new Font("Verdana",Font.PLAIN,35));
			  
			  jogador2.labelNome.setText(jogador2.getNome());
			  jogador2.labelNome.setBounds(1500,300,200,100);
			  jogador2.labelNome.setHorizontalAlignment(JTextField.CENTER);
			  jogador2.labelNome.setFont(new Font("Verdana",Font.PLAIN,35));
			  
			  jogador3.numText.setText(jogador3.getNumero().toString());
			  jogador3.numText.setBounds(1705,400,90,100);
			  jogador3.numText.setHorizontalAlignment(JTextField.CENTER);
			  jogador3.numText.setFont(new Font("Verdana",Font.PLAIN,35));
			  
			  jogador3.labelNome.setText(jogador3.getNome());
			  jogador3.labelNome.setBounds(1500,400,200,100);
			  jogador3.labelNome.setHorizontalAlignment(JTextField.CENTER);
			  jogador3.labelNome.setFont(new Font("Verdana",Font.PLAIN,35));
			  
			  jogador4.numText.setText(jogador4.getNumero().toString());
			  jogador4.numText.setBounds(1705,500,90,100);
			  jogador4.numText.setHorizontalAlignment(JTextField.CENTER);
			  jogador4.numText.setFont(new Font("Verdana",Font.PLAIN,35));
			  
			  jogador4.labelNome.setText(jogador4.getNome());
			  jogador4.labelNome.setBounds(1500,500,200,100);
			  jogador4.labelNome.setHorizontalAlignment(JTextField.CENTER);
			  jogador4.labelNome.setFont(new Font("Verdana",Font.PLAIN,35));
			  
			  jogador5.numText.setText(jogador5.getNumero().toString());
			  jogador5.numText.setBounds(1705,600,90,100);
			  jogador5.numText.setHorizontalAlignment(JTextField.CENTER);
			  jogador5.numText.setFont(new Font("Verdana",Font.PLAIN,35));
			  
			  jogador5.labelNome.setText(jogador5.getNome());
			  jogador5.labelNome.setBounds(1500,600,200,100);
			  jogador5.labelNome.setHorizontalAlignment(JTextField.CENTER);
			  jogador5.labelNome.setFont(new Font("Verdana",Font.PLAIN,35));
		  }

		  
	 }

}
