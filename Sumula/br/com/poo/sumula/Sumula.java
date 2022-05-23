package br.com.poo.sumula;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class Sumula implements ActionListener{
	private static final long serialVersionUID = 5945238074865805411L;
	
	 JFrame frame = new JFrame();
	 JButton startButton = new JButton("START");
	 JButton resetButton = new JButton("RESET");
	 Cronometro cronometro = new Cronometro();
	 JTextField time1 = new JTextField();
	 JTextField time1Jogador1 = new JTextField();
	 JTextField time1Jogador2 = new JTextField();
	 JTextField time1Jogador3 = new JTextField();
	 JTextField time1Jogador4 = new JTextField();
	 JTextField time1Jogador5 = new JTextField();
	 JTextField time2 = new JTextField();
	 JTextField time2Jogador1 = new JTextField();
	 JTextField time2Jogador2 = new JTextField();
	 JTextField time2Jogador3 = new JTextField();
	 JTextField time2Jogador4 = new JTextField();
	 JTextField time2Jogador5 = new JTextField();
	 
	 
	
	 
	 
	 Sumula(){
	  
	  cronometro.timeLabel.setText(cronometro.minuteString+":"+cronometro.secondString);
	  cronometro.timeLabel.setBounds(850,100,200,100);
	  cronometro.timeLabel.setHorizontalAlignment(JTextField.CENTER);
	  cronometro.timeLabel.setFont(new Font("Verdana",Font.PLAIN,35));
	  cronometro.timeLabel.setBorder(BorderFactory.createBevelBorder(1));
	  cronometro.timeLabel.setOpaque(true);
	
	  time1.setText("Time 1");
	  time1.setBounds(100,100,200,100);
	  time1.setHorizontalAlignment(JTextField.CENTER);
	  time1.setFont(new Font("Verdana",Font.PLAIN,35));
	  
	  time1Jogador1.setText("Jogador 1");
	  time1Jogador1.setBounds(100,200,200,100);
	  time1Jogador1.setHorizontalAlignment(JTextField.CENTER);
	  time1Jogador1.setFont(new Font("Verdana",Font.PLAIN,35));
	  
	  time1Jogador2.setText("Jogador 2");
	  time1Jogador2.setBounds(100,300,200,100);
	  time1Jogador2.setHorizontalAlignment(JTextField.CENTER);
	  time1Jogador2.setFont(new Font("Verdana",Font.PLAIN,35));
	  
	  time1Jogador3.setText("Jogador 3");
	  time1Jogador3.setBounds(100,400,200,100);
	  time1Jogador3.setHorizontalAlignment(JTextField.CENTER);
	  time1Jogador3.setFont(new Font("Verdana",Font.PLAIN,35));
	  
	  time1Jogador4.setText("Jogador 4");
	  time1Jogador4.setBounds(100,500,200,100);
	  time1Jogador4.setHorizontalAlignment(JTextField.CENTER);
	  time1Jogador4.setFont(new Font("Verdana",Font.PLAIN,35));
	  
	  time1Jogador5.setText("Jogador 5");
	  time1Jogador5.setBounds(100,600,200,100);
	  time1Jogador5.setHorizontalAlignment(JTextField.CENTER);
	  time1Jogador5.setFont(new Font("Verdana",Font.PLAIN,35));
	  
	  time2.setText("2 emiT");
	  time2.setBounds(1500,100,200,100);
	  time2.setHorizontalAlignment(JTextField.CENTER);
	  time2.setFont(new Font("Verdana",Font.PLAIN,35));
	  
	  time2Jogador1.setText("1 rodagoJ");
	  time2Jogador1.setBounds(1500,200,200,100);
	  time2Jogador1.setHorizontalAlignment(JTextField.CENTER);
	  time2Jogador1.setFont(new Font("Verdana",Font.PLAIN,35));
	  
	  time2Jogador2.setText("2 rodagoJ");
	  time2Jogador2.setBounds(1500,300,200,100);
	  time2Jogador2.setHorizontalAlignment(JTextField.CENTER);
	  time2Jogador2.setFont(new Font("Verdana",Font.PLAIN,35));
	  
	  time2Jogador3.setText("3 rodagoJ");
	  time2Jogador3.setBounds(1500,400,200,100);
	  time2Jogador3.setHorizontalAlignment(JTextField.CENTER);
	  time2Jogador3.setFont(new Font("Verdana",Font.PLAIN,35));
	  
	  time2Jogador4.setText("4 rodagoJ");
	  time2Jogador4.setBounds(1500,500,200,100);
	  time2Jogador4.setHorizontalAlignment(JTextField.CENTER);
	  time2Jogador4.setFont(new Font("Verdana",Font.PLAIN,35));
	  
	  time2Jogador5.setText("5 rodagoJ");
	  time2Jogador5.setBounds(1500,600,200,100);
	  time2Jogador5.setHorizontalAlignment(JTextField.CENTER);
	  time2Jogador5.setFont(new Font("Verdana",Font.PLAIN,35));
	  
	  
	  startButton.setBounds(850,200,100,50);
	  startButton.setFont(new Font("Ink Free",Font.PLAIN,20));
	  startButton.setFocusable(false);
	  startButton.addActionListener(this);
	  
	  resetButton.setBounds(950,200,100,50);
	  resetButton.setFont(new Font("Ink Free",Font.PLAIN,20));
	  resetButton.setFocusable(false);
	  resetButton.addActionListener(this);
	  
	  frame.add(startButton);
	  frame.add(resetButton);
	  frame.add(cronometro.timeLabel);
	  frame.add(time1);
	  frame.add(time1Jogador1);
	  frame.add(time1Jogador2);
	  frame.add(time1Jogador3);
	  frame.add(time1Jogador4);
	  frame.add(time1Jogador5);
	  frame.add(time2);
	  frame.add(time2Jogador1);
	  frame.add(time2Jogador2);
	  frame.add(time2Jogador3);
	  frame.add(time2Jogador4);
	  frame.add(time2Jogador5);
	  
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setSize(1920,1080);
	  frame.setLayout(null);
	  frame.setVisible(true);
	 }
	 @Override
	 public void actionPerformed(ActionEvent e) {
	  
	  if(e.getSource()==startButton) {
	   
	   if(cronometro.started==false) {
	    cronometro.started=true;
	    startButton.setText("STOP");
	    cronometro.start();
	   }
	   else {
	    cronometro.started=false;
	    startButton.setText("START");
	    cronometro.stop();
	   }
	   
	  }
	  if(e.getSource()==resetButton) {
	   cronometro.started=false;
	   startButton.setText("START");
	   cronometro.reset();
	  }
  
	 }
}
