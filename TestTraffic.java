class TestTraffic{
public static void main(String []args){
Traffic traffic=new Traffic("Green");
String res=traffic.printAll();
System.out.println(res);

short DOM=1998;
Traffic traffic2=new Traffic("Green","red",DOM);
System.out.println(traffic2.printAll());
}
}