public class Pet {
    
    private String name;
    private int age;
    private double weight;
    private String type;
    private String breed;

    public Pet() {

        name = "Unknown";
        age = -1;
        weight = 1.0;
        type = "Unknown";
        breed = "Unknown";

    }

    public Pet(String petName, int petAge, double petWeight, String petType, String petBreed) {

        name = petName;
        age = petAge;
        weight = petWeight;
        type = petType;
        breed = petBreed;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }
    
    public String getBreed() {
        return breed;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight + ", Type: " + type + ", Breed: " + breed;
    }

}
