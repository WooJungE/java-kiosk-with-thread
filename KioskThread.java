import java.awt.*;
import javax.swing.*;

class KioskThread extends JLabel implements Runnable {
	private long delay; //배경색이 바뀌는 지연 시간, 밀리초 단위
	
	public KioskThread(String text, long delay) { //생성자
		super(text); //JLabel 생성자 호출
		this.delay = delay;
		setOpaque(true); //배경색이 변하도록 설정
		
		Thread th = new Thread(this);
		th.start();
		//Thread()의 생성자에 this를 넘기는 것은 클래스가 Runnable을 상속받아 run()을 구현한 객체임을 표시
	}
	
	@Override
	public void run() {
		int n = 0;
		while(true) {
			if(n==0)
				setBackground(Color.GREEN);
			else
				setBackground(Color.WHITE);
			if(n==0) n = 1;
			else n = 0;
			try {
				Thread.sleep(delay); 
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}		
}