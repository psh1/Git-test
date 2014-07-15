package ru.psh1.test;

import javax.swing.JOptionPane;

public class Test1 {
	int i, k;
	String l1 ,l2;
	
	public void Scan() {
		try{
		l1 = JOptionPane.showInputDialog(null,"Введите первое число");
		l2 = JOptionPane.showInputDialog(null,"Введите второе число");
		i = Integer.parseInt(l1);
		k = Integer.parseInt(l2);
		}catch(Exception e){JOptionPane.showMessageDialog(null, "Введите в поле число");}
	}
	
	public void Scan(int a, int b){
		
		JOptionPane.showMessageDialog(null, "Ваше первое число = " + a);
		JOptionPane.showMessageDialog(null, "Ваше второе число = " + b);
		
	}

}
