class Main{
  public static void ocean(){
    System.out.print("FSH");
  }
  public static void lake(int temp){
    if(temp > 65){
      System.out.print(" ><)))> ");
      temp -= 1;
      lake(temp);
    }
  }
  public static void main(String[] args){
    lake(73);
    ocean();
  }
}