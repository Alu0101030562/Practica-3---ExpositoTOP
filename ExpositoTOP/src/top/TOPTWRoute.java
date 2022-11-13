/**
 * @file TOPTWRoute.java
 * @author Francisco Javier Garcia Gonzalez
 * @date 10/11/2022
 * @par Clase TOPTWRoute
 */
package top;

/**
 * @brief Clase TOPTWRoute, contiene los metodos de la clase TOPTWRoute
 */
public class TOPTWRoute {
    int predecessor;
    int succesor;
    int id;
    
    /**
    * @brief Contructor por defecto de la clase TOPTWRoute.
    */
    TOPTWRoute() {
        
    }
    /**
    * @brief Contructor que inicializa las variables.
    * @param pre - predecesor.
    * @param succ - sucesor.
    * @param id - identificador.
    */
    TOPTWRoute(int pre, int succ, int id) {
        this.predecessor = pre;
        this.succesor = succ;
        this.id = id;
    }
    
    /**
     * @brief Metodo getter que obtiene el predecesor.
     * @return devuelve el valor del predecesor.
     */
    public int getPredeccesor() {
        return this.predecessor;
    }
    
    /**
     * @brief Metodo getter que obtiene el sucesor.
     * @return devuelve el valor del sucesor.
     */
    public int getSuccesor() {
        return this.succesor;
    }
    
    /**
     * @brief Metodo getter que obtiene el identificador.
     * @return devuelve el valor del identificador.
     */
    public int getId() {
        return this.id;
    }
    
    /**
     * @brief Metodo setter que instancia el predecesor
     * @param pre - valor del predecesor.
     */
    public void setPredeccesor(int pre) {
        this.predecessor = pre;
    }
    
    /**
     * @brief Metodo setter que instancia el sucesor
     * @param suc - valor del sucesor.
     */
    public void setSuccesor(int suc) {
        this.succesor = suc;
    }
    
    /**
     * @brief Metodo setter que instancia el identificador
     * @param id - valor del identificador.
     */
    public void setId(int id) {
        this.id = id;
    }
}
