package View;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.*;

import Board.SalinityBar;



public class Main {
	
	final static public int frameWidth = 500;
	final static public int frameHeight = 500;
	
	

	
	
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(frameWidth, frameHeight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SalinityBar sb = new SalinityBar(0,100);
		frame.setContentPane(sb);
		
		frame.setVisible(true);
		
		;
		
	}
}
