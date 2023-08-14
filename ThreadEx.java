class SampleThread extends Thread
{
  public void run()
  {
    for(int i=0;i<5;i++)
      {
        System.out.println(i);
      }
  }
}
class ThreadEx
  {
    public static void main(String[] args)
    {
      SampleThread sample=new SampleThread();
      sample.start();
    }
  }