import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;

import com.kohlschutter.boilerpipe.BoilerpipeProcessingException;
import com.kohlschutter.boilerpipe.extractors.ArticleExtractor;


public class TestBoilerplate {
	
	Logger logger = Logger.getLogger(TestBoilerplate.class.getName());
	
	private List<URL> testUrls; 
	
	@Before
	public void before() throws MalformedURLException {
		testUrls = new ArrayList<URL>(); 
		
		// testUrls.add(new URL("http://watson.ch"));
		// testUrls.add(new URL("http://srf.ch"));
		// testUrls.add(new URL("http://blick.ch"));
		// testUrls.add(new URL("http://bote.ch"));
		// testUrls.add(new URL("http://diepresse.com"));
		
		
		// getting an article in watson, the next article follows immediately after. check if watson can handle this
		testUrls.add(new URL("http://www.watson.ch/International/Syrien/774288644-5-Jahre-Krieg-in-Syrien--Die-Folgen-in-9-ersch%C3%BCtternden-Zahlen"));
	}
	
	
	/**
	 * Tests the text extraction feature from boilerpipe
	 * 
	 * @throws MalformedURLException
	 * @throws BoilerpipeProcessingException
	 */
	@Test
	public void testBoilerPipe() throws MalformedURLException, BoilerpipeProcessingException {
		
		for(URL url: testUrls) {
			logger.info("**** Testing URL: "+url+"***");
			System.out.println(ArticleExtractor.INSTANCE.getText(url));
		}
	}	
}
