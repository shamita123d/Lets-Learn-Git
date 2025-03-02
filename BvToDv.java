class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Decimal Value ::");
        int n = sc.nextInt();
        
        //  System.out.println("The Convertion of DV to Binary Value can be given as :: ");
String binary=Integer.toBinaryString(n);
    // System.out.println(binary);
        String reverse="";
        // System.out.println("After toggling :: ");
      for(int i=binary.length()-1;i>=0;i--){
          reverse=reverse+ binary.charAt(i);
      }
    //   System.out.println(reverse);

System.out.println("The conversion of BV to DV can be given as :: ");
    int decimal=Integer.parseInt(reverse,2);
    System.out.println(decimal);
    }
}
