abstract class Quadrilateral {
    private int base;
    private int height;

    public Quadrilateral(){
        this.base = 0;
        this.height = 0;
    }
    
    public Quadrilateral(int base, int height){
      this.base = base;
      this.height = height;
  }
    public int area(){
        return getBase() * getHeight();
    }
    public int getBase(){
        return this.base;
    }
    public void setBase(int base){
       this. base = base;
    }
    
    public int getHeight(){
        return this.height;
    }
    public void setHeight(int height){
        this.height = height;
    }
}



class Square extends Quadrilateral {
    public Square(int base, int height){
      super(base,height);
  }
}

class Rectangle extends Quadrilateral {
    public Rectangle(int base, int height){
      super(base,height);
  }
}

class Parallelogram extends Quadrilateral {
    public Parallelogram(int base, int height){
      super(base,height);
  }
}


public class Questiontwo {
   public static void main(String [] args) {
      Quadrilateral e = new Square(2,2);
      System.out.println(e.area());
   }
}
