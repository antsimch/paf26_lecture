package sg.edu.nus.iss.day26_lecture.model;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Show {
    
    private Integer id;

    private String url;
    
    private String name;

    private String type;

    private String language;

    private List<String> genres;

    private String status;

    private Integer runtime;

    private String premiered;

    private String officialSite;

    private Schedule schedule;

    private Rating rating;

    private Integer weight;

    private Network network;

    private String webchannel;

    private External externals;

    private Image image;

    private String summary;

    private Date updated;
}
