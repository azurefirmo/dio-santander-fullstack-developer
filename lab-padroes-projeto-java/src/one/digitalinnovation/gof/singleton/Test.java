package one.digitalinnovation.gof.singleton;

public class Test {
    Lazy lazyInst = Lazy.getInstancia();
        System.out.println(lazyInst);
    lazyInst =Lazy.getInstancia();
        System.out.println(lazyInst);
        System.out.println("\n");
    Eager eagerInst = Eager.getInstancia();
        System.out.println(eagerInst);
    eagerInst =Eager.getInstancia();
        System.out.println(eagerInst);
        System.out.println("\n");
    LazyHolder lazyHolderInst = LazyHolder.getInstance();
        System.out.println(lazyHolderInst);
    lazyHolderInst =LazyHolder.getInstance();
        System.out.println(lazyHolderInst);
}
