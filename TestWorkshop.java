class TestWorkshop{
public static void main(String []args){
Workshop workshop=new Workshop("cs");
String res=workshop.printAll();
System.out.println(res);

short DOB=1999;
Workshop workshop2=new Workshop("cs","board",DOB);
System.out.println(workshop2.printAll());
}
}