package cn.edu.qud.guessgame;

public abstract class Player {
	private String playName=null;
	private int winningTimes=0;
	
	//��ȡ���ֵķ���
	public abstract String inputName();
	//��ȭ�ķ���
	public abstract String myFist();
	
	
	public String getPlayName() {
		return playName;
	}
	public int getWinningTimes() {
		return winningTimes;
	}
	

}
