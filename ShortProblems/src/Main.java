

public class Main {

    public static void main(String[] args) {

        //Random exercises to play around with basic Loops structuring and logic

        //1
        //a
//        for(int i = 1; i <= 6; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print(j);
//            }
//            for(int k = 5; k >= i; k--){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        //b
//        for(int i = 1; i <= 6; i++){
//            for(int j = i; j < 6; j++){
//                System.out.print(j);
//            }
//            for(int k = 1; k <= i; k++){
//                System.out.print("&");
//            }
//            System.out.println("");
//        }

        //c
//        System.out.println("@");
//        for(int i = 1; i <= 5; i++){
//            System.out.print("@");
//            for(int j = 1; j <= i; j++){
//                System.out.print(" ");
//            }
//            System.out.println("@");
//        }
//        for(int k = 5; k > 0; k--){
//            System.out.print("@ ");
//        }


        //2
//        for(int i = 1, b = 10, c = 11, d = 20, e = 21, f = 30; i <= 10; i++, b--, c++, d--, e++, f--){
//            System.out.println(i + "  " + b + "  " + c + "  " + d + "  " + e + "  " + f + "  ");
//        }


        //3
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Rows: ");
//        int height = sc.nextInt();
//        System.out.print("Columns: ");
//        int width = sc.nextInt();
//        if(height != 0 || width != 0){
//            for(int i = 1; i <= height; i++){
//                System.out.print("B ");
//                for(int j = 1; j <= width; j++){
//                    System.out.print("B ");
//                }
//                System.out.println("");
//            }
//            System.out.println("");
//        }
//        else {
//            //print error
//        }


        //4
//        Scanner sc = new Scanner(System.in);
//        int smallest = 0, largest = 0, count = 1;
//        int i = sc.nextInt();
//        smallest = i;
//        largest = i;
//        while(count < 10){
//            int b = sc.nextInt();
//            if(b > largest){
//                largest = b;
//            }
//            if(b < smallest){
//                smallest = b;
//            }
//            count++;
//        }
//        System.out.println("Smallest: " + smallest);
//        System.out.println("Largest: " + largest);


        //5
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Base: ");
//        int base = sc.nextInt();
//        System.out.print("Exponent: ");
//        int exp = sc.nextInt();
//        int counter = 0, result = 1;
//        do{
//            result *= base;
//            counter++;
//        } while(counter < exp);
//        System.out.println("Result: " + result);


        //6
        //1st way
//        int totalOdds = 1;
//        int totalEvens = 0;
//        for(int i = 1; i <= 100; i++){
//            if(i % 2 != 0){
//                totalOdds *= i;
//                if(i == 19){
//                    System.out.println(totalOdds);
//                }
//            }else if(i % 2 == 0){
//                totalEvens += i;
//            }
//        }
//        System.out.println(totalEvens);
//        //2nd way
//        int odds = 1;
//        int evens = 0;
//        for(int i = 1; i <= 20; i+=2){
//            odds *= i;
//        }
//        for(int i = 2; i <= 100; i+=2){
//            evens += i;
//        }
//        System.out.println(odds);
//        System.out.println(evens);


        //7
        //a
//        for(int i = 7; i >= 1; i--){
//            //print empty triangle before $ signs
//            for(int j = 1; j < i; j++){
//                System.out.print(" ");
//            }
//            //print 1st half identical triangle
//            for(int k = 7; k >= i; k--){
//                System.out.print("$");
//            }
//            //print 2nd half identical triangle
//            for(int k = 7; k >= i; k--){
//                System.out.print("K");
//            }
//            System.out.println();
//        }
//        System.out.println();

        //b - look into that
//        for(int i = 5; i >= 1; i--){
//            //print empty triangle before # signs
//            for(int j = 0; j < i; j++){
//                System.out.print(" ");
//            }
//            System.out.print("#"); //print 1st # after spaces
//            //print the spaces between 1st and 2nd #
//            for(int k = 6; k >= i; k--){
//                System.out.print(" ");
//            }
//            //same
//            for(int k = 6; k >= i; k--){
//                System.out.print(" ");
//            }
//            System.out.print("#"); // print 2nd # after spaces
//            System.out.println();
//        }
//        for(int k = 8; k >= 0; k--){
//           System.out.print("# ");
//        }
//        System.out.println();


        //8
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        boolean isPrime = true;
//        for(int i = 2; i < input/2; i++){
//            // start at 2 - because all prime numbers are divisible by 1 by default
//            // i < half the number (a little trick to reduce the time of loop - next line)
//            // a number can't fully divide by a number bigger than the half of that number (so we reduce the speed to check)
//            if (input % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        if (isPrime) {
//            System.out.println("YES");
//        }
//        else {
//            System.out.println("NO");
//        }


        //9
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        int numOfDig = 0;
//        do {
//            input /= 10;
//            numOfDig++;
//        }
//            while(input != 0);
//            System.out.println(numOfDig);


        //10
//        Scanner sc = new Scanner(System.in);
//        int input1 = sc.nextInt();
//        int input2 = sc.nextInt();
//        int sum = 0, mul = 1;
//        if (input1 < input2) {
//            for(int i = input1 + 1; i < input2; i++){
//                sum += i;
//                mul *= i;
//            }
//            System.out.println(sum);
//            System.out.println(mul);
//        }else{
//            //error
//            System.out.println("Error");
//        }


        //11 - take a look
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        int count = 0, largest = 0;
//        boolean isPrime = true;
//        for(int i = 1; i < input; i++){
//            isPrime = true;
//            for(int j = 2; j < i; j++){
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime && i != 2) {
//                count++;
//                largest = i;
//                System.out.println(i);
//                isPrime = false;
//            }
//        }
//        System.out.println("Total number of prime numbers are: " + count);
//        System.out.println("Largest prime number is: " + largest);


        //12 - CANNOT FINISH
//        Scanner sc = new Scanner(System.in);
//        System.out.print("How many prime numbers you want to print: ");
//        int input = sc.nextInt();
//        int sum = 0, num = 3; //because we start after 2 (to check against that number for prime numbers)
//        boolean isPrime = true;
//        if (input > 1) {
//            System.out.println("2");
//            for(int i = 2; i <= input;){
//                for(int j = 2; j <= Math.sqrt(num); j++){
//                    if(num % j == 0){
//                        isPrime = false;
//                        break;
//                    }
//                }
//                if (isPrime) {
//                    System.out.println(num);
//                    sum += num;
//                    i++;
//                }
//                isPrime = true;
//                num++;
//            }
//        }else {
//            //error
//            System.out.println("Input can't be negative");
//        }
//
//        System.out.println(sum);


        //13
//        int []arr1 = {1,2,3,4,5,6,7,8,9,10};
//        int []arr2 = {11,12,13,14,15,16,17,18,19,20};
//        int []arr3 = new int[20];
//        int index = 0;
//        for(int i = 0; i < arr1.length; i++){
//            arr3[index++] = arr1[i];
//            arr3[index++] = arr2[i];
//        }
//        for(int j = 0; j < arr3.length; j++){
//            System.out.print(arr3[j] + "  ");
//        }


        //14
//        int []arr1 = {1,2,9,4,6,8,66,77,99};
//        int small = arr1[0], large = arr1[0];
//        int sSmall = -1, sLarge = -1;
//        for (int j : arr1) {
//            if (j > large) {
//                sLarge = large;
//                large = j;
//            }
//            if (j <= small) {
//                sSmall = small;
//                small = j;
//            }
//        }
//        System.out.println(sSmall + "   " + sLarge);


        //15
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Choose a number from the array: ");
//        int input = sc.nextInt();
//        int[] arr = {1,2,3,4,5,5,6,7,8,8,9,9,1,10};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == input) {
//                System.out.println("Number found at index: " + i);
//            }
//        }


        //16
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Array values: ");
//        int[] arr = new int[10];
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.print("First number: ");
//        int num1 = sc.nextInt();
//        System.out.print("Second number: ");
//        int num2 = sc.nextInt();
//        //find
//        int indexA = 0, indexB = 0;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] == num1){
//                indexA = i;
//            }
//            if(arr[i] == num2){
//                indexB = i;
//            }
//        }
//        //swap
//        int temp = arr[indexA];
//        arr[indexA] = arr[indexB];
//        arr[indexB] = temp;
//
//        //check print
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i] + " ");
//        }


        //17
