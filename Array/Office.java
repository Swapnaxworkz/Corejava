class Office{

static int []prime_number={2,3,5,7,11};
static byte []odd_number={1,3,5,7,9};
static long []id_number={67489,85335,34678};
static short []even_number={2,4,6,8,10};
static float []ph_number={1.0f,2.0f,3.0f,4.0f,};
static char []section={'a','b','c','d','e'};
static double []dec_number={1.2,2.3,3.4,4.5,5.6};
static boolean []is_java_fun={true,false};
    
public static void main(String[]args){

for(int i=0;i<prime_number.length;i++)
System.out.println(prime_number[i]);

for(int i=0;i<odd_number.length;i++)
System.out.println(odd_number[i]);

for(int i=0;i<id_number.length;i++)
System.out.println(id_number[i]);

for(int i=0;i<even_number.length;i++)
System.out.println(even_number[i]);

for(int i=0;i<ph_number.length;i++)
System.out.println(ph_number[i]);

for(int i=0;i<dec_number.length;i++)
System.out.println(dec_number[i]);

for(int i=0;i<is_java_fun.length;i++)
System.out.println(is_java_fun[i]);

}
}