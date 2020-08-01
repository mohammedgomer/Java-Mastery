
public class VideoProcessor {
	public VideoProcessor(IVideoEncoder encoder, VideoDatabase database, IEmailService emailService) {
		this.encoder = encoder;
		this.database = database;
		this.emailService = emailService;

	}

	private IVideoEncoder encoder;
	private VideoDatabase database;
	private IEmailService emailService;

	public void process(Video video) {

		// Not creating objects so out implementation is simplier and cleaner
		
		encoder.encode(video);
		database.store(video);
		emailService.sendEmail(video.getUser());
	}
}
