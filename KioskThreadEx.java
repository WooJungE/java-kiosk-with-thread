import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KioskThreadEx extends JFrame{
	private JButton button, button2;
	private JLabel label, label2;
	
	public KioskThreadEx() {
		setTitle("장소 선택");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JPanel panel = new JPanel();
		button = new JButton("here");
		button2 = new JButton("to go");
		button.addActionListener(new HereToGo(label));
		//깜박이는 레이블 생성
		KioskThread fLabel = new KioskThread("매장에서", 500);
		JLabel label = new JLabel("또는");
		KioskThread fLabel2 = new KioskThread("테이크 아웃", 500);
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		panel.add(button);
		panel.add(button2);
		this.add(panel);
		this.setVisible(true);
		
		setSize(180, 150);
		setVisible(true);
	}	
	public static void main(String[] args) {
		new KioskThreadEx();
	}
}
