package demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "word-config")
public class LuckyWordController {

	String luckyWord;
	String preamble;
	  
	@GetMapping("/lucky-word")
	public String showLuckyWord() {
	    return preamble + ": " + luckyWord;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfig(){
		return new PropertySourcesPlaceholderConfigurer();
	}

	public String getLuckyWord() {
		return luckyWord;
	}

	public void setLuckyWord(String luckyWord) {
		this.luckyWord = luckyWord;
	}

	public String getPreamble() {
		return preamble;
	}

	public void setPreamble(String preamble) {
		this.preamble = preamble;
	}

}
