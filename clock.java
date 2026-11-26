import java.util.*;
class temp{
    int hr,min,sec;
    temp(int h,int m,int s){
        hr=h;
        min=m;
        sec=s;
    }

    boolean isvalide(){
        if(hr<0||hr>23){
            return false;
        }
        if(min>59||min<0){
            return false;
        }
        if(sec>59||sec<0){
            return false;
        }
        return true;
    }

    void disp(){
        if(hr>11){
            System.out.println("Time : "+(hr-12)+":"+min+":"+sec+"PM");
        }
        if(hr<12){
            if(hr==0){
                hr=12;
            }
            System.out.println("Time : "+hr+":"+min+":"+sec+"AM");
        }
    }
    public static void main(String args[]){
        Scanner t=new Scanner(System.in);
        System.out.println("-----Enter Time-------");
        System.out.println("Enter hours : ");
        int h=t.nextInt();
        System.out.println("Enter minuts : ");
        int m=t.nextInt();
        System.out.println("Enter sec : ");
        int s=t.nextInt();

        temp c=new temp(h,m,s);

        if(c.isvalide()){
            System.out.println("Valid time");
            c.disp();
        }
        else{
            System.out.println("Not Valid time\n Enter valid time");
        }
    }
}