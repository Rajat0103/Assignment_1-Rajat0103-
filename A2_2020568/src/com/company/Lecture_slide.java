package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Lecture_slide extends Lecture_material implements Printable{
    private final int number;
    private final ArrayList<String> content;
    private final Date time;
    private final String instructor_id;

    public Lecture_slide(String topic, int number, ArrayList<String> content, Date time, String intructor_id) {
        super(topic);
        this.number = number;
        this.content = content;
        this.time = time;
        this.instructor_id = intructor_id;
    }

    @Override
    public String toString() {
        String object = "";
        object += "Title: " + topic + "\n";
        for(int i=0; i<content.size(); i++){
            object += "Slide " + i + ": " + content.get(i) + "\n";
        }
        object += "Number of slides: " + number + "\n";
        object += "Date of upload: " + time + "\n";
        object += "Uploaded by: " + instructor_id + "\n";

        return object;
    }
}
