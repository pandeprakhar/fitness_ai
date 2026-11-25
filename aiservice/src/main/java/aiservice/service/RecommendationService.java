package aiservice.service;

import aiservice.controller.recommendation;
import aiservice.model.Recommendation;
import aiservice.repository.recommendationrepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RecommendationService {
    private final recommendationrepository recommendationrepository;

    public List<Recommendation> getUserRecommendation(String userId){
        return recommendationrepository.findByUserId(userId);


    }
    public Recommendation getActivityRecommendation(String activityId){
        return recommendationrepository.findByActivityId(activityId)
                .orElseThrow(()-> new RuntimeException("No recommendation Activity was found"));
    }
}
