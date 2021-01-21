public class WarmUpExercises {
    public static void main(String[] args) {
        //Challenge 1
        for (int i=100; i>=0; i=i-5){
            System.out.println(i);
        }
        //Challenge 2
           for (int i=0; i<=100; i=i+10){
//            if(i%20==0)
//                System.out.println(i+"java");
//            else
//                System.out.println(i);
               System.out.println(i%20==0?i+"java":i);
        }
        //Challenge 3
        System.out.println(timeToSki(50));


    }
    //Challenge 4
    public static boolean timeToSki(int depth){

        return depth>30;
    }
}
