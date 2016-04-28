package cn.edu.qud.guessgame;

import java.util.Random;
import java.util.Scanner;

public class Computer extends Player {
	private String playName=null;
	private int winningTimes = 0;
	private String comGuess=null;//电脑出的拳
	Scanner input = new Scanner(System.in);

	public String getPlayName() {
		return playName;
	}
	public String getcomGuess() {
		return comGuess;
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
	public void setComGuess(String comGuess) {
		this.comGuess = comGuess;
	}
	public String inputName() {
		// 电脑姓名
		int select = input.nextInt();
		//String computerName = null;
		switch (select) {
		case 1:
			playName = "刘备";
			break;
		case 2:
			playName = "孙权";
			break;
		case 3:
			playName = "曹操";
			break;
		default:
			System.out.println("选择错误！");
			break;
		}
		return playName;
	}

	public String myFist() {
		//电脑出拳
		Random random = new Random();
		int select = (random.nextInt(3) + 1);
		switch (select) {
		case 1:
			comGuess="剪刀";
			break;
		case 2:
			comGuess="石头";
			break;
		case 3:
			comGuess="布";
			break;
		default:
			System.out.println("选择错误！");
			break;
		}
		return comGuess;
	}
}
