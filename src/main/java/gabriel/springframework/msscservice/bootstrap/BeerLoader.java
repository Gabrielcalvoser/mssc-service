package gabriel.springframework.msscservice.bootstrap;

import gabriel.springframework.msscservice.domain.Beer;
import gabriel.springframework.msscservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects(){
        if(beerRepository.count() ==0){
           beerRepository.save(Beer.builder()
                    .beerName("Heineken")
                    .beerStyle("IPA")
                    .quantityToBrew(250)
                    .upc(3370010000001L)
                    .price(new BigDecimal("12.95"))
                    .build());

           beerRepository.save(Beer.builder()
                    .beerName("Mahou")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(250)
                    .upc(3370010000002L)
                    .price(new BigDecimal("10.80"))
                    .build());

           beerRepository.save(Beer.builder()
                    .beerName("San Miguel")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(250)
                    .upc(3370010000003L)
                    .price(new BigDecimal("8.20"))
                    .build());
        }
    }
}
