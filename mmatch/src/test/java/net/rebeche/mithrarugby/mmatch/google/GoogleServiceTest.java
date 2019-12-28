package net.rebeche.mithrarugby.mmatch.google;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoogleServiceTest {

	@Autowired
	GoogleService googleService;

	@Test
	public void getLicenceTest() throws IOException, GeneralSecurityException {
		List<List<Object>> result = googleService.getLicence();
		System.out.println("result:"+result);
	}
	
	@Test
	public void getCompoTest() throws IOException, GeneralSecurityException {
		List<List<Object>> result = googleService.getComposition();
		System.out.println("result:"+result);
	}
}
