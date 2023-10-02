package wantedpreonboardingbackend.JobRecruit.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
public class Enterprise {
    private Long ep_sequence_id = 0L;
    private String ep_id;
    private String ep_pw;
    private String epname;
    private String ep_country;
    private String ep_region;

    public void setEp_sequence_id(Long ep_sequence_id) {
        this.ep_sequence_id = ep_sequence_id;
    }
}
