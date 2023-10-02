package wantedpreonboardingbackend.JobRecruit.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
public class User {
    private Long user_sequence_id = 0L;
    private String user_id;
    private String user_pw;


    public void setUser_sequence_id(Long user_sequence_id) {
        this.user_sequence_id = user_sequence_id;
    }
}
