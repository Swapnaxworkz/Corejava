class Workshop{
String name;
String mech;
short DOB;


Workshop(String n){
name=n;
}

Workshop(String n,String m,short dob){
name=n;
mech=m;
DOB=dob;
}

String printAll(){
String display = name +"\t"+ mech+"\t"+ DOB;
return display;
}
}









