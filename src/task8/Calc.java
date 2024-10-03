package task8;

import java.util.HashMap;
import java.util.Map;

public class Calc {
    private Map<String, Operation> map;

    public Calc(){
        map = new HashMap<String, Operation>();
        map.put("+", (x,y) -> x+y);
        map.put("-", (x,y) -> x-y);
        map.put("*", (x,y) -> x*y);
        map.put("/", (x,y) -> x/y);
    }

    public String doCalc(String operation){
        String[] arr = operation.split(" "); // ["2", "-", "9"]
        Operation op = map.get(arr[1]);
        // parseDouble() -> converts string var to a double var.
        double res = op.execute(Double.parseDouble(arr[0]), Double.parseDouble(arr[2]));
        // valueOf() -> converts any var to string var.
        return String.valueOf(res);
    }
}
