// don't delete code! comment it out and write why you didn't use it!
// import java.nio.file.*;
// import java.util.*;
// contains the collections framework, legacy collection classes and whatnot
//import java.io.File;
//import java.util.Arrays;
//import java.util.Scanner;

//public class readstringastext {
// object oriented programming concept. this is the first step in the greedy algorithm. 
// this reads the file. 
//	public static String readFileAsString(String filename)throws Exception
// public static means it is available everywhere in the code. global. private static means available just in this class
//	  {
//	    String data = "";
//	    data = new String(Files.readAllBytes(Paths.get("bullshit.txt")));
//	    return data;
//	  }
// this is what reads the bullshit.txt
//public class ReadingFiles {
//	
//	public static void main(String[] args) {
//		int[] data = readFiles("bullshit.txt");
//		System.out.println(Arrays.toString(data));
//	}
//	
//	public static int[] readFiles(String file) {
//		try {
//			File f = new File(file);
//			Scanner s = new Scanner(f);
//			int ctr = 0;
//			while (s.hasNextInt()) {
//				ctr++;
//				s.nextInt();
//			}
//			int[] arr = new int[ctr];
//			
//			Scanner s1 = new Scanner(f);
//			
//			for (int i = 0; i < arr.length; i++)
//				arr[i] = s1.nextInt();
//			
//			return arr;
//		}
//		catch(Exception e) {
//			return null;
//		}
//	}
//	
//	public static void main(String[] args) throws Exception
// so public static void is 3 different things. public means that hte method is visible and can be called from other objects of other types. other alternatives are private, protected, package and package-private. 
// static means that the method is associated with the class, not a specific instance (object) of that class. this means that you can call the a static method without creating an object of the class
// void means the method has no return value. 
// main needs to exist for java to run the program 
//	  {
//	    String data = readFileAsString("bullshit.txt");
//	    System.out.println(data);
//	    String [] arrOfStr = data.split("");
//	    for (String a : arrOfStr)
//	    	System.out.println(data);
//	  }
// this is what prints the bullshit.txt
// should it print the data? this just confirms the data is there
// so step 2 is to take 10 and 575 and make those the max weights
// do I have to split these lines? 
// probably but also I need to save values from the list. so make it an array? 
//	public String[] split(String regex)
//	{
//		
//	}
//}
// maybe it would be easier if it asked for the inputs, i gave them, that makes a string and that's that. 	



//	public static void main(String[] args) {
//		HashMap<String, String> map = new HashMap<String, String>();
//		try {
//			File file = new File("bullshit.txt");
//			FileReader fileReader = new FileReader(file);
//			BufferedReader bufferedReader = new BufferedReader(fileReader);
//			StringBuffer stringBuffer = new StringBuffer();
//			String line;
//			String weightLimit = Files.readAllLines(Paths.get("bullshit.txt")).get(0);
//// so what this does is it reads all the lines and then sets the weight limit equal to the first number in the list. in this case it is 575. 
////			Pattern pattern = Pattern.compile("");
////			Map<String, String> map = Files.lines("bullsht.txt");
////					.map(pattern::matcher);
////					.collect(toMap(x -> x.group(1), x -> x.group(2)));
//			int count = 0;
////			while ((line = bufferedReader.readLine()) != null) {
////				stringBuffer.append(line);
////				stringBuffer.append("\n");
////			}
//	        while ((line = bufferedReader.readLine()) != null) {
//	            if (count != 0) { // ignore the first line
//	                String[] splitValue = line.split(" ");
//	                map.put(splitValue[0], splitValue[1]);
//	            }     
//	            count++;
//	        }
//			fileReader.close();
////			System.out.println("Contents of file:");
////			System.out.println(stringBuffer.toString());
////			System.out.println(weightLimit);
//			System.out.println(line);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//}
//		
////		String[] pairs = s.split(" "); // This would split it into sections divided by the comma, resulting in an array of Strings with elements such as "type=abc"
////
////		HashMap<String, String> map = new HashMap<String, String>();
////
////		for (String string : pairs) {
////		    String[] keyValue = string.split(" "); // Split on the "=" of an element such as "type=abc", resulting in a String array of two elements, "type" and "abc"
////		    map.put(keyValue[0], keyValue[1]); // Store those values however you'd like
////		    System.out.println(keyValue);
////		};
////		}
////	}
//
////final class MyEntry<K, V> implements Map.Entry<K, V> {
////	private final K key;
////	private V value;
////	
////	public MyEntry(K key, V value) {
////		this.key = key;
////		this.value = value;
////	}	
////	@Override 
////	public K getKey() {
////		return key;
////	}
////	
////	@Override 
////	public V getValue() {
////		return value;
////	}
////	
////	@Override
////	public V setValue(V value) {
////		V old = this.value;
////		this.value = value;
////		return old;
////	}
////	Map.Entry<String, Object> entry = new MyEntry <String, Object>(key, value);
////	System.out.println(entry.getKey());
////	System.out.println(entry.getValue());
//}
//
//
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.HashMap;

