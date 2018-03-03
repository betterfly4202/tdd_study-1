package addcalculator;

/**
 * Created by orange2652@gmail.com on 2018. 3. 3.
 * Github : https://github.com/myeongkwonhwang
 */
public class AddCalculatorController {
    public static void main(String[] args) {
        int result = 0;
        try {
            result = AddCalculatorDTO.add(AddCalculatorDAO.exeCalculrator());
            System.out.println(result);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
