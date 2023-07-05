package sg.edu.nus.iss.day26_lecture.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Image {
    
    private String medium;

    private String original;

    private Link link;
}
