class SampleThread extends Thread
{
  public void run()
  {
    for(int i=0;i<5;i++)
      {
        System.out.println(i+"id is : "+Thread.currentThread().getId());
      }
  }
}
class ThreadEx2
  {
    public static void main(String[] args)
    {
      System.out.println("this is a thread concept to get current thread id");
      SampleThread sample1=new SampleThread();
      sample1.start();
      SampleThread sample2=new SampleThread();
      sample2.start();
    }
  }