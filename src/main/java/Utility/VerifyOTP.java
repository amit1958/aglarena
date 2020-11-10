package Utility;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VerifyOTP {

	public void OTPverify(){
		JFrame path=  new JFrame();
		String otp= JOptionPane.showInputDialog(path,"Enter OTP");
		System.out.println("otp is "  +otp);
		char[] ch=otp.toCharArray();
		for(int i=0;i<ch.length;i++){
		System.out.println("char at "+i+" index is: "+ch[i]);
		}
	}
}
