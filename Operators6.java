   class operators {
    public static void main(String[] args)
    {
        // Declaring variable 
        int i = 5;
        int j = 7;
 
        // bitwise And
     
        System.out.println("i&j = " + (i & j));
        
       // bitwise Or
       
        System.out.println("i|j = " + (i | j));
        
              // bitwise xor
              
        System.out.println("i^j = " + (i ^ j));
        
        // bitwise not
        
        System.out.println("~i = " + j);
        
        i &= j;
        System.out.println("i= " + i);
    }
}