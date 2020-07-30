
public class VideoProcessor {
public void process(Video video) {
	var encoder = new VideoEncoder();
	encoder.encode(video);
	
	var database = new VideoDataBase();
	database.store(video);
	
	var emailService = new EmailService();
	emailService.sendEmail(video.getUser());
}
}
