package org.tns.UncheckedException;

public class LoginCredential extends Exception {
private String strr;

public LoginCredential(String strr) {
	super();
	this.strr = strr;
}

@Override
public String toString() {
	return "LoginCredential [strr=" + strr + "]";
}

public String getStrr() {
	return strr;
}
public void setStrr(String strr) {
	this.strr = strr;
}

}
