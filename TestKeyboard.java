class TestKeyboard{
public static void main(String []args){
Keyboard keyboard=new Keyboard("Lenovo");
String res=keyboard.printAll();
System.out.println(res);

short DOB=1889;
Keyboard keyboard2=new Keyboard("Lenovo","board",DOB);
System.out.println(keyboard2.printAll());
}
}