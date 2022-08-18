import java.lang.Math.*;
public class distance {
        public static void main(String arg[])
        {
            int x1,x2,y1,y2;
            double dis;
            x1=2;y1=2;x2=0;y2=0;
            dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
            System.out.println("distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
        }
}
