package mementodemo;

/**
 * Ejemplo del Patrón de Comportamiento: Memento
 *
 * @author https://sourcemaking.com/design_patterns/memento/java/1
 */
public class MementoDemo {
    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();//Donde se guardan los mementos.
        Originator originator = new Originator();//Donde se crean los mementos.

        originator.setState("State1");//Settea State1
        originator.setState("State2");//Reemplaza el State1 por State2
        caretaker.addMemento(originator.save());//Guarda el memento con State2

        originator.setState("State3");//Settea State3
        caretaker.addMemento(originator.save());//Guarda el memento con State3

        originator.setState("State4");//Settea State4
        originator.restore(caretaker.getMemento());//Restaura al State3

        originator.setState("State5");//Settea State3
        originator.restore(caretaker.getMemento());//Restaura al State2
    }
}
