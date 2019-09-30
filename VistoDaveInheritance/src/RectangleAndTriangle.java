/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dave
 */


package Box;

public class RectangleAndTriangle {
   
   public static void main(String [] args){
        Box box = new Box(0,0,0);
       
        box.boxA();
        
        
        System.out.println("Box a: " + box.toString());
        System.out.println("Box a surface area: "+ box.getArea());
        
        
        
        box.boxB();
        System.out.println("Box b: " + box.toString());
        System.out.println("Box b surface area: "+ box.getArea());
        
        System.out.println("Check if Box a and Box b are equal? " + box.equals());
        
        IsoscelesRight test = new IsoscelesRight(3);
        Geometric4Tester tst = new Geometric4Tester();
        
        System.out.println("IsoscelesRight c" + test.toString());
        System.out.println("IsoscelesRight c area: " + test.getArea());
        
        
        System.out.println("IsoscelesRight d" + test.toString());
        System.out.println("IsoscelesRight d area: " + test.getArea());
        
        
        
        System.out.println("Check if IsoscelesRight c and IsoscelesRight d are equal? " + test.equals());
    }
    
    
        //end of main method
    
    
    
    //rectangle2 method
    
    public static class Rectangle2{
         int area, w, l, h;
         String ans;
        
         public int getArea(){
            area = w*l*h;
            return area;
        }
        
        public String toString(){
            return "[Box: length = " + l + ",width = " + w +", height = " + h + "]";
        }
        
    } //end of rectangle2
    
    
    
    //box class subclass of rectangle
    public static class Box extends Rectangle2{
        private int height;
        
        public Box(int l, int w, int h){
            Rectangle2 box = new Rectangle2();
        }
        
        public int getHeight(){
            return height;
        }
        
        public int getArea(){
            area = (2*w*l) + (2*l*h) + (2*h*w);
            return area;
        }
        
        public int boxA(){
            w = 3;
            l = 2;
            h = 4;
            return w + l + h;
        }
        
        public int boxB(){
            w = 7;
            l = 4;
            h = 4;
            return w + l + h;
        }
        
        public String equals(){
            if (boxA() == boxB()){
                ans = "true";
            }
            else{
                ans = "false";
            }
            
            return ans;
        }
        
    }//end of box class
  
    
   
    public static class Triangle{  //Triangle class
        double equalSide = 3, area, sideC;
        String ans;
        
        public String equals(){
            if (equalSide == equalSide){
                ans = "true";
            }
            else{
                ans = "false";
            }
            
            return ans;
        }
    
        public double getArea(){
            area = (equalSide*equalSide)/2;
            return area;
        }
        
    } // end of triangle
    //isosceles class subclass of triangle
    public static class IsoscelesRight extends Triangle {
        
        public IsoscelesRight(double equalSize){
            
        }
        
        public double getEqualSide(){
            return equalSide;
        }
        
        public double getNotEqualSide(){
            sideC = equalSide*Math.sqrt(2);
            return sideC;
        }
        
        public String toString(){
            return "[IsoscelesRight: equal_side = " + getEqualSide() + ",not_equal side = " + getNotEqualSide();
        }
    }  //end of isoceles
    
    public static class Geometric4Tester{
        
        public Geometric4Tester(){
            IsoscelesRight tst = new IsoscelesRight(3);
            tst.equalSide = 3.0;
        }
        }
        }
    

