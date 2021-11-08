class TestPark{
public static void main(String []a){
Park grass=new Park();
 
grass.name="kabbanpark";
String name=grass.name;

grass.entryfees=100;
byte entryfees=grass.entryfees;

grass.timings=8;
int timings=grass.timings;

System.out.println(name);
System.out.println(entryfees);
System.out.println(timings);


}
}