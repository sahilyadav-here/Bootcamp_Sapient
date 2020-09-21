public class QuestionFour{

     public static void main(String []args){
        findInteger e = new findInteger();
        int[] arr = {1,2,3,4};
        int fin = 2;
        e.findInt(arr,fin);
     }
}

class findInteger{
    public void findInt(int[] arr, int f){
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == f){
                listener(i);
            }
        }
    }
    
    public void listener(int i){
        System.out.println("found it!! at " + i);
    }
}