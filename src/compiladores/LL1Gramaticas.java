package compiladores;

import java.util.*;

public class LL1Gramaticas {
            public ClaseEvalGramaticas c; //necesario
            public HashMap<String,HashMap<String,String[]>> tablaLL1; //para crear la tabla de tamaño dinamico, importante usar array de strings en lugar de hashset
            public String sigma=""; //Nueva cadena a analizar
            public AnalizadorLexico analex; //Para cuando se pongan los tokens crear un AFD
            public AFD automataDeterminista;
            public Stack<String> pila;
            public Object[][] data;
            public int contador=0;
            
            
            public LL1Gramaticas(ClaseEvalGramaticas g){
                c = g;
                tablaLL1 = new HashMap<>();
                pila = new Stack<>();
            }
            
            public void setAFD(AFD automataDeterminista){
                this.automataDeterminista = automataDeterminista;
            }
            
            public void setSigma(String sigma){
                this.sigma = sigma;
            }
            
            public void setAnalizadorLexico(){
                analex = new AnalizadorLexico(this.automataDeterminista,this.sigma);
            }
            
            public void imprimeTablaLL1(){
                
                System.out.print("\t");
                for(String x:c.Vt) System.out.print(x+" ");
                System.out.print("\n");
                
                tablaLL1.forEach((key,value)->{
                    System.out.print(key+": ");
                    //System.out.print(" |");
                    value.forEach((key1,value1)->{
                        System.out.print(" |");
                        for(String s: value1){
                            System.out.print(" "+s+" ");
                        }
                        System.out.print(" |");
                    });
                    //System.out.print(" |");
                    System.out.print("\n");
                });
                return;
            }
            
            public void armarTablaLL1(){
                c.Vt.add("$");
                /*c.Vt.add("ParIzq");
                c.Vt.add("ParDer");
                c.Vt.add("or");
                c.Vt.add("CerrPos");
                c.Vt.add("CerrKleen");
                c.Vt.add("CorchDer");
                c.Vt.add("CorchIzq");
                c.Vt.add("simb");
                c.Vt.add("guion");
                c.Vt.add("AND");
                c.Vt.add("Opc");*/
                //Armamos la parte de los terminales (la más sencilla)
                
                
                for(String s: c.Vn){
                    HashMap<String,String[]> temp = new HashMap<>();
                    String[] arregloString = new String[1];
                    arregloString[0] = "-1";
                    for(String s1 : c.Vt) temp.put(s1,arregloString);
                    tablaLL1.put(s, temp);
                }
                
                for(int i=0;i<c.NumReglas;i++){
                    //Calculo el first
                    HashSet<String> prueba = c.First(c.Reglas[i].lista);
                    HashMap<String,String[]> temp = new HashMap<>();
                    int ii=0;
                    String[] reglas = new String[c.Reglas[i].lista.lista.size()];                    
                    for(NodoArreglo nd : c.Reglas[i].lista.lista) {reglas[ii] = nd.c;ii++;}
                    System.out.print("\n");
                    
                    if(!prueba.contains("epsilon")){
                        for(String s : prueba){
                            temp = tablaLL1.get(c.Reglas[i].s.c);
                            temp.put(s,reglas);
                            tablaLL1.put(s, temp);
                        }
                        
                    }
                    else{
                        //System.out.println(c.Reglas[i].s.c);
                        prueba.clear();
                        prueba = c.Follow(c.Reglas[i].s.c);
                        //for(String s : prueba) System.out.print(s+ " ");
                        for(String s : prueba){
                            temp = tablaLL1.get(c.Reglas[i].s.c);
                            temp.put(s,reglas);
                            tablaLL1.put(s, temp);
                        }
                    }
                    System.out.print("\n");
                }
                    for(String s: c.Vt){
                    HashMap<String,String[]> temp = new HashMap<>();
                    String[] arregloString = new String[1];
                    arregloString[0] = "-1";
                    String[] arregloString1 = new String[1];
                    arregloString1[0] = "pop";
                    String[] arregloString2 = new String[1];
                    arregloString2[0] = "aceptar";
                    for(String s1 : c.Vt) temp.put(s1, arregloString);
                    temp.put(s, arregloString1);
                    if(s.equals("$")) temp.put(s, arregloString2);
                    tablaLL1.put(s, temp);
                }
                imprimeTablaLL1();
            }
            
