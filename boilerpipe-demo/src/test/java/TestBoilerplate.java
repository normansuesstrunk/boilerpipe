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
	
	private List<String> testUrls; 
	
	@Before
	public void before() throws MalformedURLException {
		testUrls = new ArrayList<String>(); 
		testUrls.add("http://watson.ch");
		testUrls.add("http://srf.ch");
		testUrls.add("http://blick.ch");
		testUrls.add("http://bote.ch");
		testUrls.add("http://diepresse.com");
	}
	
	
	/**
	 * Tests the text extraction feature from boilerpipe
	 * 
	 * @throws MalformedURLException
	 * @throws BoilerpipeProcessingException
	 */
	@Test
	public void testBoilerPipe() throws MalformedURLException, BoilerpipeProcessingException {
		for(String url: testUrls) {
			printBoilerpipeTextExtraction(url);
		}
	}		
	
	
	@Test
	public void testWatsonSingleArticle() {
		// print front page
		printBoilerpipeTextExtraction("http://www.watson.ch");
		
		// print single article
		printBoilerpipeTextExtraction("http://www.watson.ch/International/Syrien/774288644-5-Jahre-Krieg-in-Syrien--Die-Folgen-in-9-ersch%C3%BCtternden-Zahlen");
	}
	
	@Test 
	public void testSrfSingle() {
		String articleSingle = "http://www.srf.ch/news/schweiz/vier-maenner-aus-der-schweiz-in-den-personalunterlagen-des-is";
		printBoilerpipeTextExtraction(articleSingle);
	}
	
	
	public void printBoilerpipeTextExtraction(String url) {
		logger.info("Testing URL: "+url);
		try {
			System.out.println(ArticleExtractor.INSTANCE.getText(new URL(url)));
		} catch (BoilerpipeProcessingException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
