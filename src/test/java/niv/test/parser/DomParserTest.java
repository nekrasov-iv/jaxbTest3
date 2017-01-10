package niv.test.parser;

import java.io.File;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import niv.test.container.Container;

@RunWith(MockitoJUnitRunner.class)
public class DomParserTest {
	@Test
	public void test_pacs008() throws Exception {
		DomParser parser = new DomParser();
		
    	ClassLoader classLoader = getClass().getClassLoader();
    	File file = new File(classLoader.getResource("pacs.008.xml").getFile());
    	
    	String xml = null;
    	
    	try (Scanner scanner = new Scanner(file)) {
	    	xml = scanner.useDelimiter("\\Z").next();
    	}
        
        Container c = parser.parse(xml);
		
        Assert.assertNotNull(c);
        
        Assert.assertNotNull(c.getInstdAgt());
        Assert.assertNotNull(c.getInstdAgt().getFinInstnId());
        
        Assert.assertNotNull(c.getInstgAgt());
        Assert.assertNotNull(c.getInstgAgt().getFinInstnId());
        
        System.out.println(c.getInstdAgt().getFinInstnId().getBICFI());
        System.out.println(c.getInstgAgt().getFinInstnId().getBICFI());
	}
}
