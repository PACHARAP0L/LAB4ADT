
import java.util.ArrayList;
/* ADT ที่เก็บเลขจำนวนเต็มใดๆ เรียงจากน้อยไปมาก
*/
public class IntegerSet {
    
    ArrayList<Integer> Numbers ;
    /*Rep
    AF = เลขจำนวนเต็มใดๆ เรียงจากน้อยไปมาก และห้ามมี null หรือตัวเลขซ้ำ
    RI -Numbers ห้ามมี null
        -Numbers ตัวเลขซ้ำ
        -Numbers เรียงจากน้อยไปมาก
    */
    public IntegerSet(){
        Numbers = new ArrayList<>();
        CheckRep();
    }

    private void CheckRep(){
        //ตรวจสอบว่า Numbers  ว่ามีช่องว่างและ Numbers เรียงเลขจากน้อยไปมากหรือไม่

        if(Numbers == null)
        throw new RuntimeException("Number is null"); //ถ้า Numbers มีช่องว่างแสดงว่าผิดกฏ 
        if(Numbers.size()>1){
            for (int i = 0; i < Numbers.size()-1; i++) {
                if(Numbers.get(i)>= Numbers.get(i+1)) // ถ้า Numbers ตัวแรกมากกว่า Numbers ตัวถัดไปแสดงว่าผิดกฏ
                throw new RuntimeException("error sort");
            }
        }

    }
    /**
     * @param x เลขจำนวนเต็มใดๆ เรียงจากน้อยไปมาก และห้ามมี null หรือตัวเลขซ้ำ
     */

     public void add(Integer x) {
        if(!Numbers.contains(x) && Numbers != null && x != null) {
            if (Numbers.size()==0) {
                Numbers.add(x);
            } else {
                for (int i = 0; i < Numbers.size(); i++) {
                    if(i==Numbers.size()-1){
                        Numbers.add(x);
                        break;
                    }
                    if(Numbers.get(i)< x && x<Numbers.get(i+1)){
                        Numbers.add(i+1,x);
                        break;
                    }
                }
            }
        }

     }

        public String toString(){
            return Numbers.toString();
        }
     
}
