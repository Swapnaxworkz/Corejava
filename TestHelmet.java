class TestHelmet{
public static void main(String []args){
Helmet helmet=new Helmet("kevlar");
String res=helmet.printAll();
System.out.println(res);

float weight=1.2f;
Helmet helmet2=new Helmet("kevlar","carbon",1.5f);
System.out.println(helmet2.printAll());
}
}