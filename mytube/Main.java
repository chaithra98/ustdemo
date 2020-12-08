package com.mytubevideo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var video = new Video();
        video.setTitle("BirthDay.mp4");
        video.setTitle("Angel's Bithday");
        video.setUser(new User("Angel@gmail.com"));

        var processor = new VideoProcessor(
                new XVideoEncoder(),
                new SqlVideoDatabase(),
                new EmailService()
        );
        processor.process(video);
    }
}
