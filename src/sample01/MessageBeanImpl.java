package sample01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//Target
//@Component

public class MessageBeanImpl implements MessageBean{
	private String str;
	
	@Autowired
	public void setStr(@Value("have a nice Day")String str) {
		this.str = str;
	}

	@Override
	public void showPrintBefore() {
		
		System.out.println("showPrintBefore = "+ str);
		
	}

	@Override
	public void viewPrintBefore() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("viewPrintBefore = "+str);
		
	}

	@Override
	public void display() {
		System.out.println("display = "+str);
		
	}

	

	@Override
	public void showPrintAfter() {
		System.out.println("showPrintAfter = "+ str);
		
	}
	
	@Override
	public void viewPrintAfter() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("viewPrintAfter = "+str);
		
	}

	
	@Override
	public String showPrint() {
		System.out.println("showPrint = "+ str);
		return "오";
		
	}

	@Override
	public void viewPrint() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("viewPrint = "+str);
		
	}

}
