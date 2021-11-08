class TestMusicInstrument{
public static void main(String []args){
MusicInstrument musicInstrument=new MusicInstrument("Guitar");
String res=musicInstrument.printAll();
System.out.println(res);

short cost=1500;
MusicInstrument musicInstrument2=new MusicInstrument("Guitar","Bangolore",cost);
System.out.println(musicInstrument2.printAll());
}
}