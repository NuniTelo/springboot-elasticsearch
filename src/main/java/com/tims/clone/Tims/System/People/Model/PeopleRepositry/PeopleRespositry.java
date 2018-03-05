package com.tims.clone.Tims.System.People.Model.PeopleRepositry;

import com.tims.clone.Tims.System.People.Model.PeopleModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PeopleRespositry extends ElasticsearchRepository<PeopleModel, String> {
}
