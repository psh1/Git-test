package ru.psh1.test;

import javax.swing.JOptionPane;

public class Test1 {
	int i, k;
	String l1 ,l2;
	
	public void Scan() {
		try{
		l1 = JOptionPane.showInputDialog(null,"������� ������ �����");
		l2 = JOptionPane.showInputDialog(null,"������� ������ �����");
		i = Integer.parseInt(l1);
		k = Integer.parseInt(l2);
		}catch(Exception e){JOptionPane.showMessageDialog(null, "������� � ���� �����");}
	}
	
	public void Scan(int a, int b){
		
		JOptionPane.showMessageDialog(null, "���� ������ ����� = " + a);
		JOptionPane.showMessageDialog(null, "���� ������ ����� = " + b);
		
	}

}
