class TestEarphone{
public static void main(String []args){
Earphone earphone=new Earphone("bluetooth");
String res=earphone.printAll();
System.out.println(res);

double DOB=2000;
Earphone earphone2=new Earphone("bluetooth","charge",DOB);
System.out.println(earphone2.printAll());
}
}