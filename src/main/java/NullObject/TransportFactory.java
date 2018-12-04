package NullObject;

public class TransportFactory {
    public static final String[] names = {"BMW", "Mercedes", "Audi"};
    public static final String[] models = {"X3", "C", "A7"};

    public static AbstractTransport getTransport(String name, String model) throws Exception {
        if (names.length == models.length){
            for (int i = 0; i < names.length; i++) {
                if (names[i].equalsIgnoreCase(name) && models[i].equalsIgnoreCase(model)){
                    return new RealCarTransport(name, model);
                }
            }
        }else {
            throw new Exception();
        }
        return new NullCarTransport();
    }
}
