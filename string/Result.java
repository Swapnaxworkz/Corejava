class Result{
public static void main(String[]marks){
for(int mark=0; mark <marks.length;mark++){
String cgpa = marks[mark];
float per=Float.parseFloat(cgpa);
int percentage = Integer.parseInt(cgpa);
Integer total = 1300;
byte per1 = Byte.parseByte(cgpa);
short per2 = Short.parseShort(cgpa);
double per3 = Double.parseDouble(cgpa);
long per4 = Long.parseLong(cgpa);
boolean per5 = Boolean.parseBoolean(cgpa);
System.out.println(cgpa +"\t" + per +"\t" + percentage +"\t" + per1 +"\t" + per2 +"\t" + per3 +"\t" + per4 +"\t" + per5 +"\t");
}
}
}