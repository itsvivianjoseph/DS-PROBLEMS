import java.util.ArrayList;

class printSUM
{
    static boolean flag = false;
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int n= arr.length;
        int sum =2;
        ArrayList<Integer> ds = new ArrayList<>();
        printS(0,ds,0,sum,arr,n);
    }
    static void printS(int index,ArrayList<Integer> ds,int s,int sum,int[] array,int n)
    
    {
        if(index==n)
        {
            if((s==sum)&&(flag==false))
            {
                System.out.println(" ");
                for(Integer i : ds)
                {
                    System.out.print(i+" ");
                }
                flag=true;
            }
            return ;
        }
        //pick
        ds.add(array[index]);
        s+=array[index];

        printS(index+1,ds,s,sum,array,n);

        s-=array[index];
        ds.remove(ds.size()-1);

        //not pick
        printS(index+1,ds,s,sum,array,n);

    }
}