package guru.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerServices ownerServices;

    public DataLoader() {
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
