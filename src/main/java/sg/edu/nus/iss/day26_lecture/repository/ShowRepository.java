package sg.edu.nus.iss.day26_lecture.repository;

import java.util.List;

import org.bson.Document;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class ShowRepository {
    
    private MongoTemplate template;

    public static final String C_TVSHOW = "tvshow";
    
    public static final String F_NAME = "name";

    public ShowRepository(MongoTemplate template) {
        this.template = template;
    }


    /*
     * db.tvshow.find({ name: 'the name'})
     */
    public List<Document> findShowsByName(String programName) {

        // Set the filter
        Criteria criteria = Criteria.where("name").is(programName);

        // Create a Mongo query with the filter
        Query query = Query.query(criteria);
        
        // Perform the query
        return template.find(query, Document.class, "tvshow");
    }
}
