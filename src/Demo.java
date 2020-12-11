import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo {


    public static void main(String arg[]){
        List<String> name=new ArrayList();
        name.add("surbhi");
        name.add("sonal");
        name.add("manasi");
        name.add("nisha");
        name.add("priya");
        name.sort(Comparator.naturalOrder());
        System.out.println(name);

    }
}
