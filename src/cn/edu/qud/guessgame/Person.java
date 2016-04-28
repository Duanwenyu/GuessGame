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
		// 玩家姓名
		playName=input.next();
		return playName;
	}

	public String myFist() {
		// 玩家出拳
		int select = input.nextInt();
		switch (select) {
		case 1:
			myGuess = "剪刀";
			break;
		case 2:
			myGuess = "石头";
			break;
		case 3:
			myGuess = "布";
			break;
		default:
			System.out.println("选择错误!");
			break;
		}
		return myGuess;
	}

}
