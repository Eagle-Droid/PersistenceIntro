package persistenceintro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PersistenceIntro {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Person person = new Person("John Deen", 33, "313/AB","Bucharest");
        FileWriter fw = new FileWriter("myFile");
        fw.write(person.toString());
        fw.close();
        
        
        FileReader fr = new FileReader("myFile");
        BufferedReader br = new BufferedReader(fr);
        String loadedPersonRaw = br.readLine();
        br.close();
        String[] loadedPersonArr = loadedPersonRaw.split(";");
        Person loadedPerson = new Person(
                    loadedPersonArr[0],
                    Integer.parseInt(loadedPersonArr[1]),
                    loadedPersonArr[2],
                    loadedPersonArr[3]
        );
        System.out.println("############ Loaded person ##########");
        System.out.println("Name: "+loadedPerson.getName());
        System.out.println("Age:"+loadedPerson.getAge());
        System.out.println("Pid:"+loadedPerson.getPid());
        System.out.println("City:"+loadedPerson.getCity());


    }
}
