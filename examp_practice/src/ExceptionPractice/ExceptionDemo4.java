package ExceptionPractice;

import java.sql.SQLException;

public class ExceptionDemo4 {

	public static void main(String[] args) {
//		throw new Exception();
//		throw new Exception("Ow! I fell.");
		throw new SQLException();
//		throw new RuntimeException("Ow! I fell.");
	}

}
