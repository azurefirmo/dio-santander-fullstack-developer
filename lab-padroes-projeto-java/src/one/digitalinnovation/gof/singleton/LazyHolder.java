package one.digitalinnovation.gof.singleton;

public class LazyHolder {
    private static class Holder {
        public static LazyHolder instancia = new LazyHolder();
    }

    private LazyHolder() {
        super();
    }

    public static LazyHolder getInstance() {
        return Holder.instancia;
    }
}
