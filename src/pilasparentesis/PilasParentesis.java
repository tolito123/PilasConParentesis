package pilasparentesis;

import java.util.Stack;

public class PilasParentesis {

    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();
        
        pila.push("(");
        pila.push("{");
        pila.push("[");
        pila.push("]");
        pila.push("}");
        pila.push(")");
        
        System.out.println("Pila: " + pila);
        
        if (pila.elementAt(0) == "("){
            if (pila.elementAt(1) == "{"){
                if (pila.elementAt(2) == "["){
                    if (pila.elementAt(3) == "]"){
                        if (pila.elementAt(4) == "}"){
                            if (pila.elementAt(5) == ")"){ 
                                System.out.println("Esta balanceado");
                            } else{System.out.println("Esta desbalanceado");}           
                        } else{System.out.println("Esta desbalanceado");}
                    } else{System.out.println("Esta desbalanceado");}
                } else{System.out.println("Esta desbalanceado");}
            } else{System.out.println("Esta desbalanceado");}
        } else{System.out.println("Esta desbalanceado");}

    }
    
}
