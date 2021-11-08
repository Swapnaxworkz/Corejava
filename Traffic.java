class Traffic{
String name;
String signal;
short DOM; 

Traffic(String n){
name=n;
}

Traffic(String n,String s,short dom){
name=n;
signal=s;
DOM=dom;

}

String printAll(){
String display = name +"\t"+ signal+"\t"+ DOM;
return display;
}
}









