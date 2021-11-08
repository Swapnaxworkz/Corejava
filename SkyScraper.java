class SkyScraper{
String name;
String place;
double height;


SkyScraper(String n){
name=n;
}

SkyScraper(String n,String p,double h){
name=n;
place=p;
height=h;
}

String printAll(){
String display = name +"\t"+ place+"\t"+ height;
return display;
}
}









