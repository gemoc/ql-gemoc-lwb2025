package org.gemoc.ql.k3ql.k3dsa;

public class QuestionNotAvailableException extends Exception {

	public QuestionNotAvailableException(String string) {
	  super(string);
	}

	public QuestionNotAvailableException(String string, Exception e) {
	  super(string, e);
	}
	
	public String getUserMessage() {
		StringBuffer sb = new StringBuffer();
		if(this.getCause() !=  null && this.getCause() instanceof QuestionNotAvailableException) {
			sb.append(((QuestionNotAvailableException)this.getCause()).getUserMessage());
			sb.append("\n");
		}
		sb.append(this.getMessage());
		return sb.toString();
	}
}
