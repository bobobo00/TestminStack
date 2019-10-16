package test;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test
 * @Description TODO
 * @Auther danni
 * @Date 2019/10/15 20:36]
 * @Version 1.0
 **/

public class Test {
/* *
    * @Author danni
    * @Description 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
    * @Date 17:07 2019/10/16
    * @Param
    * @return
 **/
    private int[] stack=new int[16];
    private int[] minstack=new int[16];
    private int size=0;
    private int minsize=0;
    private int minnum=0;
    public void push(int node) {
        if(minsize!=0){
            minnum=minstack[minsize-1];
        }else{
            minnum=node;
        }
        if(node<=minnum){
            minstack[minsize++]=node;
        }
        stack[size++]=node;
    }

    public void pop() {
        int num=stack[size-1];
        if(num==minstack[minsize-1]){
            minsize--;
        }
        size--;
    }

    public int top() {
        return stack[size-1];
    }

    public int min() {
        return minstack[minsize-1];
    }

    public static void main(String[] args) {


    }
}
