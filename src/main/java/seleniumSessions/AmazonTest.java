package seleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();
		br.initDriver("opera");
		br.launchUrl("https://www.amazon.com");
		String title = br.getPageTitle();
		System.out.println("Page title: " + title);

		if (title.contains("Online Shopping")) {
			System.out.println("correct title");
		}
		System.out.println(br.getPageUrl());
		br.closeBrowser();

	}

}
