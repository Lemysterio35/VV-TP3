package fr.istic.vv;

public class StringUtils {

    private StringUtils() {}

    public static boolean isBalanced(String str) {
        if(str.lenght % 2 != 0) { return null;}
        else{
          Stack structure = new Stack();
            int cpt = 0;
            while(cpt < str.lenght){
            if(str.charAt(cpt).equals('{')){
                structure.push('{')
                cpt++;
            }
            if(str.charAt(cpt).equals('(')){
                structure.push('(')
                cpt++;
            }
            if(str.charAt(cpt).equals('[')){
                structure.push('[')
                cpt++;
            }
            String tmp = structure.peek();
            if(str.charAt(cpt).equals('}') && tmp.equals('{')){
                structure.pop();
                cpt++;
                
             if(str.charAt(cpt).equals(')') && tmp.equals('(')){
                structure.pop();
                cpt++;
                 
             if(str.charAt(cpt).equals(']') && tmp.equals('[')){
               structure.pop();
                cpt++;
             
             else{
                 return null;
                
             }
              return true;   
        }
                                 
                                 
        
    }

}
