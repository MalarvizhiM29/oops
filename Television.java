
package myfirst;

class Television {
        public String color;
        public String model;
        public String inches;
        
        public String changechannel(){
            return "Channel Changed";
        }
        
        public String changevolume(){
            return "Volume Changed"; 
       }
    }

public class MyFirst {
    
    public static void main(String[] args) {
        
        Television t= new Television();
        t.color = "Black";
        t.model = "Samsung";
        t.inches = "72inch";
        
        System.out.println(t.changechannel());
        System.out.println(t.changevolume());
    }
    
}
