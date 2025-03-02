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


// import java.util.*;

// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Taking decimal input
//         System.out.println("Enter the Decimal Value ::");
//         int n = sc.nextInt();

//         // Decimal to Binary Conversion
//         String binary = Integer.toBinaryString(n);
//         System.out.println("The Conversion of DV to Binary Value is :: " + binary);

//         // Toggle binary (1->0, 0->1)
//         String toggledBinary = "";
//         System.out.println("After Toggling :: ");
//         for (int i = 0; i < binary.length(); i++) {
//             toggledBinary += (binary.charAt(i) == '0') ? '1' : '0';  // Flip 0 to 1 & 1 to 0
//         }
//         System.out.println(toggledBinary);

//         // Binary to Decimal Conversion (after toggle)
//         int decimal = Integer.parseInt(toggledBinary, 2);
//         System.out.println("The Conversion of Toggled BV to DV is :: " + decimal);
//     }
// }
