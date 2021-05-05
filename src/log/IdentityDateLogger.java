package log;

import abstracts.Logger;

public class IdentityDateLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Kimlik ve Doðum yýlý loglama = " + message);
		
	}

}
