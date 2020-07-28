package Utility;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.AglArena.origin;

public class AmUtils extends origin {
		public  void myWait(){
			WebDriverWait mywait= new WebDriverWait(driver, 30);
			
		}
		
		public  void OtpUtil() throws InterruptedException{
			Thread.sleep(8000);
			JFrame path=  new JFrame();
			String otp= JOptionPane.showInputDialog(path,"Enter OTP");
			System.out.println("otp is "  +otp);
			Thread.sleep(5000);
		}
		
}
