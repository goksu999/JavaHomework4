package log;

import abstracts.Logger;

public class IdentityDateLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Kimlik ve Do�um y�l� loglama = " + message);
		
	}

}
