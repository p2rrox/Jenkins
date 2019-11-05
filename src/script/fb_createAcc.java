package script;

import org.testng.annotations.Test;

import gen.Anno_Gen;


import pom.fb_welcome;

public class fb_createAcc extends Anno_Gen{

	
	@Test
	public void createAcc(){
		fb_welcome f = new fb_welcome(d);
		
		f.createAcc("john", "fabricio", "john@john.com", "john@john.com", "22", "Dec", "1982");
	}
}
