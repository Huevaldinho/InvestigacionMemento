package mementodemo;

/**
 *  Captura del estado actual.
 * @author https://sourcemaking.com/design_patterns/memento/java/1
 */
class Memento {

    private String state;

    //Guarda el estado del memento.
    public Memento(String state) {
        this.state = state;
    }

    //Obtiene el estado del memento.
    public String getState() {
        return state;
    }
}