//        Scanner sc = new Scanner(System.in);
//        System.out.print("First Array values: ");
//        int[] arr1 = new int[10];
//        for(int i = 0; i < arr1.length; i++){
//            arr1[i] = sc.nextInt();
//        }
//        System.out.println("Second Array values: ");
//        int[] arr2 = new int[10];
//        for(int i = 0; i < arr2.length; i++){
//            arr2[i] = sc.nextInt();
//        }
//        for(int i = 0; i < arr1.length; i++){
//            for(int j = 0; j < arr2.length; j++){
//                if(arr1[i] == arr2[j]){
//                    System.out.println("Same number {" + arr1[i] + "} " +
//                            "found at index: " + "{" + i + "}" + " at Array1 " +
//                            "& index: " + "{" + j + "} " + "at Array2");
//                }
//            }
//        }


        //18
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input elements: ");
//        char[] arr = new char[10];
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = sc.next().charAt(0);
//        }
//
//        for(int i = 0; i < arr.length; i++){
//                //optimize (Stackoverflow - How to compare character ignoring case in primitive types
//                if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'
//                    || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U'){
//                    System.out.println("Vowel found: " + arr[i]);
//                }
//        }


        //19
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Array 1:");
//        char[] arr1 = new char[5];
//        for(int i = 0; i < arr1.length; i++){
//            arr1[i] = sc.next().charAt(0);
//        }
//        System.out.print("Array 2: ");
//        char[] arr2 = new char[5];
//        for(int i = 0; i < arr2.length; i++){
//            arr2[i] = sc.next().charAt(0);
//        }
//        for(int i = 0; i < arr1.length; i++){
//            char temp = arr1[i];
//            arr1[i] = arr2[i];
//            arr2[i] = temp;
//        }
//
//        System.out.println("New Array 1: " + Arrays.toString(arr1));
//        System.out.println("New Array 2: " + Arrays.toString(arr2));


    }
}
