package database;

import com.mongodb.MongoClientException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.mongodb.client.model.Filters.gte;

import main.App;
import students.*;

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

    public static int getNumOfStudents() {
        return (int) studentCollection.countDocuments();
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

    public ReadFromMongo(List<TechStudent> techStudents, List<HumaStudent> humaStudents, List<CombiStudent> combiStudents){
        App.ts = techStudents;
        App.hs = humaStudents;
        App.cs = combiStudents;

    }

    public static void FetchDataFromMongo(List<TechStudent> techStudents, List<HumaStudent> humaStudents, List<CombiStudent> combiStudents){
        try {
            App.ts = techStudents;
            App.hs = humaStudents;
            App.cs = combiStudents;
            int numOfEntries = getNumOfStudents();
            for (int i = 0; i < numOfEntries; i++) {
                int idx = getIndex(i);
                String name = getName(i);
                String surname = getSurname(i);
                String date = getDateOfBirth(i);
                double studyAverage = getStudyAvg(i);
                if(Objects.equals(getStudyFiled(i), "TECH")){
                    StudentType studentType = StudentType.TECH;
                    TechStudent tStudent = new TechStudent(name, surname, date, idx, studentType, studyAverage);
                    App.ts.add(tStudent);
                }else if(Objects.equals(getStudyFiled(i), "HUMA")){
                    StudentType studentType = StudentType.HUMA;
                    HumaStudent hStudent = new HumaStudent(name, surname, date, idx, studentType, studyAverage);
                    App.hs.add(hStudent);
                }else if(Objects.equals(getStudyFiled(i), "COMBI")){
                    StudentType studentType = StudentType.COMBI;
                    CombiStudent cStudent = new CombiStudent(name, surname, date, idx, studentType, studyAverage);
                    App.cs.add(cStudent);
                }

                App.s.setListOfTechStudent(App.ts);
                App.s.setListOfHumaStudents(App.hs);
                App.s.setListOfCombiStudents(App.cs);

            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index mimo rozah databaze\n");
        } catch (NumberFormatException e) {
            System.out.println("Chyba formatu dat\n");
        }
    }
}

