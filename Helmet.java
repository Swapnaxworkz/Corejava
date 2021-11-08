class Helmet{
String name;
String type;
float weight;


Helmet(String n){
name=n;
}

Helmet(String n,String t,float w){
name=n;
type=t;
weight=w;
}

String printAll(){
String display = name +"\t"+ type+"\t"+ weight;
return display;
}
}









