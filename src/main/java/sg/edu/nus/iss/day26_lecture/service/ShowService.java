package sg.edu.nus.iss.day26_lecture.service;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.day26_lecture.model.Rating;
import sg.edu.nus.iss.day26_lecture.model.Show;
import sg.edu.nus.iss.day26_lecture.repository.ShowRepository;

@Service
public class ShowService {
    
    private ShowRepository showRepo;

    public ShowService(ShowRepository showRepo) {
        this.showRepo = showRepo;
    }

    public List<Show> findShowsByName(String programName) {
        
        List<Document> docs = showRepo.findShowsByName(programName);

        List<Show> shows = new ArrayList<>();

		for (Document doc : docs) {
            Show show = new Show();
			show.setName(doc.getString("name"));
			show.setType(doc.getString("type"));
			show.setRuntime(doc.getInteger("runtime"));
			show.setGenres(doc.getList("genres", String.class));
            Rating rating = new Rating();
			rating.setAverage(doc.get("rating", Document.class).getDouble("average"));
            show.setRating(rating);
            shows.add(show);
		}

        return shows;
    }
}
