package org.neoteric.javaMavenDemo.cglibproxy;

import org.springframework.stereotype.Service;

@Service("VideoService")
public class VideoService {
    public void addVideo(String title) {
        System.out.println("Adding video: " + title);
    }

    public void deleteVideo(String title) {
        System.out.println("Deleting video: " + title);
    }
}
