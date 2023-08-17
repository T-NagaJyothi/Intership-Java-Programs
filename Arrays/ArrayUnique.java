import java.util.Scanner;
class ArrayUnique
  {
    public static void main(String[] args)
    {
      int a[]={20,56,43,56,4,90,43};
      int size=a.length;
      boolean b[]=new boolean[size];
      for(int i=0;i<size;i++)
        {
          b[i]=false;
        }
      System.out.println("unique elements are");
      for(int i=0;i<a.length;i++)
        {
          int count=1;
          if(b[i]==true)
            continue;
          for(int j=i+1;j<a.length;j++)
            {
              if(a[i]==a[j])
              {
                count++;
                b[j]=true;
              }
            }
          if(count==1)
            System.out.println(a[i]);
        }
    }
  }