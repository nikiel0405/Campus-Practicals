class Stock {
   
   private String name;
   private double openingPrice;
   private double[] closingPrices;
  
   
   public Stock(String name,double openingPrice, double day1, double day2,
                double day3, double day4, double day5){
                
      this.name = name;
      this.openingPrice = openingPrice;
      double [] closingPrices = new double[5];
      closingPrices[0]= day1;
      closingPrices[1] = day2;
      closingPrices[2] = day3;
      closingPrices[3] = day4;
      closingPrices[4] = day5;
      
      this.closingPrices = closingPrices;
                 
               
   } 
   
   public Stock(String name, double openingPrice, double[] prices){
      
      this.name = name;
      this.openingPrice = openingPrice;
      double[] closingPrices = prices;
   }
   
   public String getName(){
      return this.name;
   }
   
   public void setPrice(int day ,double price){
      closingPrices[day] = price;
   }
   
   public  double getMax (){
      
      double high = 0;
      
      for(int i = 0 ; i<5; i++){
         
         if(closingPrices[i] >high){
            high = closingPrices[i];
         }
      }
      return high;
   }

   public double averagePrice(){
      double sum = 0;
      for(int i = 0;i<5;i++){
      sum+=closingPrices[i];
      }
      return (sum/5);
   }

   
   public int largestChange(){
      int day = 0;
      int change = 0;
      for(int i = 0; i<5 ;i++){
         int x = (int)(openingPrice - closingPrices[i]);
         if(x>change){
            change = x;
            day = i;
         }
      }
      return day;
   }

   public void printDetails(){
      System.out.println("Company name = "+this.name);
      System.out.println("Opening  Price = "+this.openingPrice);
      System.out.print("Mon         Tues        Wed         Thurs       Fri");
      System.out.println();
      for(int i = 0;i<5;i++){
         System.out.print(closingPrices[i]+"     ");
      }
   }
   
   public String makeSymbol(){
      StringBuffer sym = new StringBuffer();
      int noWord = 1;
      for(int i = 0; i<name.length();i++){
         if(name.charAt(i) == ' '){
            noWord++;
         }   
      }
   
      if(noWord >2){
        sym.append(name.charAt(0));
        sym.append(name.charAt(1));
        
        for(int i = 0; i<name.length();i++){
         if(name.charAt(i) == ' '){
            sym.append(name.charAt(i));
            sym.append(name.charAt(i+1));
         }   
      }  
         
      
      
      }
      else if(noWord == 2){
        sym.append(name.charAt(0));
        sym.append(name.charAt(1));
        sym.append(name.charAt(2));
        for(int i = 0; i<name.length();i++){
         if(name.charAt(i) == ' '){
            sym.append(name.charAt(i+1));
            sym.append(name.charAt(i+2));
         }   
         }  
  
      }
      else if(noWord == 1){
      
      for(int i = 0; i<5 ; i++){
         sym.append(name.charAt(i));
      
      }
      
      }
      
   return (sym.toString()).toUpperCase();
   }







}