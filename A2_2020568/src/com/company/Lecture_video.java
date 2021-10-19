package com.company;

import java.time.LocalDateTime;
import java.util.Date;

public class Lecture_video extends Lecture_material implements Printable{
    private final String filename;
    private final Date time;
    private final String instructor_id;

    public Lecture_video(String topic, String filename, Date time, String instructor_id) {
        super(topic);
        this.topic = topic;
        this.filename = filename;
        this.time = time;
        this.instructor_id = instructor_id;
    }

    public String toString() {
        String object = "";
        object += ("Title of video: " + topic + "\n");
        object += ("video file: " + filename + "\n");
        object += ("Date of upload: " + time + "\n");
        object += ("Uploaded by: " + instructor_id + "\n");
        return object;
    }
}
