package br.com.poo.sumula;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.Timer;

public class Cronometro {
	
	 int elapsedTime = 0;
	 int seconds =0;
	 int minutes = 12;
	 int hours =0;
	 boolean started = false;
	 JLabel timeLabel = new JLabel();
	 String secondString = String.format("%02d", seconds);
	 String minuteString = String.format("%02d", minutes);
	 DecimalFormat dFormat = new DecimalFormat("00");
	 
	 Timer timer = new Timer(1000, new ActionListener() {		  
		 
		@Override
		public void actionPerformed(ActionEvent e) {
		
			seconds--;
			secondString = dFormat.format(seconds);
			minuteString = dFormat.format(minutes);	
			timeLabel.setText(minuteString + ":" + secondString);
			
			if(seconds==-1) {
				seconds = 59;
				minutes--;
				secondString = dFormat.format(seconds);
				minuteString = dFormat.format(minutes);	
				timeLabel.setText(minuteString + ":" + secondString);
			}
			if(minutes==0 && seconds==0) {
				timer.stop();
			}
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
	  secondString = String.format("%02d", seconds);
	  minuteString = String.format("%02d", minutes);
	  timeLabel.setText(minuteString+":"+secondString);
	 }
	 
	 
}
