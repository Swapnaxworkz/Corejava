class TestTrekking{
public static void main(String []args){
Trekking trekking=new Trekking("hiking");
String res=trekking.printAll();
System.out.println(res);

double height=508;
Trekking trekking2=new Trekking("hiking","mumbai",899);
System.out.println(trekking2.printAll());
}
}