class TestRemote{
public static void main(String []args){
Remote remote=new Remote("sundirect");
String res=remote.printAll();
System.out.println(res);

short DOB=1889;
Remote remote2=new Remote("sundirect","board",DOB);
System.out.println(remote2.printAll());
}
}