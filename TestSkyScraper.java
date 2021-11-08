class TestSkyScraper{
public static void main(String []args){
SkyScraper skyScraper=new SkyScraper("BurjKalifa");
String res=skyScraper.printAll();
System.out.println(res);

double height=558;
SkyScraper skyScraper2=new SkyScraper("BurjKalifa","dubai",829.5);
System.out.println(skyScraper2.printAll());
}
}