package org.neoteric.javaMavenDemo.cglibproxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("/addVideo")
    public String addVideo() {
        videoService.addVideo("Spring AOP");
        return "Video added";
    }

    @GetMapping("/deleteVideo")
    public String deleteVideo() {
        videoService.deleteVideo("Spring AOP");
        return "Video deleted";
    }
}