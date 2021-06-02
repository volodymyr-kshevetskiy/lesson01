package com.gmail.kshev.volod;

public class lesson01 {
	public static void main(String[] args) {
		
		byte a = 17;   
		short b = 8; 
		int c = 67; 
		long d = 3900928478325678l;
		
		float e = -3.99f; 
		double f = 7793030.283398d;
		
		char g = 'g';
		
		boolean h = false; 
		h = 5>4;           
		
			
		System.out.println(h);
		
		// first commit to github
		
		System.out.println();
		
		float num1 = 4.25f;
		int num2 = 74;
		
 
		System.out.println(Math.max (num1,num2));
		System.out.println(Math.min (num1,num2));
		
		System.out.println();
		
		System.out.println("Byte.MIN    = " + Byte.MIN_VALUE);
        System.out.println("Byte.MAX    = " + Byte.MAX_VALUE);
        System.out.println("Short.MIN   = " + Short.MIN_VALUE);
        System.out.println("Short.MAX   = " + Short.MAX_VALUE);
        System.out.println("Integer.MIN = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX = " + Integer.MAX_VALUE);
        System.out.println("Long.MIN    = " + Long.MIN_VALUE);
        System.out.println("Long.MAX    = " + Long.MAX_VALUE);
        System.out.println("Float.MIN   = " + Float.MIN_VALUE);
        System.out.println("Float.MAX   = " + Float.MAX_VALUE);
        System.out.println("Double.MIN  = " + Double.MIN_VALUE);
        System.out.println("Double.MAX  = " + Double.MAX_VALUE);
        
        System.out.println();
        
        int array[] = new int[]{10, 11, 88, 2, 12, 120, 226, 888, -1000, 24};
        
        
        int max = getMax(array);
        System.out.println("Максимальне значення: "+max);
     
        
        int min = getMin(array);
        System.out.println("Мінімальне значення: "+min);}
        
        public static int getMax(int[] inputArray){ 
            int maxValue = inputArray[0]; 
            for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){ 
                 maxValue = inputArray[i]; 
              } 
            } 
            return maxValue; 
          }
         
        public static int getMin(int[] inputArray){ 
            int minValue = inputArray[0]; 
            for(int i=1;i<inputArray.length;i++){ 
              if(inputArray[i] < minValue){ 
                minValue = inputArray[i]; 
              } 
            } 
            return minValue;
            
          
		
		
}	

}
