public class Toy{
  String name;
  int price;
  public Toy(String name,int price){
   this.name=name;
   this.price=price;
   System.out.println("A new toy has been made!");
  }
  public void updatePrice(int price){
   this.price=price;
  }
  public void showPrice(){
   System.out.println("price: "+this.price+" Taka");
  }
  public void updateName(String name){
    System.out.println("Changing old name: Robot: "+this.name+"\nnew name: Autobot");
    this.name=name;
  }
}