package br.com.poo.sumula;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Sumula implements ActionListener {
	private static final long serialVersionUID = 5945238074865805411L;

	JFrame frame = new JFrame();
	JPanel direita, esquerda;
	JTextField time1 = new JTextField("Digite o Nome do Mandante");
	JTextField time2 = new JTextField("Digite o Nome do Visitante");
	JButton startButton = new JButton("START");
	JButton resetButton = new JButton("RESET");
	Cronometro cronometro = new Cronometro();
	JLabel pontosLabel = new JLabel("Pontos");
	JLabel faltasLabel = new JLabel("Faltas");
	JLabel pontosLabelv = new JLabel("Pontos");
	JLabel faltasLabelv = new JLabel("Faltas");
	Time mandante, visitante;
	JButton mandante1, mandante2, mandante3, mandante4, mandante5;
	JButton visitante1, visitante2, visitante3, visitante4, visitante5;

	Sumula() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1920, 1080);
		frame.setLayout(null);
		frame.setVisible(true);

		direita = new JPanel();
		direita.setBounds(0, 0, 860, 1080);
		direita.setLayout(null);

		esquerda = new JPanel();
		esquerda.setBounds(1061, 0, 860, 1080);
		esquerda.setLayout(null);

		cronometro.timeLabel.setText(cronometro.minuteString + ":" + cronometro.secondString);
		cronometro.timeLabel.setBounds(861, 100, 200, 100);
		cronometro.timeLabel.setHorizontalAlignment(JTextField.CENTER);
		cronometro.timeLabel.setFont(new Font("Verdana", Font.PLAIN, 35));
		cronometro.timeLabel.setBorder(BorderFactory.createBevelBorder(1));
		cronometro.timeLabel.setOpaque(true);

		startButton.setBounds(861, 200, 100, 50);
		startButton.setFont(new Font("Ink Free", Font.PLAIN, 20));
		startButton.setFocusable(false);
		startButton.addActionListener(this);

		resetButton.setBounds(961, 200, 100, 50);
		resetButton.setFont(new Font("Ink Free", Font.PLAIN, 20));
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);

		pontosLabel.setBounds(460, 150, 70, 70);
		pontosLabel.setFont(new Font("Verdana", Font.PLAIN, 15));

		faltasLabel.setBounds(560, 150, 70, 70);
		faltasLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		pontosLabelv.setBounds(460, 150, 70, 70);
		pontosLabelv.setFont(new Font("Verdana", Font.PLAIN, 15));

		faltasLabelv.setBounds(560, 150, 70, 70);
		faltasLabelv.setFont(new Font("Verdana", Font.PLAIN, 15));

		mandante1 = new JButton();
		mandante1.setBounds(100, 200, 70, 70);
		mandante1.setText("#0");
		mandante1.setFont(new Font("Verdana", Font.PLAIN, 25));
		mandante1.addActionListener(this);

		mandante2 = new JButton();
		mandante2.setBounds(100, 300, 70, 70);
		mandante2.setText("#0");
		mandante2.setFont(new Font("Verdana", Font.PLAIN, 25));
		mandante2.addActionListener(this);

		mandante3 = new JButton();
		mandante3.setBounds(100, 400, 70, 70);
		mandante3.setText("#0");
		mandante3.setFont(new Font("Verdana", Font.PLAIN, 25));
		mandante3.addActionListener(this);

		mandante4 = new JButton();
		mandante4.setBounds(100, 500, 70, 70);
		mandante4.setText("#0");
		mandante4.setFont(new Font("Verdana", Font.PLAIN, 25));
		mandante4.addActionListener(this);

		mandante5 = new JButton();
		mandante5.setBounds(100, 600, 70, 70);
		mandante5.setText("#0");
		mandante5.setFont(new Font("Verdana", Font.PLAIN, 25));
		mandante5.addActionListener(this);
		
		visitante1 = new JButton();
		visitante1.setBounds(100, 200, 70, 70);
		visitante1.setText("#0");
		visitante1.setFont(new Font("Verdana", Font.PLAIN, 25));
		visitante1.addActionListener(this);

		visitante2 = new JButton();
		visitante2.setBounds(100, 300, 70, 70);
		visitante2.setText("#0");
		visitante2.setFont(new Font("Verdana", Font.PLAIN, 25));
		visitante2.addActionListener(this);

		visitante3 = new JButton();
		visitante3.setBounds(100, 400, 70, 70);
		visitante3.setText("#0");
		visitante3.setFont(new Font("Verdana", Font.PLAIN, 25));
		visitante3.addActionListener(this);

		visitante4 = new JButton();
		visitante4.setBounds(100, 500, 70, 70);
		visitante4.setText("#0");
		visitante4.setFont(new Font("Verdana", Font.PLAIN, 25));
		visitante4.addActionListener(this);

		visitante5 = new JButton();
		visitante5.setBounds(100, 600, 70, 70);
		visitante5.setText("#0");
		visitante5.setFont(new Font("Verdana", Font.PLAIN, 25));
		visitante5.addActionListener(this);

		time1.setBounds(230, 100, 250, 50);
		time1.addActionListener(this);

		time2.setBounds(330, 100, 250, 50);
		time2.addActionListener(this);

		frame.add(startButton);
		frame.add(resetButton);
		frame.add(cronometro.timeLabel);
		frame.add(direita);
		frame.add(esquerda);

		direita.add(time1);
		direita.add(pontosLabel);
		direita.add(faltasLabel);

		esquerda.add(time2);
		esquerda.add(pontosLabelv);
		esquerda.add(faltasLabelv);

	}

	public JPanel getEsquerda() {
		return esquerda;
	}

	public JPanel getDireita() {
		return direita;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == startButton) {

			if (cronometro.started == false) {
				cronometro.started = true;
				startButton.setText("STOP");
				cronometro.start();
			} else {
				cronometro.started = false;
				startButton.setText("START");
				cronometro.stop();
			}

		}
		if (e.getSource() == resetButton) {
			cronometro.started = false;
			startButton.setText("START");
			cronometro.reset();
		}

		if (e.getSource() == time1) {
			String nome = time1.getText();
			mandante = new Time(nome);
			direita.remove(time1);
			direita.add(mandante.nomeLabel);
			direita.validate();
			direita.repaint();
			direita.add(mandante1);
			direita.add(mandante2);
			direita.add(mandante3);
			direita.add(mandante4);
			direita.add(mandante5);

		}

		if (e.getSource() == time2) {
			String nome = time2.getText();
			visitante = new Time(nome);
			esquerda.remove(time2);
			esquerda.add(visitante.nomeLabel);
			esquerda.validate();
			esquerda.repaint();
			esquerda.add(visitante1);
			esquerda.add(visitante2);
			esquerda.add(visitante3);
			esquerda.add(visitante4);
			esquerda.add(visitante5);
		}

		if (e.getSource() == mandante1) {
			CriaJogadorM1 jogador = new CriaJogadorM1();
		}
		if (e.getSource() == mandante2) {
			CriaJogadorM2 jogador = new CriaJogadorM2();
		}
		if (e.getSource() == mandante3) {
			CriaJogadorM3 jogador = new CriaJogadorM3();
		}
		if (e.getSource() == mandante4) {
			CriaJogadorM4 jogador = new CriaJogadorM4();
		}
		if (e.getSource() == mandante5) {
			CriaJogadorM5 jogador = new CriaJogadorM5();
		}

		if (e.getSource() == visitante1) {
			CriaJogadorV1 jogador = new CriaJogadorV1();
		}
		if (e.getSource() == visitante2) {
			CriaJogadorV2 jogador = new CriaJogadorV2();
		}
		if (e.getSource() == visitante3) {
			CriaJogadorV3 jogador = new CriaJogadorV3();
		}
		if (e.getSource() == visitante4) {
			CriaJogadorV4 jogador = new CriaJogadorV4();
		}
		if (e.getSource() == visitante5) {
			CriaJogadorV5 jogador = new CriaJogadorV5();
		}

		
	}

}
