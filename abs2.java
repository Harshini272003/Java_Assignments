import java.util.*;
class Zoo
{

    public Zoo(int animalCount)
    {
        this.animalCount = animalCount;
    }

    private int animalCount;
    List<Animal> listOfAnimals=  new ArrayList<Animal>();


    public void addAnimal(Animal animal)
    {
          listOfAnimals.add(animal);
          System.out.println(animal.getName()+" added successfully");
    }
    public void updateAnimal(int id,int age,String name,String type)
    {
         for(Animal a : listOfAnimals)
         {
             if(a.getId()==id)
             {
                 a.setName(name);
                 a.setAnimalType(type);
                 a.setAge(age);

             }
         }

    }
    public boolean delete(Animal animal)
    {
        if(listOfAnimals.contains(animal))
           return  false;
        return true;
    }
    public List<Animal> getAllAnimalDetails()
    {
      return listOfAnimals;
    }


}
class Animal
{
    private int id;
    private int age;
    private String name;
    private String animalType;
    public Animal(int id,int age,String name,String animalType)
    {
        this.id = id;
        this.age = age;
        this.name = name;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
public class abs2
{
    public static void main(String[] args) {

        Zoo  zoo1 = new Zoo(10);

        Animal ani1 = new Animal(1,5,"Lion","mammal");
        zoo1.addAnimal(ani1);
        Animal ani2 = new Animal(2,6,"Snake","Reptile");
        zoo1.addAnimal(ani2);
        Animal ani3 = new Animal(3,2,"Fish","Aqua-Animal");
        zoo1.addAnimal(ani3);
        Animal ani4 = new Animal(4,1,"Crocodile","Reptile");

        System.out.println(zoo1.delete(ani4));

        zoo1.updateAnimal(1,2,"Lion","mammal");

        List<Animal> listOfAnimals = zoo1.getAllAnimalDetails();
        for(Animal a : listOfAnimals)
        {
            System.out.println(a.getId()+" "+a.getName()+" "+a.getAge()+" "+a.getAnimalType());
        }

    }
}


