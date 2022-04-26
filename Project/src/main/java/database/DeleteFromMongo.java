package database;

import com.mongodb.MongoClientException;
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

    public static void deleteFromMongo(int id) {
        try {
            Bson filter = eq("index", id);
            studentCollection.deleteOne(filter);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index mimo rozsah listu!\n");
        } catch (MongoClientException e) {
            System.out.println("Chyba monga!\n");
        } catch (NumberFormatException e) {
            System.out.println("Chyba formatu dat\n");
        } catch (NullPointerException e) {
            System.out.println("Chyba pointeru\n");
        }
    }
}
