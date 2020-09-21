abstract class AbstractSearch { 
    public abstract boolean search(Object [] obj_list, Object obj); 
}

class IntegerSearch extends AbstractSearch {
    public boolean search(Object [] obj_list, Object obj){
        for(int i = 0; i<obj_list.length;i++){
            if(obj_list[i] == obj){
                return true;
            }
        }
      return false;
  }
}

class StringSearch extends AbstractSearch {
     public boolean search(Object [] obj_list, Object obj){
         for(int i = 0;i<obj_list.length;i++){
            if(obj_list[i]==obj){
                return true;
            }
        }
      return false;
     }
}


public class QuestionThree {
   public static void main(String [] args) {
      IntegerSearch e = new IntegerSearch();
      Object o = new Object();
      Object[] ob = {o};
      System.out.println(e.search(ob,o));
   }
}