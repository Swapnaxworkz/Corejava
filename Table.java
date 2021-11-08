class Table{
 static int shape(String []args){
 for(int num=0; num<args.length; num++){
    System.out.println(args[num]);
     
   }  
    return 2;   
        
  }
   
  static int shape(byte legs ,String []args){
    System.out.println("no of legs table have");
     for(int num=0; num<args.length; num++){
    System.out.println(args[num]  +"\t"  +legs);
      }
	
    return 22;
   }
   
   static void property(String []prop ,byte legs ,String []args ){
  System.out.println("table having some properties");
    for(int num=0; num<args.length; num++){
    System.out.println(args[num]  +"\t"  +legs);
      }
   }

} 