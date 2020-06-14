package tw.brad.tcca;

import javax.swing.JOptionPane;

public class HelloUser {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("輸入姓名");
		//System.out.printf("Hello, %s", name);
		
		JOptionPane.showMessageDialog(null, String.format("Hello, %s", name));
		
	}

}
