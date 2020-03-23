import java.util.*;

public class new_job
{
    public static void main(String[] args)
    {
        Stack st = new Stack(10);
        System.out.println(st.pop());

        for(byte i=1;i<=15;i++)
        {
            st.push("Текст #"+i);
        }

        for(byte i=0;i<=10;i++)
            System.out.println(st.pop());
    }
}

class Stack
{
    private String[] nums = new String[1000];
    private int size; //размер стека
    private int count=0; //значений в стеке

    Stack(int size)
    {
        this.size=size;
    }

    public void push(String s)
    {
        if(count==size)
            System.out.println("Stack overflow!");
        else
        {
            nums[count++]=s;
        }
    }

    public String pop()
    {
        if(count==0)
            return "В стеке нет данных";
        else
        {
            return nums[--count];
        }
    }
}