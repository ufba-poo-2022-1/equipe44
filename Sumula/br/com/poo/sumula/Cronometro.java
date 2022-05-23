package br.com.poo.sumula;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.Timer;

public class Cronometro {
	
	 int elapsedTime = 0;
	 int seconds =0;
	 int minutes =12;
	 int hours =0;
	 boolean started = false;
	 JLabel timeLabel = new JLabel();
	 String seconds_string = String.format("%02d", seconds);
	 String minutes_string = String.format("%02d", minutes);
	 String hours_string = String.format("%02d", hours);
	 
	 Timer timer = new Timer(1000, new ActionListener() {
		  
		  public void actionPerformed(ActionEvent e) {
		   
		   elapsedTime=elapsedTime+1000;
		   hours = (elapsedTime/3600000);
		   minutes = (elapsedTime/60000) % 60;
		   seconds = (elapsedTime/1000) % 60;
		   seconds_string = String.format("%02d", seconds);
		   minutes_string = String.format("%02d", minutes);
		   hours_string = String.format("%02d", hours);
		   timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
		   
		  }
		  
		 });
	 
	 void start() {
	  timer.start();
	 }
	 
	 void stop() {
	  timer.stop();
	 }
	 
	 void reset() {
	  timer.stop();
	  elapsedTime=0;
	  seconds =0;
	  minutes=12;
	  hours=0;
	  seconds_string = String.format("%02d", seconds);
	  minutes_string = String.format("%02d", minutes);
	  hours_string = String.format("%02d", hours);       timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
	 }
	 
	 
}
