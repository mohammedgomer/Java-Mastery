
public class Browser {

// Abstraction/Decoupling
// Navigating is all the user needs to d, they do not need to see what's under the hood
// Nor do they care, need to hide unnecessary details
// Finding the IP address is a detail - Needs to be hidden 
// Sending the HTTP Request is a detail - Needs to be hidden

	public void navigate(String address) {
		String ip = findIpAddress(address);
		String html = sendHttpRequest(ip);
		System.out.println(html);

	}

// Isolating changes to the browser class, it's internal and does not affect the implementation
// If I wanted to add an argument for instance, like boolean cache
	private String sendHttpRequest(String ip) {
		// TODO Auto-generated method stub
		return "<html></html>";
	}

	private String findIpAddress(String address) {
		// TODO Auto-generated method stub
		return "127.0.0.1";
	}

}
