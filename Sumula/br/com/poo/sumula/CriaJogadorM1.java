package br.com.poo.sumula;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CriaJogadorM1 implements ActionListener {

	JTextField nomeText = new JTextField();
	Formatador formatador = new Formatador();
	JFormattedTextField numText = new JFormattedTextField(formatador);
	JButton confirma = new JButton("Confirma");
	JFrame criaTime = new JFrame("Jogador");
	Container container = criaTime.getContentPane();
	JTextField nomeLabel = new JTextField();
	JFormattedTextField pontuacao = new JFormattedTextField(formatador);
	JFormattedTextField faltas = new JFormattedTextField(formatador);
	JButton sub = new JButton("Sub");

	CriaJogadorM1() {
		container.setLayout(null);

		JLabel logo = new JLabel("Qual o Nome do Jogador : ");
		logo.setBounds(60, 5, 250, 30);

		JLabel nomeLabel = new JLabel("Nome :");
		nomeLabel.setBounds(20, 60, 250, 30);

		nomeText.setBounds(75, 60, 250, 30);

		JLabel numlogo = new JLabel("Qual o Numero do Jogador : ");
		numlogo.setBounds(60, 105, 250, 30);

		JLabel numLabel = new JLabel("Numero :");
		numLabel.setBounds(20, 160, 250, 30);

		numText.setBounds(75, 160, 250, 30);

		confirma.setBounds(150, 200, 100, 30);
		this.confirma.addActionListener(this);

		container.add(logo);
		container.add(nomeLabel);
		container.add(numlogo);
		container.add(numLabel);
		container.add(numText);
		container.add(nomeText);
		container.add(confirma);
		criaTime.setVisible(true);

		criaTime.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		criaTime.setBounds(400, 200, 400, 300);

	}

	public String passaNumero() {
		if (Main.getSumula().mandante.toString().contains(numText.getText())) {
			for (Jogador j : Main.getSumula().mandante.jogadores) {
				if (j.numero.equals(numText.getText())) {
					return j.numero;
				}
			}
		}
		Jogador j = new Jogador(nomeText.getText(), numText.getText(), 0, 0);
		Main.getSumula().mandante.jogadores.add(j);
		return numText.getText();
	}

	public String passaNome() {
		if (Main.getSumula().mandante.toString().contains(numText.getText())) {
			for (Jogador j : Main.getSumula().mandante.jogadores) {
				if (j.numero.equals(numText.getText())) {
					return j.nome;
				}
			}
		}
		return nomeText.getText();
	}

	public String passaPontos() {
		if (Main.getSumula().mandante.toString().contains(numText.getText())) {
			for (Jogador j : Main.getSumula().mandante.jogadores) {
				if (j.numero.equals(numText.getText())) {
					return j.pontos.toString();
				}
			}
		}
		return "0";
	}

	public String passaFaltas() {
		if (Main.getSumula().mandante.toString().contains(numText.getText())) {
			for (Jogador j : Main.getSumula().mandante.jogadores) {
				if (j.numero.equals(numText.getText())) {
					return j.faltas.toString();
				}
			}
		}
		return "0";
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == confirma) {

			Main.getSumula().direita.remove(nomeLabel);
			Main.getSumula().direita.validate();
			Main.getSumula().direita.repaint();

			Main.getSumula().mandante1.setText(passaNumero());

			nomeLabel.setBounds(200, 200, 230, 70);
			nomeLabel.setText(passaNome());
			nomeLabel.setFocusable(false);
			nomeLabel.setFont(new Font("Verdana", Font.PLAIN, 25));

			pontuacao.setBounds(460, 200, 70, 70);
			pontuacao.setText(passaPontos());
			pontuacao.setFont(new Font("Verdana", Font.PLAIN, 25));

			faltas.setBounds(560, 200, 70, 70);
			faltas.setText(passaFaltas());
			faltas.setFont(new Font("Verdana", Font.PLAIN, 25));

			sub.setBounds(660, 200, 90, 70);
			sub.setFont(new Font("Verdana", Font.PLAIN, 25));
			sub.addActionListener(this);

			Main.getSumula().direita.add(nomeLabel);
			Main.getSumula().direita.add(pontuacao);
			Main.getSumula().direita.add(faltas);
			Main.getSumula().direita.add(sub);
			Main.getSumula().direita.validate();
			Main.getSumula().direita.repaint();

		}

		if (e.getSource() == sub) {
			if (Main.getSumula().mandante.toString().contains(numText.getText())) {
				for (Jogador j : Main.getSumula().mandante.jogadores) {
					if (j.numero.equals(Main.getSumula().mandante1.getText())) {
						j.setPontos(Integer.parseInt(pontuacao.getText()));
					}
				}
			}

			if (Main.getSumula().mandante.toString().contains(numText.getText())) {
				for (Jogador j : Main.getSumula().mandante.jogadores) {
					if (j.numero.equals(Main.getSumula().mandante1.getText())) {
						j.setFaltas(Integer.parseInt(faltas.getText()));
					}
				}
			}

			nomeLabel.setText(null);
			Main.getSumula().mandante1.setText("#0");
			pontuacao.setText(null);
			faltas.setText(null);
			Main.getSumula().direita.validate();
			Main.getSumula().direita.repaint();

		}

	}
}
