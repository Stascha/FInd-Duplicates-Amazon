import java.util.*;

public class HelloWorld
{

   
    public static List<Integer> findDuplicates(List<Integer> list)
    { 
         Set<Integer> setToReturn = new HashSet<>(); 
         Set<Integer> set1        = new HashSet<>();

        for (Integer yourInt : list)
        {
             if (!set1.add(yourInt))
            {
                 setToReturn.add(yourInt);
            }
        }
  
        List<Integer> aList = new ArrayList<Integer>(setToReturn);
        List<Integer> lList = new LinkedList<Integer>(setToReturn);   
        
        return aList;

    }
    
     public static void main(String []args)
     {
     
      
        List<Integer> aList = new ArrayList<Integer>();
        List<Integer> lList = new LinkedList<Integer>();

        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
     
        System.out.print(list);
        System.out.println();
        
      
        aList = findDuplicates(list);
        lList = findDuplicates(list);
        
        System.out.print(aList);
        System.out.println();
        System.out.print(lList);
        

     }

    
}