//public class readstringastext {
//	public static Map<String, String> map = new HashMap<String, String>();
//	public static void main(String[] args){
//		HashMap<String, String> map = new HashMap<String, String>();
// is the above redundant? 
//			try {
//				File file = new File("bullshit.txt");
//				FileReader fileReader = new FileReader(file);
//				BufferedReader bufferedReader = new BufferedReader(fileReader);
//				String line;
//				String weightLimit = "";
//				String weightLimit = Files.readAllLines(Paths.get("bullshit.txt")).get(0);
//				boolean first = true;
//				while ((line = bufferedReader.readLine()) != null) {
//					if (first) {
//						weightLimit = line;
//						first = false;
//					} else {
//						String[] values = line.split(" ");
//						map.put(values[0], values[1]);
//						String worth = values[1];
//						String weight = values[0];
//						
//                System.out.println(values[0]);
//                System.out.println(values[1]);
//				  System.out.println(weightLimit);     
//				String k = values[0];
//				System.out.println(worth);
//            }	
//				System.out.println(worth);
//				System.out.println(k); the values[0] and values [1] are only in the while loop
//        }
//				System.out.println(map);
// so to get output of the map you need to call it as the map but it prints them with =. 25=30, 125=3000 etc. 
//				System.out.println(weightLimit);
//        fileReader.close();
//    }       catch (IOException e) {
//        e.printStackTrace();
//    }
//			
//}
//}

//	  public static void main(String[] args) {
//		    HashMap<String, String> map = new HashMap<String, String>();
//
//		    try {
//		        File file = new File("bullshit.txt");
//		        FileReader fileReader = new FileReader(file);
//		        BufferedReader bufferedReader = new BufferedReader(fileReader);
//		        StringBuffer stringBuffer = new StringBuffer();
//		        String line;
//		        String weightLimit = Files.readAllLines(Paths.get("bullshit.txt")).get(0);
//		        int count = 0;
//		        while ((line = bufferedReader.readLine()) != null) {
//		            if (count != 0) { // ignore the first line
//		                String[] splitValue = line.split(" ");
//		                map.put(splitValue[0], splitValue[1]);
//		            }     
//		            count++;
//		        }
//		        fileReader.close();
//		    }catch (IOException e) {
//		        e.printStackTrace();
//		    }
//
//	  }
//}

//public class readstringastext {
//
//    public static HashMap<String, String> map = new HashMap<String, String>();
//    public static String weightLimit = "";
//    public static String values = "";
//    public static void main(String[] args){
//
//        try {
//            File file = new File("bullshit.txt");
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line;
//            boolean first = true;
//            while ((line = bufferedReader.readLine()) != null) {
//                if (first) {
//                    weightLimit = line;
//                    first = false;
//                } else {
//                    String[] values = line.split(" ");
//                    map.put(values[0], values[1]);
//                }
//            }
//           
//            fileReader.close();
//        }       catch (IOException e) {
//            e.printStackTrace();
//        }
////        System.out.println(weightLimit);
//        System.out.println(values);
//// so now the weight limit is there
//    }	
//}
//
public class readstringastext {

    public static HashMap<String, String> map = new HashMap<String, String>();
    private static String values = "";
    private static String weightLimit = "";
    public static void main(String[] args){

        try {
            File file = new File("bullshit.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            boolean first = true;
            while ((line = bufferedReader.readLine()) != null) {
                if (first) {
                    weightLimit = line;
                    first = false;
                } else {
                    String[] values = line.split(" ");
                    map.put(values[0], values[1]);
                }

            }
            fileReader.close();
        }       catch (IOException e) {
            e.printStackTrace();
        }
        weightLimit();
        values();
    }

    public static void weightLimit() {
        System.out.println(weightLimit);
    }
    public static void values() {
    	System.out.println(map);
    }
//    public static void map() {
//    	System.out.println(map);
//    }
}