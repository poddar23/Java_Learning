
public class PatternWork {
	public static void main(String[] args) {
//		
//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		1 2 3 4 5
		
//		int n = 5; 
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//	}
//	     }
//}


//   0
//   1 0
//   0 1 0
//   1 0 1 0
//   0 1 0 1 0

//int n = 5; 
//
//for (int i = 1; i <= n; i++) {
//    for (int j = 1; j <= i; j++) {
//       
//        System.out.print((j % 2 == 0 ? "1 " : "0 "));
//    }
//    System.out.println();
//     }
//   }
//}

//A
//B C
//D E F
//G H I J
//K L M N O
     
int n = 5; 
char ch = 'A';

for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(ch + " ");
        ch++; 
    }
    System.out.println();
    }
   }
  }
 