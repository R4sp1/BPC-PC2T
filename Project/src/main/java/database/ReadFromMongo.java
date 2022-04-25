package database;

import com.mongodb.MongoClientException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.util.ArrayList;
import static com.mongodb.client.model.Filters.gte;

public class ReadFromMongo {
    private static ArrayList<Document> studentList;
    private static final MongoClient mongoClient = MongoClients.create(System.getProperty("mongodb.uri"));
    private static final MongoDatabase studentDB = mongoClient.getDatabase("project");
    private static final MongoCollection<Document> studentCollection = studentDB.getCollection("student");
    private static String param;

    public static void ReadFromMongoDB() {
        try {
            studentList = studentCollection.find(gte("index", 1)).into(new ArrayList<>());
        } catch (MongoClientException e) {
            System.out.println("Mongo nelze nacist\n");
        }
    }

    public static double getNumOfStudents() {
        return (double) studentCollection.countDocuments();
    }

    public static int getIndex(int id) {
        try {
            if (studentList == null) {
                ReadFromMongoDB();
            }
            param = "index";
            Document d = studentList.get(id);
            return d.getInteger(param);
        } catch (NullPointerException e) {
            System.out.println("Mongo neni nactena!\n");
            return 0;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index je vetsi nez index databaze!\n");
            return 0;
        }
    }

    public static String getName(int id) {
        try {
            if (studentList == null) {
                ReadFromMongoDB();
            }
            param = "name";
            Document d = studentList.get(id);
            return d.getString(param);
        } catch (NullPointerException e) {
            System.out.println("Mongo neni nactena!\n");
            return null;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index je vetsi nez index databaze!\n");
            return null;
        }
    }

    public static String getSurname(int id) {
        try {
            if (studentList == null) {
                ReadFromMongoDB();
            }
            param = "surname";
            Document d = studentList.get(id);
            return d.getString(param);
        } catch (NullPointerException e) {
            System.out.println("Mongo neni nactena!\n");
            return null;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index je vetsi nez index databaze!\n");
            return null;
        }
    }

    public static String getDateOfBirth(int id) {
        try {
            if (studentList == null) {
                ReadFromMongoDB();
            }
            param = "dateOfBirth";
            Document d = studentList.get(id);
            return d.getString(param);
        } catch (NullPointerException e) {
            System.out.println("Mongo neni nactena!\n");
            return null;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index je vetsi nez index databaze!\n");
            return null;
        }
    }

    public static double getStudyAvg(int id) {
        try {
            if (studentList == null) {
                ReadFromMongoDB();
            }
            param = "studyAvg";
            Document d = studentList.get(id);
            return d.getDouble(param);
        } catch (NullPointerException e) {
            System.out.println("Mongo neni nactena!\n");
            return 0;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index je vetsi nez index databaze!\n");
            return 0;
        }
    }

    public static String getStudyFiled(int id) {
        try {
            if (studentList == null) {
                ReadFromMongoDB();
            }
            param = "studyField";
            Document d = studentList.get(id);
            return d.getString(param);
        } catch (NullPointerException e) {
            System.out.println("Mongo neni nactena!\n");
            return null;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index je vetsi nez index databaze!\n");
            return null;
        }
    }
}

