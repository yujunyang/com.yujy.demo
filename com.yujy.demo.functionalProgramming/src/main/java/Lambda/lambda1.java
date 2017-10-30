package Lambda;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

/**
 * Created by Administrator on 2017/10/27.
 */
public class lambda1 {
    public static void main(String[] args) {
        //编写lamdba表达式的不同形式
        Runnable noArguments = ()-> System.out.println("Hello World");

        ActionListener oneArgument = event -> System.out.println("button clicked");

        Runnable multiStatement = () ->{

            System.out.print("Hello");
            System.out.println("World");
        };

        BinaryOperator<Long> add = (x,y) -> x+y;

        BinaryOperator<Long> addExplicit = (Long x,Long y) -> x+y;


    }
}
