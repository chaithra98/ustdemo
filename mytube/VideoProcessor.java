package com.mytubevideo;

public class VideoProcessor {
    public VideoEncoder encoder;
    public VideoDatabase database;
    public NotificationService notificationService;

    public VideoProcessor(
            VideoEncoder encoder,
            VideoDatabase database,
            NotificationService notificationService
    ){
        this.encoder = encoder;
        this.database = database;
        this.notificationService = notificationService;
    }

    public void process(Video video){
        encoder.encode(video);
        database.store(video);
        notificationService.notify(video.getUser());
    }

}
