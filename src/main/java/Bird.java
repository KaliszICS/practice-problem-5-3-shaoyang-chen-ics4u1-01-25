public class Bird extends Animal{
    protected String name;
    protected int age;
    protected String type;
    protected int position;

    public Bird(String name, int age, String type, int position){
        super(name, age, type, position);
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getType(){
        return this.type;
    }

    public int getPosition(){
        return this.position;
    }

    @Override
    public String animalSound() {
        return "Chirp";
    }
    @Override
    public void move() {
        position += 50;
    }
}
