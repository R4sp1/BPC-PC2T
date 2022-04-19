package database;


import com.mongodb.client.*;

import org.bson.Document;

import java.util.ArrayList;
import java.util.List;


public class ConnectToMongo {


    public static void ConnectToMongoDB() {
        String connectionString = "mongodb+srv://BPC-PC2T-project:ppYd5tppGMa2Qjb@cluster0.v32md.mongodb.net/project?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
            databases.forEach(db -> System.out.println(db.toJson()));
        }
    }

}
