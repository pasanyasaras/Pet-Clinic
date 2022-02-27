package pasanyasara.projects.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pasanyasara.projects.petclinic.model.Owner;
import pasanyasara.projects.petclinic.model.Vet;
import pasanyasara.projects.petclinic.services.OwnerService;
import pasanyasara.projects.petclinic.services.VetService;
import pasanyasara.projects.petclinic.services.map.OwnerServiceMap;
import pasanyasara.projects.petclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Pasan");
        vet2.setLastName("Yasara");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
