package java_khjInstance;


class StarPrint{
   int num;
   
   public StarPrint(int num) {
      this.num = num;
   }
   
   public int getNum() {
      return num;
   }

   public void setNum(int num) {
      this.num = num;
   }
   
   public void getPrint() {
      for(int i=1; i<=this.num;i++) {
         for(int j=1; j<=i;j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
   //getPrint(3);
   public void getPrint(int num) {
      
      for(int i=1; i<=num;i++) {
         for(int j=1; j<=i;j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}