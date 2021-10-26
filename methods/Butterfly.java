class Butterfly{
static void fly(){
System.out.println("Butterfly can fly");
}

static void fly(float height){
System.out.println("Butterfly can fly" +height);
}

static void fly(byte size,float height){
System.out.println("Butterfly can fly" +size+"\t" +height);
}

static void fly(float size,byte height){
System.out.println("Butterfly can fly" +size+"\t" +height);
}
}