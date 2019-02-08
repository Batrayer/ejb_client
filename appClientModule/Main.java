import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import rayer.ejb_test.BackEndRemote;

public class Main {
	public static void main(String[] args) {
		try {
			Context ic = new InitialContext();
			BackEndRemote bck = (BackEndRemote)ic.lookup("//ejb_test/BackEnd!rayer.ejb_test.BackEndRemote");
			bck.callMeMaybe();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}