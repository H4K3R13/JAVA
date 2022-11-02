class scope{
  public static void main(String[] args){
    int x=10;
    if(x==10){
      int y=20;
      System.out.println("X="+x);
      System.out.println("Y="+y);
      x=11;
    }
    System.out.println("X="+x);
    System.out.println("Y="+y);
  }
}
