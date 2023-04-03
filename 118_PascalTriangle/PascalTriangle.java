import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 7;
        List<Integer> res = generate(numRows);
        System.out.println(res);
    }
    // function generate Pascal Triangle
    public static List<Integer> generate(int rowIndex) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> last = new ArrayList<>();
        last.add(1);
        arr.add(last);
        for(int i = 1; i <=rowIndex; i++)
        {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j = 0; j < last.size()-1; j++)
            {
                curr.add(last.get(j)+last.get(j+1));
            }
            curr.add(1);
            last = curr;
            arr.add(last);
        }
        return arr.get(rowIndex);
    }

}
