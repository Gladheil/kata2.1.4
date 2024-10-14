package koschei.models;

public class Duck5 {
    private final Egg6 egg;

    public Duck5(Egg6 egg6) {
        egg = egg6;
    }

    @Override
    public String toString() {
        return ", в утке яйцо " + egg.toString();
    }
}
