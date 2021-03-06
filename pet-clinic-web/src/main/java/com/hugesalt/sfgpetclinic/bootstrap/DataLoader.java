package com.hugesalt.sfgpetclinic.bootstrap;

import com.hugesalt.sfgpetclinic.model.Owner;
import com.hugesalt.sfgpetclinic.model.Vet;
import com.hugesalt.sfgpetclinic.services.OwnerService;
import com.hugesalt.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
//beacuse this is implementing commandlinerunner spring knows to run this when it can on startup
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService){
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jon");
        vet2.setLastName("Don");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
