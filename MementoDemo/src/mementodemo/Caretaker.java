package mementodemo;

import java.util.Stack;

/**
 * Clase encargada de guardar los mementos.
 *
 * @author https://sourcemaking.com/design_patterns/memento/java/1
 */
class Caretaker {

    //Lista para guardar los mementos 
    //(modificado para usar con Stack en vez de ArrayList).
    private Stack<Memento> mementos = new Stack<>();

    //Guarda el memento en el topo de la pila.
    public void addMemento(Memento m) {
        mementos.push(m);
    }

    //Extrae el memento del tope de la pila (ultimo agregado).
    public Memento getMemento() {
        if (!mementos.isEmpty()) {
            return mementos.pop();
        }
        return null;
    }
}
