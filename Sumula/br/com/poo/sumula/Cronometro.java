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
	 String seconds_string = String.format("%02d", seconds);
	 String minutes_string = String.format("%02d", minutes);
	 DecimalFormat dFormat = new DecimalFormat("00");
	 
	 Timer timer = new Timer(1000, new ActionListener() {		  
		 
		@Override
		public void actionPerformed(ActionEvent e) {
		
			seconds--;
			seconds_string = dFormat.format(seconds);
			minutes_string = dFormat.format(minutes);	
			timeLabel.setText(minutes_string + ":" + seconds_string);
			
			if(seconds==-1) {
				seconds = 59;
				minutes--;
				seconds_string = dFormat.format(seconds);
				minutes_string = dFormat.format(minutes);	
				timeLabel.setText(minutes_string + ":" + seconds_string);
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
	  seconds_string = String.format("%02d", seconds);
	  minutes_string = String.format("%02d", minutes);
	  timeLabel.setText(minutes_string+":"+seconds_string);
	 }
	 
	 
}
