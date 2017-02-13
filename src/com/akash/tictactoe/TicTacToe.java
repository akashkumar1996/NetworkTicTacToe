package com.akash.tictactoe;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;

public class TicTacToe implements Runnable{

	private String IP="localhost";
	private int port=22222;
	private Scanner sc=new Scanner(System.in);
	private JFrame frame;
	private final int height=527;
	private final int width=506;
	private Thread thread;
	
	private Painter painter;
	private Socket socket;
	private DataOutputStream dos;
	private DataInputStream dis;
	
	private ServerSocket ServerSocket;
	
	private BufferedImage Board;
	private BufferedImage redX;
	private BufferedImage blueX;
	private BufferedImage redCircle;
	private BufferedImage blueCircle;
	
	private String[] spaces = new String[9];
	
	private boolean yourTurn=false;
	private boolean circle=true;
	private boolean unableToCommunicateOpponent=false;
	private boolean accepted=false;
	private boolean won=false;
	private boolean enemyWon=false;
	
	private int lengthOfSpace=160;
	private int errors=0;
	private int firstSpot=-1;
	private int secondSpot=-1;
	
	private Font font = new Font("Verdana",Font.BOLD,32);
	private Font smallerFont = new Font("Verdana",Font.BOLD,20);
	private Font largerFont = new Font("Verdana",Font.BOLD,50);
	
	private String waitingString = "Waiting for another player!!!";
	private String unableToCommunicateWithOpponentString = "Unable to communicate with opponent!!!";
	private String wonString = "You Won!!!";
	private String enemyWonString = "Opponent Won!!!";
	
	TicTacToe(){
		System.out.println("Please enter IP:");
		IP=sc.nextLine();
		System.out.println("Please enter port number:");
		port=sc.nextInt();
		while(port<1 || port>65535){
			System.out.println("Error!!!");
			System.out.println("Please enter valid port number:");
			port=sc.nextInt();
		}
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToe t = new TicTacToe(); 
	}
	
	public class Painter{
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
