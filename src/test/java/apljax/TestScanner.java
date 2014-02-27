package apljax;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bensoft.apljax.Resources;
import com.bensoft.apljax.Scanner;

public class TestScanner {

    private final Logger log=LoggerFactory.getLogger(TestScanner.class);

	@Test
	public void test() {
		log.info("test info message");

		Scanner  scanner=new Scanner();
		Resources resources=scanner.scan();
		assertNotNull(resources);
	}

}