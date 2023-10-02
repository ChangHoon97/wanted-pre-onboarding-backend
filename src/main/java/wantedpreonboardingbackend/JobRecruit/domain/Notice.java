package wantedpreonboardingbackend.JobRecruit.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Notice {
    private Long nt_id;
    private Long ep_id;
    private String nt_position;
    private int nt_compensation;
    private String nt_content;
    private String nt_skill;
    private String nt_country;
    private String nt_region;

    public void setNt_id(Long nt_id) {
        this.nt_id = nt_id;
    }
}
