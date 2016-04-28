package cn.edu.qud.guessgame;

public abstract class Player {
	private String playName=null;
	private int winningTimes=0;
	
	//获取名字的方法
	public abstract String inputName();
	//出拳的方法
	public abstract String myFist();
	
	
	public String getPlayName() {
		return playName;
	}
	public int getWinningTimes() {
		return winningTimes;
	}
	

}
