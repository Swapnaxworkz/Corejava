class Keyboard{
String name;
String querty;
short DOB;


Keyboard(String n){
name=n;
}

Keyboard(String n,String q,short dob){
name=n;
querty=q;
DOB=dob;
}

String printAll(){
String display = name +"\t"+ querty+"\t"+ DOB;
return display;
}
}









