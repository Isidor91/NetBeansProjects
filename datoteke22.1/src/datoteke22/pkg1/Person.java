package datoteke22.pkg1;
public class Person 
{
    private String name;
    private String age;
    private String id;

    public Person() {
    }

    public Person(String name, String age, String id) 
    {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getAge() 
    {
        return age;
    }

    public void setAge(String age) 
    {
        this.age = age;
    }

    public String getId() 
    {
        return id;
    }

    public void setId(String id) 
    {
        this.id = id;
    }

    @Override
    public String toString() 
    {
        return " name :" + name + " age :" + age + " id :" + id ;
    }
    
    
    
}
