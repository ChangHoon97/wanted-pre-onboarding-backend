package wantedpreonboardingbackend.JobRecruit.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
public class Enterprise {
    private Long enterprise_sequence_id;
    private String enterprise_id;
    private String enterprise_pw;
    private String name;
    private String country;
    private String region;

    public Enterprise(String enterprise_id, String enterprise_pw, String name, String country, String region) {
        this.enterprise_id = enterprise_id;
        this.enterprise_pw = enterprise_pw;
        this.name = name;
        this.country = country;
        this.region = region;
    }
}
