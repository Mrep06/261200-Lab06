public class Shark extends Fish{
    @Override
    public void swim(){
        System.out.println("Shark is swimming fast!");
    }
    public void eat(Fish fish){
        System.out.println(this.toString() + " is eating " + fish.toString());
    }
}
