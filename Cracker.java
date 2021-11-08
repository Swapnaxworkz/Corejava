class Cracker{
String name;
String type;
int weight;


Cracker(String n){
name=n;
}

Cracker(String n,String t,int w){
name=n;
type=t;
weight=w;
}

String printAll(){
String display = name +"\t"+ type+"\t"+ weight;
return display;
}
}









