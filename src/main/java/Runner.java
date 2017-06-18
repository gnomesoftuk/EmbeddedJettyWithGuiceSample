import com.google.inject.Guice;
import com.google.inject.Injector;
import infrastructure.HttpPetModule;
import sample.PetModule;
import sample.PetService;

public class Runner {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new PetModule(), new HttpPetModule());

        PetService petService = injector.getInstance(PetService.class);

        petService.process("1");

    }
}
