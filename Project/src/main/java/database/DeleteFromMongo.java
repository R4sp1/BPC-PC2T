package database;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;

import static com.mongodb.client.model.Filters.eq;

public class DeleteFromMongo {
    private static final MongoClient mongoClient = MongoClients.create(System.getProperty("mongodb.uri"));
    private static final MongoDatabase studentDB = mongoClient.getDatabase("project");
    private static final MongoCollection<Document> studentCollection = studentDB.getCollection("student");

    public static void deleteFromMongo(int id){
        Bson filter = eq("index", id);
        studentCollection.deleteOne(filter);
    }
}
