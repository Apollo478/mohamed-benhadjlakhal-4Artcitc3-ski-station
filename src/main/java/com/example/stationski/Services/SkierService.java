package com.example.stationski.Services;

import com.example.stationski.Entity.Skier;
import com.example.stationski.Repositories.SkierRepository;
import com.example.stationski.Repositories.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkierService {
   private final SkierRepository skierRepository ;
    private final SubscriptionRepository subscriptionRepository ;
   @Autowired
   public SkierService(SkierRepository skierRepository,SubscriptionRepository subscriptionRepository) {
       this.skierRepository = skierRepository;
       this.subscriptionRepository = subscriptionRepository;
   }
    public List<Skier> retrieveAllSkier() {
        return skierRepository.findAll();
    }
    public Skier addSkier(Skier skier) {
        if(skier.getSubscription()==null){
            throw new IllegalArgumentException("skeir must have a subscription");
        }
        var sub = skier.getSubscription();
        sub.setSkier(skier);
        var sk= skierRepository.save(skier);
        //subscriptionRepository.save(sub);
        return sk;
    }
    public Skier updateSkier(Skier skier) {
        if(skier.getSubscription()==null){
            throw new IllegalArgumentException("skeir must have a subscription");
        }
        return skierRepository.save(skier);
    }
    public Skier retrieveSkier(long id) {
        return skierRepository.findById(id).orElse(null);
   }
}
