class Earphone{
String name;
String headset;
double DOB;


Earphone(String n){
name=n;
}

Earphone(String n,String h,double dob){
name=n;
headset=h;
DOB=dob;
}

String printAll(){
String display = name +"\t"+ headset+"\t"+ DOB;
return display;
}
}









