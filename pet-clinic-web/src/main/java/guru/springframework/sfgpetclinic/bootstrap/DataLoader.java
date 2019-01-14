package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    public DataLoader() {
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
