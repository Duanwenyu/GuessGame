package cn.edu.qud.guessgame;

import java.util.Scanner;

public class Person extends Player {
	private String playName = null;
	private int winningTimes = 0;
	private String myGuess=null;
	Scanner input = new Scanner(System.in);
	
	

	public String getPlayName() {
		return playName;
	}
	public String getmyGuess() {
		return myGuess;
	}
	public int getWinningTimes() {
		return winningTimes;
	}
	
	public void setPlayName(String playName) {
		this.playName = playName;
	}
	public void setWinningTimes(int winningTimes) {
		this.winningTimes = winningTimes;
	}
	public void setMyGuess(String myGuess) {
		this.myGuess = myGuess;
	}
	public String inputName() {
		// �������
		playName=input.next();
		return playName;
	}

	public String myFist() {
		// ��ҳ�ȭ
		int select = input.nextInt();
		switch (select) {
		case 1:
			myGuess = "����";
			break;
		case 2:
			myGuess = "ʯͷ";
			break;
		case 3:
			myGuess = "��";
			break;
		default:
			System.out.println("ѡ�����!");
			break;
		}
		return myGuess;
	}

}
