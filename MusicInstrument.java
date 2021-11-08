class MusicInstrument{
String name;
String place;
short cost; 

MusicInstrument(String n){
name=n;
}

MusicInstrument(String n,String p,short c){
name=n;
place=p;
cost=c;

}

String printAll(){
String display = name +"\t"+ place+"\t"+ cost;
return display;
}
}









