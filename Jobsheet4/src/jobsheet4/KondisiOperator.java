package jobsheet4;

/**
 *
 * Created by 21343030_Muhammad Gilang Bagindo
 */
public class KondisiOperator {
    public static void main(String[]args){
        String status = "";
        int grade = 50;
        
        //mendapatkan status pelajar
    status = (grade>=60)? "passed" : "fail";
    
    //print semua
    System.out.println(status);
    }
}
