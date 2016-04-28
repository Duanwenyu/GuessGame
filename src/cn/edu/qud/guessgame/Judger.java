package cn.edu.qud.guessgame;

import java.util.Scanner;

public class Judger {
	private int total;

	Computer computer=new Computer();
	Person person=new Person();
	
	private String yn=null;
	Scanner input=new Scanner(System.in);
	

	public void startGame(){
		//��Ϸ��ʼ
		System.out.println("\t***************");
		System.out.println("\t** ��ȭ����ʼ **");
		System.out.println("\t***************");
		System.out.println("��ȭ����:1.���� 2.ʯͷ 3.��");
	}
	
	public void askName(){
		//ѯ������5
		System.out.print("��ѡ��Է���ɫ��1.���� 2.��Ȩ 3.�ܲ٣���");

		computer.inputName();
		System.out.print("������������֣�");

		person.inputName();
		System.out.println(person.getPlayName()+"  VS  "+computer.getPlayName());
		System.out.print("Ҫ��ʼ��(y/n):");
		yn=input.next();
	}
	
	public void playName(){
		//��Ϸ����
		if(yn.equals("y")){
			do{
			total=total+1;
			System.out.print("���ȭ��1.���� 2.ʯͷ 3.��(������Ӧ����)��");
			person.myFist();
			System.out.println("���ȭ��"+person.getmyGuess());
			computer.myFist();
			System.out.println(computer.getPlayName()+"��ȭ:"+computer.getcomGuess());
			//�ж���Ӯ
			if(person.getmyGuess().equals("����")){
				if(computer.getcomGuess().equals("����")){
					System.out.println("�����^-^ ƽ�֣�");
				}else if(computer.getcomGuess().equals("ʯͷ")){
					System.out.println("�����^-^ �����ˣ��汿��");
					computer.setWinningTimes(computer.getWinningTimes()+1);
					//comWin=comWin+1;
				}else if(computer.getcomGuess().equals("��")){
					System.out.println("�����^-^ ��Ӯ�ˣ���������");
//					myWin=myWin+1;
					person.setWinningTimes(person.getWinningTimes()+1);
				}
			}else if(person.getmyGuess().equals("ʯͷ")){
				if(computer.getcomGuess().equals("ʯͷ")){
					System.out.println("�����^-^ ƽ�֣�");
				}else if(computer.getcomGuess().equals("��")){
					System.out.println("�����^-^ �����ˣ��汿��");
					computer.setWinningTimes(computer.getWinningTimes()+1);
//					comWin=comWin+1;
				}else if(computer.getcomGuess().equals("����")){
					System.out.println("�����^-^ ��Ӯ�ˣ���������");
//					myWin=myWin+1;
					person.setWinningTimes(person.getWinningTimes()+1);
				}
			}else if(person.getmyGuess().equals("��")){
				if(computer.getcomGuess().equals("��")){
					System.out.println("�����^-^ ƽ�֣�");
				}else if(computer.getcomGuess().equals("����")){
					System.out.println("�����^-^ �����ˣ��汿��");
					computer.setWinningTimes(computer.getWinningTimes()+1);
//					comWin=comWin+1;
				}else if(computer.getcomGuess().equals("ʯͷ")){
					System.out.println("�����^-^ ��Ӯ�ˣ���������");
//					myWin=myWin+1;
					person.setWinningTimes(person.getWinningTimes()+1);
				}
			}
			//ѯ���Ƿ��������Ϸ
			System.out.println("�Ƿ������(y/n)");
			yn=input.next();
			}while(yn.equals("y"));

		}
	}
	public void finalResult(){
		//��Ϸ���
		if(yn.equals("n")){
			System.out.println(person.getPlayName()+"  VS  "+computer.getPlayName());
			System.out.println("��ս������"+total);
			System.out.println();
			System.out.println("����\t"+"�÷�");
			System.out.println(person.getPlayName()+"\t"+person.getWinningTimes());
			System.out.println(computer.getPlayName()+"\t"+computer.getWinningTimes());
			System.out.println();
			//�ж��ܾ����Լ����յ�ʤ��
			if(person.getWinningTimes()>computer.getWinningTimes()){
				System.out.println("���:���������Ӯ�ˣ�");
			}else if(person.getWinningTimes()<computer.getWinningTimes()){
				System.out.println("���:�Ǻǣ��������´μ��Ͱ���");
			}else
				System.out.println("�����ƽ�ֽ�����");
		}
	}

}
