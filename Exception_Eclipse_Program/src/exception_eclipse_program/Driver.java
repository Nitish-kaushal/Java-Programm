package exception_eclipse_program;

public class Driver {
	public static void main(String[] args) {
		try {
			FileReadingProgram.checkFile();
			
		}catch(Exception e)
		{
			System.out.println("File NOT created!");
		}
	}

}
