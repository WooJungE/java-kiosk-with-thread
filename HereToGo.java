import javax.swing.*;
import java.awt.event.*;
import javax.swing.JLabel;

public class HereToGo implements ActionListener{
	JLabel label, label2;
	
	HereToGo(JLabel l){
		label = l;
	}
	public void actionPerformed(ActionEvent e) {
		{JButton button = (JButton) e.getSource();
		label.setText("매장 이용을 선택하셨습니다.");
		}
		JButton button = (JButton) e.getSource();
		label2.setText("테이크 아웃을 선택하셨습니다.");
	}
}