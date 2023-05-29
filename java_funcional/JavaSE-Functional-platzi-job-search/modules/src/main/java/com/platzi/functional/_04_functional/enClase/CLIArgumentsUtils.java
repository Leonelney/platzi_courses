package com.platzi.functional._04_functional.enClase;

import com.platzi.functional._04_functional.enClase.CLIArguments;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtils {
    static void showHelp(CLIArguments cliArguments){
        // consume un objeto o diferentes objetos para realizar operaciones sobre ellos
        Consumer<CLIArguments> consumerHelper = cliArguments1 -> {
            if (cliArguments1.isHelp()) System.out.println("Manual solicitado");
        };

        consumerHelper.accept(cliArguments);
    }

    static CLIArguments generateCLI(){
        // provee de un tipo de dato sin recibir nada
        Supplier<CLIArguments> generator = () -> new CLIArguments();
        return generator.get();
    }
}
