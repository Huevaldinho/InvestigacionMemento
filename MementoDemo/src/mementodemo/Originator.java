package mementodemo;

/**
 * Clase encargada de crear los mementos.
 * @author https://sourcemaking.com/design_patterns/memento/java/1
 */
class Originator {

    private String state;

    public void setState(String state) {
        System.out.println("Originator: Setting state to " + state);
        this.state = state;
    }

    //Crea memento
    public Memento save() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(state);
    }

    //Restaura el estado al memento entrante.
    public void restore(Memento m) {
        state = m.getState();
        System.out.println("Originator: State after restoring from Memento: " + state);
    }
}
