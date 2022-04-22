package database;


import com.mongodb.client.*;

import org.bson.Document;

import java.util.ArrayList;
import java.util.List;


public class ConnectToMongo {


    public static void ConnectToMongoDB() {
        String connectionString = System.getProperty("mongodb.uri");
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
            databases.forEach(db -> System.out.println(db.toJson()));
        }
    }

}
