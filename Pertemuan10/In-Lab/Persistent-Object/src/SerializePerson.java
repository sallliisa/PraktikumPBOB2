/**
 * File : SerializePerson.java
 * Deskripsi : Program untuk serialisasi obyek Person
 */
import java.io.*;

//class Person
class Person implements Serializable {
    private String name;
    public Person(String n){
        name = n;
    }
    
    public String getName(){
        return name;
    }
}

//class SerializePerson
public class SerializePerson {
    public static void main(String[] args){
        Person person = new Person("Parni");
        try{
            FileOutputStream f= new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis obyek person");
            s.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
