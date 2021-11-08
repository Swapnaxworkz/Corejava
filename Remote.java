class Remote{
String name;
String dish;
short DOB;


Remote(String n){
name=n;
}

Remote(String n,String d,short dob){
name=n;
dish=d;
DOB=dob;
}

String printAll(){
String display = name +"\t"+ dish+"\t"+ DOB;
return display;
}
}









