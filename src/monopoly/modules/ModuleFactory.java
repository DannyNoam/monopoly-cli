package monopoly.modules;

import java.util.HashMap;

import com.google.inject.AbstractModule;

public class ModuleFactory {
    
    private final static HashMap<String, AbstractModule> modules = new HashMap<>();
    
    private ModuleFactory() {}

    static {
        modules.put("dice-module", new DiceModule());
        modules.put("player-module", new PlayerModule());
    }
    
    public static AbstractModule get(String name) {
        return modules.get(name);
    }
}
