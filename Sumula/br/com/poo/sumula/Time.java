package br.com.poo.sumula;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;

public class Time{

	ArrayList<Jogador> jogadores = new ArrayList<>();
	String nome;
	JLabel nomeLabel = new JLabel();
	
	Time(String nome){
		this.nome = nome;
		nomeLabel.setText(this.nome);
		nomeLabel.setBounds(330,100,250,50);
		nomeLabel.setFont(new Font("Verdana",Font.PLAIN,35));
		nomeLabel.setFocusable(false);
		
	
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}
	
	@Override
    public String toString() {
		String list = "";
		for( Jogador j : jogadores ) {
			list += j.toString() + " ";
		}
		return list;
    }
}
