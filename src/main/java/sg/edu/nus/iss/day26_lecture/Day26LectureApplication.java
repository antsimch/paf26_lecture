package sg.edu.nus.iss.day26_lecture;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sg.edu.nus.iss.day26_lecture.repository.ShowRepository;

@SpringBootApplication
public class Day26LectureApplication {

	@Autowired
	private ShowRepository showRepo;

	public static void main(String[] args) {
		SpringApplication.run(Day26LectureApplication.class, args);
	// }

	// @Override
	// public void run(String... args) throws Exception {
	// 	List<Document> docs = showRepo.findShowsByName("Bitten");

	// 	for (Document doc : docs) {
	// 		String name = doc.getString("name");
	// 		String type = doc.getString("type");
	// 		Integer runtime = doc.getInteger("runtime");
	// 		List<String> genres = doc.getList("genres", String.class);
	// 		Double rating = doc.get("rating", Document.class).getDouble("average");

	// 		System.out.printf("title: %s, type: %s, runtime: %d\n", name, type, runtime);
	// 		System.out.printf("\tgenres: %s\n", genres);
	// 		System.out.printf("\trating: %.2f\n", rating);
	// 	}
		
	// 	System.exit(0);
	}

}
