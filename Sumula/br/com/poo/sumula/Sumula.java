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
	 Time time1 = new Time(true);
	 Time time2 = new Time(false);
	 JButton subButton = new JButton("SUB");
	 
	 
	
	 
	 
	 Sumula(){
	  
	  cronometro.timeLabel.setText(cronometro.minuteString+":"+cronometro.secondString);
	  cronometro.timeLabel.setBounds(850,100,200,100);
	  cronometro.timeLabel.setHorizontalAlignment(JTextField.CENTER);
	  cronometro.timeLabel.setFont(new Font("Verdana",Font.PLAIN,35));
	  cronometro.timeLabel.setBorder(BorderFactory.createBevelBorder(1));
	  cronometro.timeLabel.setOpaque(true);
	  
	  startButton.setBounds(850,200,100,50);
	  startButton.setFont(new Font("Ink Free",Font.PLAIN,20));
	  startButton.setFocusable(false);
	  startButton.addActionListener(this);
	  
	  resetButton.setBounds(950,200,100,50);
	  resetButton.setFont(new Font("Ink Free",Font.PLAIN,20));
	  resetButton.setFocusable(false);
	  resetButton.addActionListener(this);
	  
	  subButton.setBounds(878,800,150,100);
	  subButton.setFont(new Font("Ink Free",Font.PLAIN,20));
	  subButton.setFocusable(false);
	  subButton.addActionListener(this);
	  
	  frame.add(startButton);
	  frame.add(resetButton);
	  frame.add(subButton);
	  frame.add(cronometro.timeLabel);
	  frame.add(time1.time);
	  frame.add(time1.jogador1.labelNome);
	  frame.add(time1.jogador2.labelNome);
	  frame.add(time1.jogador3.labelNome);
	  frame.add(time1.jogador4.labelNome);
	  frame.add(time1.jogador5.labelNome);
	  frame.add(time1.jogador1.numText);
	  frame.add(time1.jogador2.numText);
	  frame.add(time1.jogador3.numText);
	  frame.add(time1.jogador4.numText);
	  frame.add(time1.jogador5.numText);
	  frame.add(time2.time);
	  frame.add(time2.jogador1.labelNome);
	  frame.add(time2.jogador2.labelNome);
	  frame.add(time2.jogador3.labelNome);
	  frame.add(time2.jogador4.labelNome);
	  frame.add(time2.jogador5.labelNome);
	  frame.add(time2.jogador1.numText);
	  frame.add(time2.jogador2.numText);
	  frame.add(time2.jogador3.numText);
	  frame.add(time2.jogador4.numText);
	  frame.add(time2.jogador5.numText);
	  
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
