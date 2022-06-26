package br.com.poo.sumula;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Jogador{
	
	String nome;
	Integer pontos;
	String numero;
	Integer faltas;

	Jogador(String nome , String numero , Integer faltas, Integer pontos){
		this.nome = nome;
		this.numero = numero;
		this.faltas = faltas;
		this.pontos = pontos;
		
	}
	
	@Override
    public String toString() {
		String nm = getNumero();
        return  nm;
    }
	
	public String getNumero() {
		return numero;
	}
	
	public void setFaltas(Integer faltas) {
		this.faltas = faltas;
	}
	
	public Integer getFaltas() {
		return faltas;
	}
	
	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}
}