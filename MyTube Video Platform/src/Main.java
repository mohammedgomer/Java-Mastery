
public class Main {

	public static void main(String[] args) {
		var video = new Video();
		video.setFileName("birthday.mp4");
		video.setTitle("Jennifer's Birthday");
		video.setUser(new User("john@outlook.com"));
		
		var processor = new VideoProcessor();
		processor.process(video);

	}

}
