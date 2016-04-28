package cn.edu.qud.guessgame;

public class TestGuessGame {
	public static void main(String[] args){
		Judger judge=new Judger();
		
		judge.startGame();
		judge.askName();
		judge.playName();
		judge.finalResult();
		
	}
}
