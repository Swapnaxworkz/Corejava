class Trekking{
String name;
String place;
double height;


Trekking(String n){
name=n;
}

Trekking(String n,String p,double h){
name=n;
place=p;
height=h;
}

String printAll(){
String display = name +"\t"+ place+"\t"+ height;
return display;
}
}









