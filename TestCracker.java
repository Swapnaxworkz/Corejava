class TestCracker{
public static void main(String []args){
Cracker cracker=new Cracker("pataki");
String res=cracker.printAll();
System.out.println(res);

int weight=12;
Cracker cracker2=new Cracker("pataki","carbon",16);
System.out.println(cracker2.printAll());
}
}