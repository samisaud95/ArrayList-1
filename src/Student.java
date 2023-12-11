// Creo una classe Student che accenti nel costruttore il parametro name
// (String e age Int).

public class Student {
    private String name;
    private Integer age;
    //In questa classe avere i metodi pubblici per ottenere le informazioni.
    Student(String name,Integer age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }


    public Integer getAge() {
        return age;
    }


//facendo override to string per stampare gli atributti
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

