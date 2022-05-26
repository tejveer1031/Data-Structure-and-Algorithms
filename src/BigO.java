import java.util.HashMap;

public class BigO {
   static  void FindNemo(){// o(n)
        String[] nemo = {"nemo"};

        for (int i = 0; i < nemo.length;i++){
            if(nemo[i] == "nemo"){
                System.out.println("found nemo");
            }
        }
  }
  static  void LogAllPairOfArray(String[] array){//o(n^2)
       for(int j = 0 ; j < array.length-1;j++){
           for(int k = j ; k < array.length-1;k++){
               System.out.println(array[j]+ array[k]);
           }
       }
  }

  public static  void tweet(){
      HashMap<String, Integer> people = new HashMap<String, Integer>();
            people.put("tej",2010);
      people.put("manjot",2012);
      people.put("kiran",2014);
      for (String i : people.keySet()) {
          System.out.println("key: " + i + " value: " + people.get(i));
      }
  }
}
