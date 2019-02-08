package rayer.ejb_test;

import javax.ejb.Remote;

@Remote
public interface BackEndRemote {
	public void callMeMaybe();
}
