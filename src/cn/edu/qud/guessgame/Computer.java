package cn.edu.qud.guessgame;

import java.util.Random;
import java.util.Scanner;

public class Computer extends Player {
	private String playName=null;
	private int winningTimes = 0;
	private String comGuess=null;//���Գ���ȭ
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
		// ��������
		int select = input.nextInt();
		//String computerName = null;
		switch (select) {
		case 1:
			playName = "����";
			break;
		case 2:
			playName = "��Ȩ";
			break;
		case 3:
			playName = "�ܲ�";
			break;
		default:
			System.out.println("ѡ�����");
			break;
		}
		return playName;
	}

	public String myFist() {
		//���Գ�ȭ
		Random random = new Random();
		int select = (random.nextInt(3) + 1);
		switch (select) {
		case 1:
			comGuess="����";
			break;
		case 2:
			comGuess="ʯͷ";
			break;
		case 3:
			comGuess="��";
			break;
		default:
			System.out.println("ѡ�����");
			break;
		}
		return comGuess;
	}
}
