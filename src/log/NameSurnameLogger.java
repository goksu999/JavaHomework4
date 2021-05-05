package log;

import abstracts.Logger;

public class NameSurnameLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Ýsim ve Soyisim loglama = " + message);
		
	}

}
