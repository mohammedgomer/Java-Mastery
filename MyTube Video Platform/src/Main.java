
public class Main {

	public static void main(String[] args) {
		var video = new Video();
		video.setFileName("birthday.mp4");
		video.setTitle("Jennifer's Birthday");
		video.setUser(new User("john@outlook.com"));
		
		// Need to pass concrete implementation as dependencies
		var processor = new VideoProcessor(
				new VideoEncoder(),
				new VideoDatabase(),
				new EmailService()
				);
		processor.process(video);

	}

}
