package Week_3;

class Person {
    private String name;
    private String id;

    public Person (String name , String ID) {
   this.name = name ; 
   this.id = ID ;
}

public String getName(){
    return name ;
}

public String getID(){
    return id; 
}

public void introduce(){
    System.out.println("I am a person");
}
    }
    