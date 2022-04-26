package database;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import main.App;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import students.CombiStudent;
import students.HumaStudent;
import students.TechStudent;

import java.util.List;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;

public class InsertIntoMongo {
    private static final MongoClient mongoClient = MongoClients.create(System.getProperty("mongodb.uri"));
    private static final MongoDatabase studentDB = mongoClient.getDatabase("project");
    private static final MongoCollection<Document> studentCollection = studentDB.getCollection("student");


    public static void pushToMongo(List<TechStudent> techStudents, List<HumaStudent> humaStudents, List<CombiStudent> combiStudents) {
        App.ts = techStudents;
        App.hs = humaStudents;
        App.cs = combiStudents;


        for (int i = 0; i < App.ts.size(); i++) {
            TechStudent tStudent = App.ts.get(i);
            Document check = studentCollection.find(new Document("index", tStudent.getIdx())).first();
            if (check == null) {
                Document student = new Document("_id", new ObjectId());
                student.append("index", tStudent.getIdx())
                        .append("name", tStudent.getName())
                        .append("surname", tStudent.getSurname())
                        .append("dateOfBirth", tStudent.getDateOfBirth())
                        .append("studyAvg", tStudent.getStudyAverage())
                        .append("studyField", "TECH");
                studentCollection.insertOne(student);
            } else {
                Bson filter = eq("index", tStudent.getIdx());
                Bson updateOperation = set("studyAvg", tStudent.getStudyAverage());
                studentCollection.updateOne(filter, updateOperation);
                System.out.println("Studentuv: " + tStudent.getIdx() + " " + tStudent.getName() + " " + tStudent.getSurname() + " prumer byl aktualizovan");
            }
        }

        for (int i = 0; i < App.hs.size(); i++) {
            HumaStudent hStudent = App.hs.get(i);
            Document check = studentCollection.find(new Document("index", hStudent.getIdx())).first();
            if (check == null) {
                Document student = new Document("_id", new ObjectId());
                student.append("index", hStudent.getIdx())
                        .append("name", hStudent.getName())
                        .append("surname", hStudent.getSurname())
                        .append("dateOfBirth", hStudent.getDateOfBirth())
                        .append("studyAvg", hStudent.getStudyAverage())
                        .append("studyField", "TECH");
                studentCollection.insertOne(student);
            } else {
                Bson filter = eq("index", hStudent.getIdx());
                Bson updateOperation = set("studyAvg", hStudent.getStudyAverage());
                studentCollection.updateOne(filter, updateOperation);
                System.out.println("Studentuv: " + hStudent.getIdx() + " " + hStudent.getName() + " " + hStudent.getSurname() + " prumer byl aktualizovan");
            }
        }

        for (int i = 0; i < App.cs.size(); i++) {
            CombiStudent cStudent = App.cs.get(i);
            Document check = studentCollection.find(new Document("index", cStudent.getIdx())).first();
            if (check == null) {
                Document student = new Document("_id", new ObjectId());
                student.append("index", cStudent.getIdx())
                        .append("name", cStudent.getName())
                        .append("surname", cStudent.getSurname())
                        .append("dateOfBirth", cStudent.getDateOfBirth())
                        .append("studyAvg", cStudent.getStudyAverage())
                        .append("studyField", "TECH");
                studentCollection.insertOne(student);
            } else {
                Bson filter = eq("index", cStudent.getIdx());
                Bson updateOperation = set("studyAvg", cStudent.getStudyAverage());
                studentCollection.updateOne(filter, updateOperation);
                System.out.println("Studentuv: " + cStudent.getIdx() + " " + cStudent.getName() + " " + cStudent.getSurname() + " prumer byl aktualizovan");
            }
        }
    }
}