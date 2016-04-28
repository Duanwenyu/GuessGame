package cn.edu.qud.guessgame;

import java.util.Scanner;

public class Judger {
	private int total;

	Computer computer=new Computer();
	Person person=new Person();
	
	private String yn=null;
	Scanner input=new Scanner(System.in);
	

	public void startGame(){
		//游戏开始
		System.out.println("\t***************");
		System.out.println("\t** 猜拳，开始 **");
		System.out.println("\t***************");
		System.out.println("出拳规则:1.剪刀 2.石头 3.布");
	}
	
	public void askName(){
		//询问姓名5
		System.out.print("请选择对方角色（1.刘备 2.孙权 3.曹操）：");

		computer.inputName();
		System.out.print("请输入你的名字：");

		person.inputName();
		System.out.println(person.getPlayName()+"  VS  "+computer.getPlayName());
		System.out.print("要开始吗？(y/n):");
		yn=input.next();
	}
	
	public void playName(){
		//游戏进行
		if(yn.equals("y")){
			do{
			total=total+1;
			System.out.print("请出拳：1.剪刀 2.石头 3.布(输入相应数字)：");
			person.myFist();
			System.out.println("你出拳："+person.getmyGuess());
			computer.myFist();
			System.out.println(computer.getPlayName()+"出拳:"+computer.getcomGuess());
			//判断输赢
			if(person.getmyGuess().equals("剪刀")){
				if(computer.getcomGuess().equals("剪刀")){
					System.out.println("结果：^-^ 平局！");
				}else if(computer.getcomGuess().equals("石头")){
					System.out.println("结果：^-^ 你输了，真笨！");
					computer.setWinningTimes(computer.getWinningTimes()+1);
					//comWin=comWin+1;
				}else if(computer.getcomGuess().equals("布")){
					System.out.println("结果：^-^ 你赢了，真厉害！");
//					myWin=myWin+1;
					person.setWinningTimes(person.getWinningTimes()+1);
				}
			}else if(person.getmyGuess().equals("石头")){
				if(computer.getcomGuess().equals("石头")){
					System.out.println("结果：^-^ 平局！");
				}else if(computer.getcomGuess().equals("布")){
					System.out.println("结果：^-^ 你输了，真笨！");
					computer.setWinningTimes(computer.getWinningTimes()+1);
//					comWin=comWin+1;
				}else if(computer.getcomGuess().equals("剪刀")){
					System.out.println("结果：^-^ 你赢了，真厉害！");
//					myWin=myWin+1;
					person.setWinningTimes(person.getWinningTimes()+1);
				}
			}else if(person.getmyGuess().equals("布")){
				if(computer.getcomGuess().equals("布")){
					System.out.println("结果：^-^ 平局！");
				}else if(computer.getcomGuess().equals("剪刀")){
					System.out.println("结果：^-^ 你输了，真笨！");
					computer.setWinningTimes(computer.getWinningTimes()+1);
//					comWin=comWin+1;
				}else if(computer.getcomGuess().equals("石头")){
					System.out.println("结果：^-^ 你赢了，真厉害！");
//					myWin=myWin+1;
					person.setWinningTimes(person.getWinningTimes()+1);
				}
			}
			//询问是否继续玩游戏
			System.out.println("是否继续？(y/n)");
			yn=input.next();
			}while(yn.equals("y"));

		}
	}
	public void finalResult(){
		//游戏结果
		if(yn.equals("n")){
			System.out.println(person.getPlayName()+"  VS  "+computer.getPlayName());
			System.out.println("对战次数："+total);
			System.out.println();
			System.out.println("姓名\t"+"得分");
			System.out.println(person.getPlayName()+"\t"+person.getWinningTimes());
			System.out.println(computer.getPlayName()+"\t"+computer.getWinningTimes());
			System.out.println();
			//判断总局数以及最终的胜负
			if(person.getWinningTimes()>computer.getWinningTimes()){
				System.out.println("结果:真聪明，你赢了！");
			}else if(person.getWinningTimes()<computer.getWinningTimes()){
				System.out.println("结果:呵呵，笨笨，下次加油啊！");
			}else
				System.out.println("结果：平局结束！");
		}
	}

}
