package br.com.poo.sumula;

import java.text.NumberFormat;

import javax.swing.text.NumberFormatter;

public class Formatador extends NumberFormatter  {
	private static final long serialVersionUID = 8837697279624116169L;

	Formatador(){
		
    NumberFormat format = NumberFormat.getInstance();
    NumberFormatter formatter = new NumberFormatter(format);
    formatter.setValueClass(String.class);
    formatter.setMinimum("1");
    formatter.setMaximum("99");
    formatter.setAllowsInvalid(false);
    formatter.setCommitsOnValidEdit(true);
	
}
}