            public boolean AnalisisConLL1(){
                data = new Object[1000][3];
                int l=0;
                pila.clear();
                pila.push("$");
                pila.push(c.Reglas[0].s.c);
                String A="";
                int Token1; 
                while(!pila.isEmpty()){
                    if(pila.peek().equals("aceptar")){ this.contador = l; return true;}
                    //System.out.println("Tope de pila: " + pila.peek());
                    System.out.println("Pila entera: " + pila.toString());
                    //System.out.println("Cadena por analizar: "+ analex.CadenaXAnalizar());
                    A = pila.peek();
                    Token1 = analex.yylex();
                    analex.undoToken();
                    if(c.Vt.contains(A)){
                        int i;
                        boolean flag = false;
                        for(i=0;i<c.NumReglas;i++){
                            if(flag) break;
                            for(NodoArreglo N : c.Reglas[i].lista.lista){
                                if(flag) break;
                                if(N.esTerminal && N.token == Token1){
                                    data[l][0] = pila.toString(); data[l][1] = analex.CadenaXAnalizar(); data[l][2] = "pop";
                                    l++;
                                    pila.pop();
                                    analex.yylex();
                                    flag = true;
                                    //data[l][0] = pila.toString(); data[l][1] = analex.CadenaXAnalizar(); data[l][2] = "pop";
                                    //l++;
                                    break;
                                }
                            }
                        }
                        if(A.equals("$") && analex.CadenaXAnalizar().isEmpty()){
                            data[l][0] = pila.toString(); data[l][1] = analex.CadenaXAnalizar(); data[l][2] = "aceptar";
                            l++;
                            pila.pop();
                            pila.add("aceptar");
                            flag = true;
                        }
                        if(!flag){System.out.println("Mori en 3"); return false;}
                    }
                    else if(c.Vn.contains(A)){
                        //if(!analex.CadenaXAnalizar().isEmpty()) System.out.println("Voy a buscar en: "+pila.peek()+" con el terminal " +analex.CadenaXAnalizar().charAt(0));
                        //else System.out.println("Voy a buscar en: "+pila.peek()+" con el terminal" +" cadena vacía :v");
                        String renglon="";
                        String[] reglas;
                        int i;
                        //System.out.println("Token actual: " + Token1);
                        if(!analex.CadenaXAnalizar().isEmpty()){
                            for(i=0;i<c.NumReglas;i++){
                                for(NodoArreglo N : c.Reglas[i].lista.lista){
                                    if(N.token == Token1){
                                        renglon = N.c;
                                    }
                                }
                            }
                        reglas =this.tablaLL1.get(A).get(renglon);
                        }
                        else reglas = this.tablaLL1.get(A).get("$");
                            if(!reglas[0].equals("-1")){
                                if(!reglas[0].equals("epsilon")){ data[l][0] = pila.toString(); data[l][1] = analex.CadenaXAnalizar(); data[l][2] = A+" -> "+Arrays.toString(reglas);}
                                else{ data[l][0] = pila.toString(); data[l][1] = analex.CadenaXAnalizar(); data[l][2] = "epsilon";}
                                l++;
                                pila.pop();
                                if(!reglas[0].equals("epsilon")) for(int j=reglas.length-1;j>=0;j--) pila.add(reglas[j]);
                            }
                        
                        else {System.out.println("Mori en 4"); return false;}
                    }
                    else {System.out.println("Mori en 5"); return false;}
                }
                return false;
            }
            
}
