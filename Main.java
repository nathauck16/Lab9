  import java.util.ArrayList;
  import java.io.FileReader;
  import java.io.BufferedReader;
  import java.io.IOException;
  import java.io.FileWriter;
  import java.io.BufferedWriter;

class Main {
  public static void main(String[] args) {
    people = new ArrayList<Person>();

    people.add(new Person("Nat", 23, "Blue"));
    people.add(new Person("A", 87, "Pink"));
    people.add(new Person("B", 13, "Yellow"));
    people.add(new Person("C", 44, "Black"));
    people.add(new Person("D", 4, "Green"));
  }

  try {
    toWriteFile = new FileWriter("data.txt");
    BufferedWriter output = new BufferedWriter(toWriteFile); 


    for(int i=0; i<people.size(); i++) {
    output.write(people.get(i).getName()); 
    output.newLine();
    output.write(Integer.toString(people.get(i).getAge())); 
    output.newLine();
    output.write(people.get(i).getColor()); 
    output.newLine();

    output.write("Testing");
    output.newLine();
    output.write(Integer.toString(100));
    output.newLine();
    output.flush();
    
    // Closing BufferWriter to end operation 
    output.close(); 
    }

    catch (IOException exception) {
    System.out.println("An error occurred: " + exception);
    }


    try {
      myFile = new FileReader(filename);
      BufferedReader reader = new BufferedReader(myFile);

      while (reader.ready()) {
      name = reader.readLine();
      age = reader.readLine();
      color = reader.readLine();
      
      Person thePerson = new Person(name, Integer.parseInt(age), color);
      people.add(thePerson);
      }
      System.out.printf(name + "\t" + age + "\t" + color);
      }
      catch (IOException exception) {
      System.out.println("An error occurred: " + exception);
      }


  }
}