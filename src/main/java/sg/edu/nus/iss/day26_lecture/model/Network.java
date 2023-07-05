package sg.edu.nus.iss.day26_lecture.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Network {
    
    private Integer id;

    private String name;

    private Country country;
}
