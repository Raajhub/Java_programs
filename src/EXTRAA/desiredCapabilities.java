package EXTRAA;

public class desiredCapabilities {


	//Setting up Desired Capabilities to run our test script
		@BeforeClass
		  public void setUp() throws Exception {
		  DesiredCapabilities capabilities = new DesiredCapabilities();
		  capabilities.setCapability(“browserName”, “chrome”);
		  capabilities.setCapability(“version”, “77.0”);
		  // If this capability isn’t specified, it will just get any available one
	  capabilities.setCapability(“platform”, “win10”);
		  capabilities.setCapability(“build”, “TestsigmaSampleApp”);
		  capabilities.setCapability(“name”, “TestsigmaJavaSample”);
		  // To enable network logs
	  capabilities.setCapability(“network”, true);
	  // To enable step-by-step screenshot 	  
	  capabilities.setCapability(“visual”, true); 
	  // To enable video recording
		  capabilities.setCapability(“video”, true); 
	  // To capture console logs
		  capabilities.setCapability(“console”, true); 
	capabilities.setCapability(“selenium_version”,”4.0.0-alpha-2″);
		    capabilities.setCapability(“timezone”,”UTC+05:30″);
		    capabilities.setCapability(“geoLocation”,”IN”);
		    capabilities.setCapability(“chrome.driver”,”78.0″);
		  try {
			driver = new RemoteWebDriver(new URL(“https://” + username + “:” + accesskey + gridURL), capabilities);
		  } catch (MalformedURLException e) {
			System.out.println(“Invalid grid URL”);
		  } catch (Exception e) {
			System.out.println(e.getMessage());
		  }
		}

}
