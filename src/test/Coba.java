package test;
//import java.util.*;  // Import the Scanner class
//public class Coba {
//
//
//
//    public static void findAndContest(String[][] maps,boolean[][] visited,Set<String> tempFraction,int row, int col,int x, int y){ //Map< String,Integer> fractions
//        if(x < 0 || x >= row){ // make sure not not exceed the limit
//            return;
//        }
//        if(y < 0 || y >= col){ // make sure not not exceed the limit
//            return;
//        }
//        if(visited[x][y]){ // ignore it when already visited
//            return;
//        }
//        visited[x][y] = true; // set true when the maps is already visited
//        if(maps[x][y].equals("#")){ // ignore #
//            return;
//        }
//        if(!maps[x][y].equals(".")){ // add fraction to the Set tempFraction
//            tempFraction.add(maps[x][y]);
//        }
//
//        findAndContest(maps,visited,tempFraction,row,col,x,y+1); // move direction right
//        findAndContest(maps,visited,tempFraction,row,col,x,y-1); // move direction left
//        findAndContest(maps,visited,tempFraction,row,col,x+1,y); // move direction up
//        findAndContest(maps,visited,tempFraction,row,col,x-1,y); // move direction down
//        return;
//    }
//
//    public static void main(String[] args) {
//
//
//        Scanner input = new Scanner(System.in);
//
//        int testCase = input.nextInt();
//
//        for (int i = 1; i <=testCase; i++) {
//            int row = input.nextInt();
//            int col = input.nextInt();
//
//            String[][] maps = new String[row][col]; // map the input string to 2d array
//            boolean[][] visited= new boolean[row][col]; // array to store if the node is already visited
//            Set<String> tempFractions = new HashSet<String>(); // using set to store temp fraction
//            Map< String,Integer> fractions = new TreeMap< String,Integer>(); // using tree map to store fraction by alpahbetical order
//
//            for (int j = 0; j < row; j++) { // init data
//                String str = input.next();
//                char[] ch = str.toCharArray();
//                for (int k = 0; k < ch.length; k++) {
//                    maps[j][k] = String.valueOf(ch[k]);
//                    visited[j][k] = false;
//                }
//            }
//            int Conquer = 0;
//            for (int j = 0; j < row; j++) {
//                for (int k = 0; k < col; k++) {
//                    tempFractions.clear(); // reset temp fraction every region check
//                    findAndContest(maps,visited,tempFractions,row,col,j,k);
//                    Iterator<String> tempITR = tempFractions.iterator();
//                    if(tempFractions.size() > 1){ // if set fraction > 1 there's a contest
//                        Conquer++;
//                    }else{ // if set = 1 then store value in set(tempfraction) to fraction
//                        while(tempITR.hasNext()){
//                            String frac = tempITR.next();
//                            if(fractions.get(frac) != (null)){
//                                fractions.put(frac, fractions.get(frac)+1);
//                            }else if(fractions.get(frac) == (null)){
//                                fractions.put(frac, 1);
//                            }
//                        }
//                    }
//                }
//            }
//            System.out.println("Case "+i+":");
//            for(Map.Entry<String,Integer> entry : fractions.entrySet()) {
//                String key = entry.getKey();
//                Integer val = entry.getValue();
//
//                System.out.println(key+" "+val);
//            }
//            System.out.println("contested "+Conquer);
//        }
//    }
//}

//public class Coba{
//    public static void main(String[] args) {
//        int i;
//        for (i=1; i<=100; i++) {
//            if (i % 15 == 0) {
//                System.out.printf("FizzBuzz\n");
//            } else if (i % 5 == 0) {
//                System.out.printf("Buzz\n");
//            } else if (i % 3 == 0) {
//                System.out.printf("Fizz\n");
//            } else{
//                System.out.printf("%d\n", i);
//            }
//        }
//    }
//}


import java.util.*;

public class Coba {


//    public static void main(String[] args) {
//        int i;
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        characters = new ArrayList<Character>();
//        for (i=0; i<s.length(); i++) {
//            characters.add(s.charAt(i));
//        }
//        running = new ArrayList<Character>();
//        bitmask = 0;
//        permutations();
//
//    }
//}


//import java.util.*;
//public class Coba {
//    static int binarySearch(int[] array, int value, int low, int high) {
//        int mid;
//        if (high < low) {
//            return -1;
//        } else {
//            mid = (low + high)/2;
//            if (array[mid] > value) {
//                return binarySearch(array, value, low, mid);
//            } else if (array[mid] < value) {
//                return binarySearch(array, value, mid+1, high);
//            } else {
//                return mid;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int i, value, answer;
//        int[] array = new int[10000];
//        for (i=0; i<10000; i++) {
//            array[i] = sc.nextInt();
//        }
//        for (i=0; i<10000; i++) {
//            value = sc.nextInt();
//            answer = binarySearch(array, value, 0, 9999);
//            System.out.printf("%d\n", answer);
//        }
//    }
//}


    public static void main(String[] args) {

    int i = 0;
    while(i <= 10) {  System.out.println("iteration" + i);
    }

    }

    }

