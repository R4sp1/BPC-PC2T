package database;

import com.mongodb.client.*;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;

import static com.mongodb.client.model.Filters.gte;
import static com.mongodb.client.model.Sorts.descending;

public class ReadFromMongo {
    private static ArrayList<Document> studentList;
    private static MongoClient mongoClient = MongoClients.create(System.getProperty("mongodb.uri"));
    private static MongoDatabase studentDB = mongoClient.getDatabase("project");
    private static MongoCollection<Document> studentCollection = studentDB.getCollection("student");
    private static double numOfStudents;


    public static ArrayList<Document> ReadFromMongo() {
        studentList = studentCollection.find(gte("index", 1)).into(new ArrayList<>());
        return studentList;
        }

    public static double getNumOfStudents(){
        numOfStudents = studentCollection.countDocuments();
        return numOfStudents;
    }
    }

