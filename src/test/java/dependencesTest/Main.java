package dependencesTest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Main {

	public static void main(String[] arg) {
		JUnitCore b= new JUnitCore();

		Result a= b.run(SimpleTest.class);
		System.out.print((a.getFailureCount() > 0) ? a.getFailures()
				: "no errors");

	}
}
