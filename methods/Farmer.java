class Agriculture{
static void farmer(){
System.out.println("farmer is a backbone of our country");
}
}
public class Farmer{
static void farmer(float poor){
System.out.println("farmer is a backbone of our country" +poor);
}
}
static void farmer(byte rich,float poor){
System.out.println("farmer is a backbone of our country" +rich+"\t" +poor);
}

static void farmer(float poor,byte rich){
System.out.println("farmer is a backbone of our country" +poor+"\t" +rich);
}
}